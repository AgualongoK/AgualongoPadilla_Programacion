public class Motor {

    private int litrosDeAceite, CV;

    public Motor(int CV, int litrosDeAceite){
        this.CV = CV;
        this.litrosDeAceite = litrosDeAceite;
    }

    public void  setLitrosDeAceite(int litrosDeAceite){
        this.litrosDeAceite = litrosDeAceite;
    }

    public int getLitrosDeAceite(){
        return litrosDeAceite;
    }
    public int getCV(){
        return CV;
    }
}
