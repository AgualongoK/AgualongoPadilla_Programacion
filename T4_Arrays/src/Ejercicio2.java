import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList(10);
        int suma = 0, media = 0, maximo = -99999, minimo = 99999;
        int indice = 1;

        for (int i = 0; i < 10; i++) {
            listaNumeros.add((int)(Math.random()*101));
            suma = listaNumeros.get(i) + suma++;

            if(maximo < listaNumeros.get(i)){
                maximo = listaNumeros.get(i);
            }
            if(minimo > listaNumeros.get(i)){
                minimo = listaNumeros.get(i);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + indice + ": " + listaNumeros.get(i));
            indice++;

        }

        media = suma/listaNumeros.size();

        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El máximo es: " + maximo);
        System.out.println("El mínimo es: "+ minimo);

        /* Otra manera de sacar el máximo y el mínimo de una colección
        * Collections.sort(listaNumeros);
        * Collections.max(listaNumeros);
        * Collections.min(listaNumeros);
        * */
    }
}
