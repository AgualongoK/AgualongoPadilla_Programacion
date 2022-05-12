import java.io.*;
import java.util.ArrayList;

public class FileController {

    public void leerFichero(){
        File file = new File("src/resources/fichero_cifrado.txt");
        String cadena;

        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while((cadena = bufferedReader.readLine())!=null){
                System.out.println(cadena);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int linea;
            while((linea = bufferedReader.read())>-1){
                linea = linea/2;
                System.out.print(Character.toChars(linea));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
