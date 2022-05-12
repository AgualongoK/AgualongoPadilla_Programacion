package Ejercicio2;

import Ejercicio2.model.Personaje;

import java.io.File;
import java.io.*;
import java.util.ArrayList;

public class FileController {

    public void leerFichero(){
        File file = new File("src/resources/personajes_vf.bin");
        String cadena;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Object o = ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while((cadena = bufferedReader.readLine())!=null){
                //System.out.println(cadena);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
