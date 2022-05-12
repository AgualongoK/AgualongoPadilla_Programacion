import controller.GestionBD;

public class Main {

    public static void main(String[] args) {

        GestionBD gestionBD = new GestionBD();
        //gestionBD.conectarBBDDD();
        gestionBD.insertarPerfiles();
    }
}
