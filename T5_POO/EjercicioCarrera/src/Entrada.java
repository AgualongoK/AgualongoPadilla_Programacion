public class Entrada {

    public static void main(String[] args) {

        Coche cocheA = new Coche();
        Coche cocheB = new Coche("BMW i4", "1234ABC", 300);

        System.out.println("Mostrando datos: ");
        cocheA.mostrarDatos();
        System.out.println("Mostrando datos: ");
        cocheB.mostrarDatos();

        cocheA = new Coche("Audi A7", "3456DFG", 350);


    }
}
