package ArraysMultidimensionales;

public class Ejercicio12 {
    public static void main(String[] args) {
        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = { "Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};
        String[] numerosSalidos1 = new String[bombo1.length];
        String[] numerosSalidos2 = new String[bombo2.length];
        int aleatorioUno = 0;
        int aleatorioDos = 0;

        for (int i = 0; i < bombo1.length; i++) {
            aleatorioUno= (int)(Math.random()* bombo1.length);
            aleatorioDos = (int)(Math.random()* bombo1.length);
            String equipoGenerado1 = bombo1[aleatorioUno];
            String equipoGenerado2 = bombo2[aleatorioDos];

            for(int x = 0; x<numerosSalidos1.length; x++){
                if(equipoGenerado1.equalsIgnoreCase(numerosSalidos1[i])){
                    aleatorioUno = (int)(Math.random()*bombo1.length);
            }

            System.out.println(bombo1[aleatorioUno]+"-"+bombo2[aleatorioDos]);
        }
    }
}
}