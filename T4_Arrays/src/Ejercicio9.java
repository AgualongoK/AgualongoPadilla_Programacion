import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int palabrasGenerar;
        System.out.println("Cuantras palabras quieres generar: ");
        palabrasGenerar = teclado.nextInt();

        for (int i = 0; i < palabrasGenerar; i++) {
            System.out.println("Palabra "+i);

            System.out.println("Cuantas letras tiene la palabra:");
            int letras = teclado.nextInt();
            String palabra = "";
            for (int j = 0; j < letras; j++) {
                char letraAleatoria = abecedario[(int)(Math.random()*abecedario.length)];
                palabra += letraAleatoria;
            }
            System.out.println(palabra);
        }
    }
}
