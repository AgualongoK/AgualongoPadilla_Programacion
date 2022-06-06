package controller;

import database.SchemeDB;

import java.sql.*;

public class ControllerBD {

    Connection connection;
    public void getConnection(){

        try {
            connection = (Connection)DriverManager.getConnection(SchemeDB.URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConnection(){
        try {
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarPerfiles(){
        getConnection();
        Statement statement = null;
        try {
           statement = connection.createStatement();
           String query = "INSERT INTO %s(%s) VALUES ('Gerente')";
           statement.execute(String.format(query, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));

           String query2 = "INSERT INTO %s(%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));

            String query3 = "INSERT INTO %s(%s) VALUES ('Director')";
            statement.execute(String.format(query3, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            closeConnection();
        }
    }

    public void insertarUsuarios(){
        getConnection();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) " + "VALUES (?,?,?,?,?)";
        String queryFormat = String.format(query, SchemeDB.TAB_USUARIOS, SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO, SchemeDB.COL_TELEFONO,SchemeDB.COL_PAIS, SchemeDB.COL_FK_ID);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(queryFormat);
            preparedStatement.setString(1,"Heide-Marie");
            preparedStatement.setString(2,"Rausch");
            preparedStatement.setInt(3,2145024);
            preparedStatement.setString(4,"Holanda");
            preparedStatement.setInt(5,1);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void addUserIndividual(){

    }
}
