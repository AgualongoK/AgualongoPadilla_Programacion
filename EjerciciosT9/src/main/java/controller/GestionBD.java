package controller;

import database.SchemeBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionBD {

    private Connection connection;
    private Statement statement;

    public void conectarBBDDD(){
        String host = SchemeBD.URL_SERVER;
        String database = SchemeBD.DB_NAME;
        String user = "root";
        String password = "admin";

        String newConnectionURL = "jdbc:mysql://" + host + "/" + database + "?" +  "user=" + user + "&password=" + password;

        try {
            connection = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println("Conectado exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarPerfiles(){
        conectarBBDDD();
        String nombre = "trabajador";
        String nombre2 = "director";
        String nombre3 = "gerente";

        try {
            statement = connection.createStatement();
            String queryFormateada = String.format("INSERT INTO %s (%s) VALUES ('%s')", SchemeBD.TAB_PERF,SchemeBD.COL_NOM_PERF,nombre);
            String queryFormateada2 = String.format("INSERT INTO %s (%s) VALUES ('%s')", SchemeBD.TAB_PERF,SchemeBD.COL_NOM_PERF,nombre2);
            String queryFormateada3 = String.format("INSERT INTO %s (%s) VALUES ('%s')", SchemeBD.TAB_PERF,SchemeBD.COL_NOM_PERF,nombre3);
            int numeroRow = statement.executeUpdate(queryFormateada);
            int numeroRow2 = statement.executeUpdate(queryFormateada2);
            int numeroRow3 = statement.executeUpdate(queryFormateada3);
            System.out.println(numeroRow + numeroRow2 + numeroRow3);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }


}
