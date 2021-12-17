import java.util.ArrayList;
import java.util.Hashtable;

public class ListasHash {
    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        // sacar el tamaño de la lista:
        listaElementos.size();
        // guardar cosas en una lista:
        listaElementos.put("1","Elemento 1");
        listaElementos.put("2","Elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1","Cosa 2","Cosa 3"});
        // obtener elementos del hashtable
        listaElementos.get("4");

        // obtener elemento y modificar valor
        String[] elementoEncontrado = (String[]) listaElementos.get("4");
        elementoEncontrado[0] = "Nuevo valor";

        // borrar un elemento
        listaElementos.remove("1");

    }
}
