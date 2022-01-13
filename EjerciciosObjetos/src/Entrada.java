import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int opcion = 0;
        int opcionTriangulo = 0;
        do{
            System.out.println("Elija una opción:");
            System.out.println("1.- Trabajar con triángulos");
            System.out.println("2.- Trabajar con círculos");
            System.out.println("3.- Trabajar con cuadrados");
            opcion = valor.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduzca la base y la altura: ");
                    Triangulo triangulo1 = new Triangulo(valor.nextInt(), valor.nextInt());
                    do{
                        System.out.println("¿Qué operación quieres realizar?");
                        System.out.println("1.- Calcular área");
                        System.out.println("2.- Mostrar datos");
                        opcionTriangulo = valor.nextInt();

                        switch (opcionTriangulo){
                            case 1:
                                // enlazar con el metodo calcularArea
                                break;
                            case 2:
                                // mostrar los datos
                                break;
                        }
                    }while (opcionTriangulo !=0);
                    break;
            }
        }while(opcion!=0);
    }
}

