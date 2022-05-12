import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JsonController jsonController = new JsonController();
        Scanner respuesta = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("0. Salir");
            System.out.println("1. Ver peliculas cartelera");
            System.out.println("2. Ver próximos estrenos");
            System.out.println("3. Guardar películas en un fichero");
            opcion = respuesta.nextInt();

            if(opcion == 1){
                jsonController.verPeliculasCartelera();
            }

            if(opcion == 2){
                jsonController.verPeliculasProximamente();
            }
            if(opcion == 3){

            }
        }while(opcion!=0);

        System.out.println("Hasta luego!");
    }


}
