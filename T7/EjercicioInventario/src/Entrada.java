public class Entrada {

    public static void main(String[] args) {

        Silla silla = new Silla("Roble",5,100,4);

        Carne filete = new Carne("Superior", "Galicia", 100, 50);

        Mesa mesa = new Mesa("Roble", 20, 300, 6);

        Lacteo leche = new Lacteo("Premium", "Asturias", 50, 100);

        Supermercado<Alimento> supermercadoAlimentos =  new Supermercado<>();
        supermercadoAlimentos.anadirGenero(filete);
        supermercadoAlimentos.anadirGenero(leche);

        Supermercado<Mueble> supermercadoMuebles = new Supermercado<>();
        supermercadoMuebles.anadirGenero(silla);
        supermercadoMuebles.anadirGenero(mesa);

        Supermercado<Inventariable> supermercadoGenerico = new Supermercado<>();
        supermercadoGenerico.anadirGenero(silla);
        supermercadoGenerico.anadirGenero(mesa);
        supermercadoGenerico.anadirGenero(leche);
        supermercadoGenerico.anadirGenero(filete);

    }
}
