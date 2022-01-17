public class Entrada {
    public static void main(String[] args) {

        Motor motorGasoil = new Motor(150, 10000);
        Motor motorGasolina = new Motor(120, 500);

        Coche cocheGasolina = new Coche("Ford", "Fiesta", new Motor(120, 500));
        Coche cocheGasoil = new Coche("BMW", "218d Gran Coupé", new Motor(150, 1000));

        // imprimimos el valor por defecto del precio de las averías que posteriormente serán acumulables
        // System.out.println(cocheGasolina.getPrecioAverias());

        Garaje garaje= new Garaje();
        // coche = null // numcoches=0// averia=null

        if(garaje.aceptarCoche(cocheGasoil, "aceite")){
            System.out.println("Coche aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosDeAceite());;
        }else {
            System.out.println("Garaje ocupado");
        }

    }
}
