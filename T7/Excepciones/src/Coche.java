import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Coche {

    public void metodoUno(){
        try {
            File file = new File("");
            FileWriter fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error en fichero");
        }
    }

    public void meotodoDos(boolean acierto){
        if(acierto){
            System.out.println("Pasado un true");
        }else{
            throw new NullPointerException();
        }
    }
}
