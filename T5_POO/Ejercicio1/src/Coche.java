import javax.management.monitor.StringMonitor;

public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double precioAverias;

    public void Coche(String marca, String modelo){
        this.marca = "BMW";
        this.modelo = "serio 8 Gran Coupé";
    }
    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acumularAveria(double costeAveria){
        this.precioAverias += costeAveria;
    }

    public Motor getMotor(){
        return motor;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecioAverias(){
        return precioAverias;
    }

}
