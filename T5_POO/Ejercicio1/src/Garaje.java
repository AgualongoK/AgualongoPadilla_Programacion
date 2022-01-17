public class Garaje {

    private Coche coche;
    private String averia;
    private int numeroCoches;

    //constructor por defecto se da por escrito
    public void devolverCoche(){
        this.coche = null;
    }

    public boolean aceptarCoche(Coche coche, String averia) {
        if (this.coche != null) {
            return false;
        } else {
            numeroCoches++;
            this.coche = coche;
            if(averia.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitrosDeAceite(coche.getMotor().getLitrosDeAceite()+10);
            }else{
                coche.getMotor().setLitrosDeAceite(coche.getMotor().getLitrosDeAceite()+(int)Math.random()*1000);
            }
            return true;
        }
    }
}