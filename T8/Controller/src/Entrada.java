import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        /*  EJERCICIO: crear en Desktop una carpeta Ficheros que contenga:
        * 1.-Ficheros{fichero1_1.txt, fichero1_2.txt}
        * 2.-Ficheros2{fichero2_1.txt, fichero2_2.txt,
        *       Ficheros3{fichero3_1.txt, fichero3_2.txt}}
        * 3.-Fichero.txt
        *
        * Mediante un menú interactivo, recorrer el contenido de cada uno y una 4ta opción que
        * liste el directorio padre.
        * Nota: los ficheros .txt no se pueden reccorrer, entonces saltará un mensaje ("No se puede, es un fichero")
        * */

        FicherosController ficherosController = new FicherosController();

        File carpetaFicheros = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");

        File carpetaFicheros1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1");
        File docFicheros1_1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\fichero1_1.txt");
        File docFicheros1_2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros1\\fichero1_2.txt");


        File carpetaFicheros2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2");
        File docFicheros2_1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\ficheros2_1.txt");
        File docFicheros2_2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\ficheros2_2.txt");
        File carpetaFicheros3 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\Ficheros3");
        File docFicheros3_1 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\Ficheros3\\ficheros3_1.txt");
        File docFicheros3_2 = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\Ficheros2\\Ficheros3\\ficheros3_2.txt");

        File docFicheros = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero.txt");

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("0.-Salir");
            System.out.println("1.-Ficheros1");
            System.out.println("2.-Ficheros2");
            System.out.println("3.-Fichero.txt");
            System.out.println("4.-Listar directorio padre");
            System.out.println("¿Cual quieres listar?");
            opcion = entrada.nextInt();

            if(opcion == 1){
                ficherosController.listarArchivos(carpetaFicheros1);
            }
            if(opcion == 2){
                ficherosController.listarArchivos(carpetaFicheros2);
            }
            if(opcion == 3){
                ficherosController.listarArchivos(docFicheros);
            }


        } while (opcion!=0);

        System.out.println("Saliendo del programa...");

        /*
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero1.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros_nuevo");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.getInfoFile();

        ficherosController.getDirectoryInfo(directory); */

    }
}
