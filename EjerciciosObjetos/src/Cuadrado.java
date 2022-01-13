public class Cuadrado {

    int base, altura;
    double area, perimetro;

    public Cuadrado(){

    }

    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(int base, int altura, double area){
        area = (double)base * (double)altura;
    }

    public void calcularPerimetro(double area, int base, double perimetro){
        perimetro = (2*area + 2*base);
    }
}
