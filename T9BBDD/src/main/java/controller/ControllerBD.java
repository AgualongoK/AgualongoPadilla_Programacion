package controller;

import database.SchemeDB;
import models.Alumno;

import java.sql.*;
import java.util.Scanner;

public class ControllerBD {

    private Connection conn;
    // No comprueba tipos
    private Statement statement;
    private Scanner scanner;
    private PreparedStatement preparedStatement;


    public void getConnection() {

        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "admin";

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            //Driver de mysql, no es necesario ponerlo ya que está instalado x defecto
            //Class.forName("com.mysql.cj.jdbc.Driver");

            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            // System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarAlumnoStatement() {
        String nombre = "Luis";
        String apellido = "Perez";
        int edad = 31;
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Borja','Martin',38)
        try {
            getConnection();
            statement = conn.createStatement();
            // String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Borja','Martin',38)";
            String queryFormateada = String.format("INSERT INTO alumnos (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.COL_NOM, SchemeDB.COL_APE, SchemeDB.COL_EDAD, nombre, apellido, edad);
            int numeroRow = statement.executeUpdate(queryFormateada);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoStatement(Alumno alumno) {
        String nombre = alumno.getNombre();
        String apellido = alumno.getApellido();
        int edad = alumno.getEdad();
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Borja','Martin',38)
        try {
            getConnection();
            statement = conn.createStatement();
            // String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Borja','Martin',38)";
            String queryFormateada = String.format("INSERT INTO alumnos (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.COL_NOM, SchemeDB.COL_APE, SchemeDB.COL_EDAD, alumno.getNombre(), alumno.getApellido(), alumno.getEdad());
            // int numeroRow = statement.executeUpdate(queryFormateada);

            if(statement.executeUpdate(queryFormateada) > 0){
                System.out.println("Alumno insertado correctamente");
            }
            // System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoPrepare(){
        String nombre = "Rosa";
        String apellido = "Fernandez";
        int edad = 29;

        String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES (?,?,?)";
        try {
            getConnection();
            // no ejecuta la query --> la deja preparada
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3,edad);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void modificarEdad(){
        Scanner respuesta = new Scanner(System.in);
        int edad;
        String usuario;
        String query = String.format("UPDATE alumnos SET edad=? where nombre=?");

        try {
            getConnection();
            System.out.println("Introduzca el nombre del usuario a modificar ");
            usuario = respuesta.next();
            System.out.println("Introduzca la nueva edad: ");
            edad = respuesta.nextInt();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,edad);
            preparedStatement.setString(2,usuario);
            preparedStatement.executeUpdate();

            if(preparedStatement.executeUpdate()>0){
                System.out.println("Se ha modificado la edad");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }

        System.out.println("Se han actualizado usuarios");
    }

    public void borrarElemento(int edad) {
        String query = "DELETE FROM %s WHERE %s < ?";

        /*
        * String query = "UPDATE alumnos" +
                "SET edad = 30, " +
                "WHERE nombre = 'Borja'";
        *
        * */

        getConnection();
        try {
            preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALU,
                    SchemeDB.COL_EDAD));
            preparedStatement.setInt(1, edad);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Los borrar afectados son " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    
}
