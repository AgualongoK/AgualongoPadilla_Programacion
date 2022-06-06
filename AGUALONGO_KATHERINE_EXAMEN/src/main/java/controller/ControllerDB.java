package controller;

import database.SchemaDB;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.Scanner;

public class ControllerDB {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void getConnection() {
        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = SchemaDB.USER;
        String pass = SchemaDB.PASSWORD;

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs + "?" + "user=" + user + "&password=" + pass;

        try {
            connection = DriverManager.getConnection(newConnectionURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertarFacturas() {


        String urlString = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connectionHTTP = (HttpURLConnection) url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connectionHTTP.getInputStream()));

            StringBuffer stringBuffer = new StringBuffer();

            String linea = null;

            while ((linea = bufferedReader.readLine()) != null) {
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultados = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                String id = objetoResultado.getString("_id");
                String company = objetoResultado.getString("company");
                String phone = objetoResultado.getString("phone");
                String pais = objetoResultado.getString("country");
                int total = objetoResultado.getInt("invoice");


                getConnection();
                statement = connection.createStatement();

                String query = String.format("INSERT INTO %s (%s, %s, %s,%s,%s) VALUES ('%s','%s','%s','%s',%d)", SchemaDB.TAB_FACTURA, SchemaDB.COL_ID, SchemaDB.COL_COMP,
                        SchemaDB.COL_PAIS, SchemaDB.COL_TELEFONO, SchemaDB.COL_TOTAL, id, company, pais, phone, total);

                int numeroRow = statement.executeUpdate(query);
                System.out.println(numeroRow);


            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }

    public void buscarTotal() {
        Scanner respuesta = new Scanner(System.in);
        int total;

        try {
            getConnection();
            statement = connection.createStatement();
            System.out.println("Introduzca el total a buscar: ");
            total = respuesta.nextInt();
            String query = String.format("SELECT * FROM %s WHERE %s >= %d", SchemaDB.TAB_FACTURA, SchemaDB.COL_TOTAL, total);
            ResultSet rows = statement.executeQuery(query);
            while (rows.next()) {
                String id = rows.getString(SchemaDB.COL_ID);
                String compania = rows.getString(SchemaDB.COL_COMP);
                String pais = rows.getString(SchemaDB.COL_PAIS);
                String telefono = rows.getString(SchemaDB.COL_TELEFONO);
                int totalConsulta = rows.getInt(SchemaDB.COL_TOTAL);

                System.out.printf("ID: %s  Compania: %s  Pais: %s  Telefono: %s  Total: %d \n ", id, compania, pais, telefono, totalConsulta);

                //EL insertado está comentado porque me daba error y no sabía como solucionarlo
                /* String query2 = String.format("INSERT INTO %s(%s,%s,%s,%s,%s) VALUES ('%s','%s','%s','%s',%d)", SchemaDB.TAB_FILT, SchemaDB.COL_ID, SchemaDB.COL_COMP,
                        SchemaDB.COL_PAIS, SchemaDB.COL_TELEFONO, SchemaDB.COL_TOTAL, id, compania, pais, telefono, total);
                ResultSet rows2 = statement.executeQuery(query2);*/
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        closeConnection();
    }

    public void buscarPais() {
        Scanner respuesta = new Scanner(System.in);
        String pais;

        try {
            getConnection();
            statement = connection.createStatement();
            System.out.println("Introduzca el pais a buscar: ");
            pais = respuesta.next();

            String query = String.format("SELECT * FROM %s WHERE %s = '%s'", SchemaDB.TAB_FACTURA, SchemaDB.COL_PAIS, pais);
            ResultSet rows = statement.executeQuery(query);
            while (rows.next()) {
                String id = rows.getString(SchemaDB.COL_ID);
                String compania = rows.getString(SchemaDB.COL_COMP);
                String paisConsulta = rows.getString(SchemaDB.COL_PAIS);
                String telefono = rows.getString(SchemaDB.COL_TELEFONO);
                int totalConsulta = rows.getInt(SchemaDB.COL_TOTAL);

                System.out.printf("ID: %s  Compania: %s  Pais: %s  Telefono: %s  Total: %d \n ", id, compania, paisConsulta, telefono, totalConsulta);

                //EL insertado está comentado porque me daba error y no sabía como solucionarlo
                /*String query2 = String.format("UPDATE %s SET (%s = '%s', %s = '%s', %s = '%s', %s = '%s', %s = %d)", SchemaDB.TAB_FILT, SchemaDB.COL_ID, id, SchemaDB.COL_COMP,
                        compania, SchemaDB.COL_PAIS, paisConsulta, SchemaDB.COL_TELEFONO, telefono, SchemaDB.COL_TOTAL, totalConsulta);
                 ResultSet rows2 = statement.executeQuery(query2);*/

            }   } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        closeConnection();
    }
}