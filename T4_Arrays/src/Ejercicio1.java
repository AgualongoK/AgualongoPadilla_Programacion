import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<String> listaPalabras = new ArrayList();
        int indice = 1;

        listaPalabras.add("Afganistán");
        listaPalabras.add("Bolivia");
        listaPalabras.add("Colombia");
        listaPalabras.add("Dinamarca");
        listaPalabras.add("Estonia");
        listaPalabras.add("Finlandia");
        listaPalabras.add("Groenlandia");
        listaPalabras.add("Hungría");
        listaPalabras.add("Irán");
        listaPalabras.add("Jamaica");

        for (Object item: listaPalabras) {
            System.out.println(indice + ".- " + item);
            indice++;
        }
    }
}
