import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int opcion = 0;
        int aleatorio = (int)(Math.random()*5);
        int contadorIntentos = 0;

        System.out.println("Vamos a jugar a adivinar un número. El número está situado entre 0 y 100");

        do{
            try{
                System.out.println("Introduce un numero");
                Scanner valor = new Scanner(System.in);
                opcion = valor.nextInt();

                if(opcion < 0){
                        throw new MiExcepcion("Número inferior a 0");
                }
            }catch (InputMismatchException | MiExcepcion e){
                System.out.println("Introduzca solo números positivos");
            }finally {
                contadorIntentos++;
            }
        }while (opcion != aleatorio);

        System.out.println("¡Enhorabuena! El número era " + aleatorio + ". Has adivinado el número en "+ contadorIntentos +" intentos");
    }
}
