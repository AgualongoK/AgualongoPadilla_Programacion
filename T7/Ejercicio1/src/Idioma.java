import java.util.ArrayList;

public abstract class Idioma {

    private String nombre;
    private int numeroHablantes;
    private ArrayList<String> palabras;

    public Idioma(){}
    public Idioma(String nombre, int numeroHablantes){
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        palabras =  new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }

    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabra){
        palabras.add(palabra);
    }

    public void listarPalabras(){
        System.out.println("Las palabras en "+ nombre +" son: ");
        for (String item: palabras) {
            System.out.println(item);
        }
    }
}
