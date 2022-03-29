import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<Idioma> listaIdiomas = new ArrayList<>();

        Idioma castellano = new Idioma("Castellano", 100000) {
            @Override
            public void saludar() {
                System.out.println("Hola");
            }

            @Override
            public void despedir() {
                System.out.println("Adiós");
            }
        };

        Idioma ingles = new Idioma("Inglés", 10000) {
            @Override
            public void saludar() {
                System.out.println("Hello");
            }

            @Override
            public void despedir() {
                System.out.println("Goodbye");
            }
        };

        Idioma aleman = new Idioma("Aleman", 30000) {
            @Override
            public void saludar() {
                System.out.println("Hallo");
            }

            @Override
            public void despedir() {
                System.out.println("Tschüss");
            }
        };

        castellano.ingresarPalabra("Amistad");
        castellano.ingresarPalabra("Bondad");
        castellano.ingresarPalabra("Castillo");
        castellano.ingresarPalabra("Delfín");

        ingles.ingresarPalabra("Friendship");
        ingles.ingresarPalabra("Goodness");
        ingles.ingresarPalabra("Castle");
        ingles.ingresarPalabra("Dolphin");

        aleman.ingresarPalabra("Freundschaft");
        aleman.ingresarPalabra("Güte");
        aleman.ingresarPalabra("Schloss");
        aleman.ingresarPalabra("Delfin");

        listaIdiomas.add(castellano);
        listaIdiomas.add(ingles);
        listaIdiomas.add(aleman);

        for (Idioma item : listaIdiomas) {
            System.out.println("El saludo en " + item.getNombre() + " es: ");
            item.saludar();
            System.out.println("\n");
        }

        for (Idioma item : listaIdiomas) {
            System.out.println("La despedida en " + item.getNombre() + " es: ");
            item.despedir();
            System.out.println("\n");
        }

        for (Idioma item: listaIdiomas) {
            System.out.println("Palabras del idioma " + item.getNombre());
            for (String item2 : item.getPalabras()) {
                System.out.println(item2);
            }
            System.out.println("\n");

        }
    }
}