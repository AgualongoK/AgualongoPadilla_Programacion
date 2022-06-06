import controller.ControllerDB;
import controller.FicherosController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FicherosController ficherosController = new FicherosController();
        ControllerDB controllerDB = new ControllerDB();
        //controllerDB.insertarFacturas();
        Scanner valor = new Scanner(System.in);
        int opcion= 0;


        do{
            System.out.println("0.Salir" + "\n"  + "1.Buscar por total" + "\n" + "2.Buscar por pais");
            opcion = valor.nextInt();

            if(opcion == 1){
                controllerDB.buscarTotal();
            }

            if(opcion == 2){
                controllerDB.buscarPais();
            }
        }while (opcion!=0);


        System.out.println("Hasta luego");



    }
}
