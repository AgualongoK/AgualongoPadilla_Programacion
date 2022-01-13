import java.util.Enumeration;
import java.util.Hashtable;

public class PracticaHT {
    public static void main(String[] args) {

        Hashtable<Object,Object> listaElementos= new Hashtable();

        listaElementos.put("1","Elemento 1");
        listaElementos.put("2","Elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1", "Cosa 2", "Cosa 3"});

        System.out.println("Listado completo:");
        Enumeration<Object> listaClaves = listaElementos.keys();
        while (listaClaves.hasMoreElements()){
            // hay elemento siguiente
            Object clave = listaClaves.nextElement();
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);
        }
    }
}
