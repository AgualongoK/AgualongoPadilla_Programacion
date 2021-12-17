import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioBase {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        Hashtable<String,Object[]> listaCoches = new Hashtable();

        Object[] coche = new Object[]{"4567U","Mercedes","C220"};

        listaCoches.put(coche[0].toString(), coche);
        listaCoches.put("1234A", new Object[]{"2345B","Mercedes","C220"});
        listaCoches.put("3456C", new Object[]{"3456C","BMW","i8"});

        System.out.println(listaCoches.size());

        // Pedir matrícula a buscar, sacar los datos del coche encontrado
        //Si no se encuentra, emitir aviso

        System.out.println("Introduzca la matrícula del coche a formar (formato: 1111X): ");
       String cocheDeseado = valor.next();

       if(listaCoches.get(cocheDeseado)!=null){
           for(Object item : listaCoches.get(cocheDeseado)){
               System.out.println(item);
           };
       }else{
           System.out.println("No está en la lista");
       }
    }
}
