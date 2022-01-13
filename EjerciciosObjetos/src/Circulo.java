public class Circulo {

    double radio, area, diametro;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public void calcularArea(double area, double radio){
        double pi = 3.1416;
        area = pi * (Math.pow(radio, 2));
    }

    public void calcularDiametro(double diametro, double radio){
        diametro = 2 * radio;
    }
}
