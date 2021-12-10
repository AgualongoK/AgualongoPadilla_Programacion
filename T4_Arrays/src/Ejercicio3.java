import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<String> listaClase = new ArrayList();

        listaClase.add("Raúl");
        listaClase.add("Borja");
        listaClase.add("Jesús");
        listaClase.add("Aitana");
        listaClase.add("Lucía");
        listaClase.add("Loli");
        listaClase.add("María");
        listaClase.add("Jorge");
        listaClase.add("Héctor");
        listaClase.add("Hugo");
        listaClase.add("Fernando");
        listaClase.add("Angie");
        listaClase.add("Camila");
        listaClase.add("Ariana");
        listaClase.add("Zayn");

        int aleatorio = (int)(Math.random()* listaClase.size());

        System.out.println(listaClase.get(aleatorio));
    }
}
