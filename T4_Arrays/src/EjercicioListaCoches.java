import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioListaCoches {
    public static void main(String[] args) {

        // 1.-Añadir coches, pedir datos, añadir a la lista
        // 2.-Lista coches
        // 3.-Buscar coche, pide matrícula
        // 4.-Mostrar costes
        // 5.-Eliminar coche, pide matrícula
        // 6.-Vaciar garaje

        Scanner valor = new Scanner(System.in);
        ArrayList<Object[]> garaje = new ArrayList();
        int opcion = valor.nextInt();
        int matricula = 0, caballos = 0, busquedaCoche = 0, cocheEliminado = 0;
        String marca = "", modelo = "";
        Object[] coche = new Object[]{matricula, marca, modelo, caballos};
        do{
            System.out.println("Bienvenido, introduzca la acción que desea realizar: ");
            System.out.println("0.-Salir");
            System.out.println("1.-Añadir coche al garaje");
            System.out.println("2.-Mostrar contenido del garaje");
            System.out.println("3.-Buscar coche");
            System.out.println("4.-Mostrar coste");
            System.out.println("5.-Eliminar coche");
            System.out.println(" 6.-Vaciar garaje");
            opcion = valor.nextInt();
            System.out.println("");

            switch (opcion){
                case 0:
                    System.out.println("¡Hasta luego!");
                break;

                case 1:

                    System.out.println("Indique la matrícula del coche que quiere añadir: ");
                    matricula = valor.nextInt();

                    System.out.println("Indique la marca del coche: ");
                    marca = valor.next();

                    System.out.println("Indique el modelo del coche: ");
                    modelo = valor.next();

                    System.out.println("Indique el número de CV del coche: ");
                    caballos = valor.nextInt();

                    garaje.add(coche);

                    System.out.println("Coche añadido correctamente");
                break;

                case 2:
                    for (Object[] lista: garaje) {
                        System.out.println("Matrícula: " + coche[0] + "   Marca: " + coche[1] + "   Modelo: " + coche[2] + "   CV: " + coche[3]);
                    }
                break;

                case 3:
                    System.out.println("Introduzca la matrícula del coche que desea buscar: ");
                    busquedaCoche = valor.nextInt();

                    for (Object[] busqueda : garaje) {
                        if(coche[0].equals(busquedaCoche)){
                            for(Object item : garaje){
                                System.out.println(item + "\t");
                            }
                            System.out.println("");
                        }
                    }
                break;

                case 4:
                    System.out.println("Introduzca la matricula del coche que desea eliminar: ");
                    cocheEliminado = valor.nextInt();
                break;

            }
        }while (opcion > 0);

    }
}
