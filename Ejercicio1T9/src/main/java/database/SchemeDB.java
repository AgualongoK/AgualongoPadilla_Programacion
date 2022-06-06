package database;

public interface SchemeDB {

    String DTBS = "Empresa2";
    String USER = "root";
    String PASSWORD = "admin";
    String HOST = "127.0.0.1:3306";
    String URL = "jdbc:mysql://" + HOST + "/" + DTBS+ "?" +  "user=" + USER + "&password=" + PASSWORD;
    String TAB_PERFILES = "perfiles";
    String TAB_USUARIOS = "usuario";
    String COL_ID = "id";
    String COL_NOMBRE = "nombre";
    String COL_APELLIDO= "apellido";
    String COL_TELEFONO = "telefono";
    String COL_SUELDO = "sueldo";
    String COL_PAIS = "pais";
    String COL_FK_ID = "id_perfil";

}
