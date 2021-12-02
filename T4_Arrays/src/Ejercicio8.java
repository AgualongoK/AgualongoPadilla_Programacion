import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String palabraMax = "";
        String palabraMin="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String frase = "Esto es una frase para poder trabajar con el ejercicio numero 8";
        String [] palabras = frase.split(" ");

        for (String item: palabras) {

            if(item.length() > palabraMax.length()){
                palabraMax = item;
            }
            if(item.length() < palabraMin.length()){
                palabraMin = item;
            }
            if(item.length() == 4){
                System.out.printf("La palabra  <%s>  tiene 4 caracteres \n", item);
            }
        }
        System.out.println("La palabra más larga es: "+palabraMax);
        System.out.println("La palabra más corta es: "+ palabraMin);
    }
}

