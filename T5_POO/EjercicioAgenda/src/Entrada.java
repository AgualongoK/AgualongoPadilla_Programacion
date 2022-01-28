import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Persona persona1 = new Persona("Borja","Matin",600123456);
        Scanner valor = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("---AGENDA---");
            System.out.println("0.-Salir");
            System.out.println("1.-Agregar persona");
            System.out.println("2.-Borrar persona");
            System.out.println("3.-Editar persona");
            System.out.println("4.-Buscar persona");
            System.out.println("5.-Listar agenda");
            System.out.println("Introduzca una opción: ");
            opcion = valor.nextInt();

            switch (opcion){
                case 1:
                    agenda.anadirPersona(persona1);
                    agenda.anadirPersona(new Persona("Luis","Baroja",700123456));
                    break;

                case 2:
                    System.out.println("Introduzca el DNI de la persona que desea eliminar: ");
                    agenda.borrarPersona(valor.next());
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case  5:
                    agenda.listar();
                    break;
            }
        }
        while(opcion!=0);

        System.out.println("Hasta luego!");
    }
}
