import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    // CONSTRUCTOR

    public Agenda(){
        listaPersonas = new ArrayList();
    }

    public void listar(){
        for (Persona item : listaPersonas) {
            item.mostrarDatos();
        }
    }

    public void añadirPersona(Persona persona){
        listaPersonas.add(persona);
    }


}
