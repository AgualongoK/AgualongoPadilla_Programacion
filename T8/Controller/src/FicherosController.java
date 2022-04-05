import java.io.File;
import java.io.IOException;

public class FicherosController {

    public FicherosController(){}

    public void getFileInfo(File file){
        System.out.println("Informacion de fichero: ");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero? " + file.isFile());
        System.out.println("Existe? "+ file.exists());
        System.out.println("Padre: "+ file.getParent());
        // System.out.println("Padre directorio: "+directory.getParent());
        System.out.println("Ruta relativa: "+file.getPath());
        System.out.println("Ruta absoluta: "+file.getAbsolutePath());

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getDirectoryInfo(File file){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero :ficheros) {
                System.out.println(fichero.getName());
            }

            /*for (String nombre: nombreFicheros) {
                System.out.println(nombre);
            }*/
        }
    }

    public void listarArchivos(File file){
        if(!file.isDirectory()){
            System.out.println("No se puede listar, es un fichero");
        }
        else{
            File[] archivos = file.listFiles();
            for (File item : archivos) {
                System.out.println(item.getName());
                if(item.isDirectory()){
                    File[] subArchivos = item.listFiles();
                    for (File items: subArchivos) {
                        System.out.println(items.getName());
                    }
                }
            }
        }
    }

    public void mostrarPadre(){}
}
