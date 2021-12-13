import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Object[] coche1 = new Object[]{"Mercedes", "c220", 250};
        Object[] coche2 = new Object[]{"Audi","A5", 350};
        Object[] coche3 = new Object[]{"VW", "Arteon", 180};
        Object[] coche4 = new Object[]{"Mercedes", "Benz Clase C", 170};
        Object[] coche5 = new Object[]{"Audi", "Q3", 150};
        Object[] coche6 = new Object[]{"VW", "Golf", 150};
        Object[] coche7 = new Object[]{"Ford", "GT", 656};
        Object[] coche8 = new Object[]{"Ford","Focus",150};
        ArrayList<Object[]> listaCoches = new ArrayList();

        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);
        listaCoches.add(coche5);
        listaCoches.add(coche6);
        listaCoches.add(coche7);
        listaCoches.add(coche8);

        // obtener coches

        Object[] cocheSeleccionado = listaCoches.get(0);
        // System.out.println(cocheSeleccionado[1]);

        /*for (int i = 0; i < listaCoches.size(); i++) {
            cocheSeleccionado = listaCoches.get(i);
            System.out.println("Marca: " + cocheSeleccionado[0] + "  Modelo: " + cocheSeleccionado[1] + "  CV: " + cocheSeleccionado[2]);
        }*/

        int posicion = 0;
        for (Object item: listaCoches) {
            cocheSeleccionado = listaCoches.get(posicion);
            System.out.println("Marca: " + cocheSeleccionado[0] + "  Modelo: " + cocheSeleccionado[1] + "  CV: " + cocheSeleccionado[2]);
            posicion++;
        }

        // otra manera de sacar los valores del ArrayList con for each

        /*
        for(Object[] coche : listaCoches) {
            System.out.println("Marca: " + coche[0] + " Modelo: " + coche[1] + " CV: " + coche[2]);
        }
         */

        // Qué marca quieres buscar

        // Me dará todos los datos de coches cuya marca es Mercedes

        System.out.println("");
        Scanner valor = new Scanner(System.in);
        String busquedaDeseada = "";
        System.out.println("¿Qué modelo quieres buscar?");
        busquedaDeseada = valor.next();

        for (Object[] coche: listaCoches) {

            if(coche[0].toString().equals(busquedaDeseada)){
                System.out.println(coche + "\t");
            }
            System.out.println();
        }
    }
}
