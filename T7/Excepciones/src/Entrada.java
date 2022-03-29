import java.io.FileWriter;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

        String palabra="Hola";
        String[] palabras =  new String[]{"Uno","Dos","Tres","Cuatro"};
        try{
            System.out.println(palabra.length());
            System.out.println(palabras[1]);
            System.out.println(palabras[5]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("La palabra es nula");
        }
        finally {
            System.out.println("Ejecucion obligatoria");
        }

        System.out.println("Bloque final");


        Coche coche = new Coche();
        coche.metodoUno();

    }
}
