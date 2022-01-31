public class Coche {

    // VARIABLES
    private int cv, velocidad;
    private String matricula, modelo;
    private double km;

    //CONSTRUCTORES
    public Coche(){
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.km = 0.0;
    }

    public Coche(String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.km = 0.0;
    }

    //MÉTODOS

    public void acelerar(int valor){
        this.velocidad = valor;
        this.km = velocidad * cv * (int)(Math.random()*11);
        if(velocidad > 180){
            this.velocidad = 180;
            System.out.println("Ha superado la velocidad máxima. Se ha reestablecido la velocidad a 180");
        }
    }

    public void frenar(int valor){
        this.velocidad = velocidad - valor;
        if(velocidad < 0){
            System.out.println("Ha superado la velocidad mínima. Se ha reestablecido la velocidad a 0");
            this.velocidad = 0;
        }
    }

    public void parar(){
        this.velocidad = 0;
    }

    public void resetear(){
        this.velocidad = 0;
        this.km = 0;
    }

    public void mostrarDatos(){
        System.out.println("Matrícula: "+ matricula + "  Modelo: " + modelo + "  CV: "+ cv + "  Velocidad: " + velocidad + "  Kilómetros: " + km);
    }

    //GETTERS Y SETTERS


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}

