public final class Carne extends Alimento {

    private int proteina;


    public Carne(String calidad, String origen, double precio, int proteina) {
        super(calidad, origen, precio);
        this.proteina =  proteina;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteína: "+ proteina);
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }
}
