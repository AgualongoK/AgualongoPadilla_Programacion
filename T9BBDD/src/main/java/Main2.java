import database.SchemeDB;

import java.sql.Connection;

public class Main2 implements SchemeDB {

    public static void main(String[] args) {

        // Creacion de db con datos implementados de una interfaz, para que en caso de realizar un cambio en la interfaz,
        // se actualicen en todas las clases que tengan implementada la interfaz.
        String host= SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "admin";
        Connection conn = null;

        // URL:  jdbc:mysql://127.0.0.:3306/colegio?user=root&password=admin
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
    }
}
