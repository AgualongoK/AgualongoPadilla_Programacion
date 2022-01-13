public class Triangulo {

    private int base, altura;

    public Triangulo(){

    }

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(int base, int altura){
        double area = (base * altura)/2;
    }
}
