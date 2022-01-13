import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Hashtable;

public class ElementosHash {

    public static void main(String[] args) {

        Hashtable<String, Object[]> listaCoches = new Hashtable();

        Object[] coche1 = new Object[]{"c220", 250, "ASD123"};
        Object[] coche2 = new Object[]{"A5", 350};
        Object[] coche3 = new Object[]{"Ford", "Focus", 123};
        Object[] coche4 = new Object[]{"Repro", 245};
        Object[] coche5 = new Object[]{"Ford", "Mondeo", 423};
        Object[] coche6 = new Object[]{"Ford", "Fiesta", 23};
        Object[] coche7 = new Object[]{"c180", 64};
        Object[] coche8 = new Object[]{"CLS", 456};
        Object[] coche9 = new Object[]{"EQS", 756};
        Object[] coche10 = new Object[]{"Q5", 123};
        Object[] coche11 = new Object[]{"Etron", 123};
        Object[] coche12 = new Object[]{"TROC", 7865};
        Object[] coche13 = new Object[]{"Golf", 423};


        listaCoches.put("Mercedes", coche1);
        listaCoches.put("Audi", coche2);
        listaCoches.put("VW", coche3);
        listaCoches.put("Arteon", coche4);
        listaCoches.put("Ford", coche5);
        listaCoches.put("Ford", coche6);
        listaCoches.put("Mercedes", coche7);
        listaCoches.put("Mercedes", coche8);
        listaCoches.put("Mercedes", coche9);
        listaCoches.put("Audi", coche10);
        listaCoches.put("Audi", coche11);
        listaCoches.put("VW", coche12);
        listaCoches.put("VW", coche13);

        System.out.println("Listado completo:");
        Enumeration<String> listaClaves = listaCoches.keys();
        while (listaClaves.hasMoreElements()) {
            // hay elemento siguiente
            Object clave = listaClaves.nextElement();
            Object elemento = listaCoches.get(clave);
            System.out.println(clave + "-" + elemento);
        }
    }
}
