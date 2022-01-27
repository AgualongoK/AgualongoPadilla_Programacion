import java.util.SortedMap;

public class Persona {

    // VARIABLES

    private String dni, nombre;
    private int telefono;


    // CONSTRUCTORES

    public  Persona(){}

    public Persona(String nombre, String dni, int telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }


    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // MÉTODO

    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("DNI: "+ dni);
        System.out.println("Telefono: " + telefono);
    }
}
