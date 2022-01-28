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
            System.out.println("Imprimiendo persona...");
            item.mostrarDatos();
        }
    }

    public void anadirPersona(Persona persona){
        listaPersonas.add(persona);
    }

    public void borrarPersona(String dni){

        for (int i = 0; i < listaPersonas.size(); i++) {
            if(dni.equalsIgnoreCase(listaPersonas.get(i).getDni())) ;
            {
                listaPersonas.remove(i);
            }
        }
        }
    }



