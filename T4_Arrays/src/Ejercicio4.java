import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Integer> listaPrimera= new ArrayList(20);
        ArrayList<Integer> listaSegunda = new ArrayList(20);
        int numIgual = 0;

        for (int i = 0; i < 20; i++) {
            listaPrimera.add((int)(Math.random()*101));
            System.out.println(listaPrimera.get(i));
        }
        for (int i = 0; i < 20; i++) {
            listaSegunda.add((int)(Math.random()*101));
            System.out.println(listaSegunda.get(i));
        }

        for (int i = 0; i < listaPrimera.size(); i++) {
            for (int j = 0; j < listaSegunda.size(); j++) {
                if(listaPrimera.get(i).equals(listaSegunda.get(j))){
                    numIgual++;
                }
            }
        }
        System.out.printf("Han habido %d números iguales", numIgual);
    }
}
