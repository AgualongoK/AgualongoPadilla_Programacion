import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        // lista de cualquier tipo > OBJECT
        ArrayList listaCosas = new ArrayList();
        // para poder saber su tamaño
        int tamanio = listaCosas.size();


        // añado un elemento a la lista
        listaCosas.add(5);
        listaCosas.add("Borja");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        // System.out.println(listaCosas);
        String palabra = String.valueOf(listaCosas.get(1));
        System.out.println("El valor es: " + palabra);

        listaCosas.add(6);
        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add("Samantha");
        listaCosas.add(6);
        listaCosas.add(0.8);
        listaCosas.add(6);
        listaCosas.add(6);
        listaCosas.add("true");
        listaCosas.add(6);
        listaCosas.add(34567);
        listaCosas.add(6);

        tamanio = listaCosas.size();

        System.out.println(listaCosas);

        //Imprimir contenido con un for
        System.out.println("Índice: ");
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i + ".- " + listaCosas.get(i));
        }

        //Imprimir contenido con un for each
        int posiciones = 1;
        System.out.println("");
        for (Object item : listaCosas) {
            System.out.println(posiciones + ".- " + item);
            posiciones++;
        }

        //Buscar dentro de una lista la palabra "Samantha" y al encontrarla
        // imprimir 'palabra encontrada' y la posición de la misma

        posiciones = 0;
        for (Object item : listaCosas) {

            if(item.equals("Samantha")){
                System.out.println("\n Palabra encontrada en la posición " + posiciones);
            }
            posiciones++;
        }

        //otra manera de encontrar la posición de un elemento
        int posicionElemento = listaCosas.indexOf("Samantha");

        if(posicionElemento>-1){
            System.out.println("Palabra encontrada en la posición " + posicionElemento);
        }

        //Pedir por consola una palabra a buscar
        //en el caso que la palabra se encuentre en la lista
        //se modifica su valor por otro pedido por consola
        //en el caso de que la palabra no se encuentre en la lista
        //se agregará al final

        /*System.out.println("");
        String palabraDeseada = null;
        System.out.println("Indique la palabra que desea buscar: ");
        palabraDeseada = valor.next();

        System.out.println("***Buscando palabra***");

        int posicionPalabra = listaCosas.indexOf(palabraDeseada);
        if(posicionPalabra>-1){
            System.out.println("Palabra encontrada");
            System.out.println("Introduzca el valor por el que desea reemplazarlo: ");
            palabraDeseada = valor.next();
            System.out.println("Su palabra se ha modificado correctamente");
            listaCosas.set(posicionPalabra, palabraDeseada);
        }else {
            System.out.println("Palabra no encontrada");
            listaCosas.add(palabraDeseada);
            System.out.println("Se ha añadido correctamente");
        }
        System.out.println("");
        int indice = 1;
        for (Object item: listaCosas) {
            System.out.println(indice + ".- "+item);
            indice++;
        }

        //borrar un elemento de un ArrayList
        //recomendable no trabajar con objects dentro del .remove, si no, con posiciones

        /*System.out.println("El tamaño actual es de :"+ listaCosas.size());

        //elemento borrado con objeto
        //listaCosas.remove(new Integer(5)); --> dará error
        System.out.println(listaCosas);*/


        //eliminar todos los valores 6 del ArrayList
        System.out.println("Tamaño actual: "+ listaCosas.size());
        int posicionPalabra = listaCosas.indexOf(6);
        System.out.println("");

        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(6)){
                listaCosas.remove(i);
            }
        }
        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object item) {
                return item.equals(6);
            }
        });
    }
}

