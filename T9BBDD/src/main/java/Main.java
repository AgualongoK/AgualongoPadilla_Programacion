import controller.ControllerBD;
import database.SchemeDB;
import models.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main implements SchemeDB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, continuar = null;
        int edad = 0;

        ControllerBD controllerBD = new ControllerBD();

        //controllerBD.insertarAlumnoPrepare();

        //controllerBD.modificarEdad();
       /* do{
            System.out.println("Introduce nombre:");
            nombre = scanner.next();
            System.out.println("Introduce apellido:");
            apellido = scanner.next();
            System.out.println("Introduce edad:");
            edad = scanner.nextInt();

            Alumno alumno = new Alumno(nombre, apellido,edad);
            controllerBD.insertarAlumnoStatement(alumno);
            System.out.println("Quieres continnuar? (S/N)");
            continuar = scanner.next();
        }while(continuar.equalsIgnoreCase("s")); */

        controllerBD.imprimirAlumnos();
    }
}
