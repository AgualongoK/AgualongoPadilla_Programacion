public class Entrada {

    public static void main(String[] args) {
        Coche coche = new Coche("Mercedes", "c220", 2000, 300);
        Coche.Motor motor1 = coche.new Motor(400, 4000);
        coche.mostrarDatos();
    }
}
