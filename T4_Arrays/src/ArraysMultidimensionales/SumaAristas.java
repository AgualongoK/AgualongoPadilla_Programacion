package ArraysMultidimensionales;

import java.util.Scanner;

public class SumaAristas {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int filas, columnas;
        int sumatorioFila1=0, sumatorioFilaN=0, sumatorioColumna1=0, sumatorioColumnaN=0;
        int numerosAleatorios[][];
        System.out.println("Cuántas filas tendrá el array: ");
        filas = valor.nextInt();
        System.out.println("Cuántas columnas tendrá el array: ");
        columnas = valor.nextInt();
        numerosAleatorios = new int[filas][columnas];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            //recorro la fila i
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                // recorro la columna j
                numerosAleatorios[i][j] = (int)(Math.random() * 21);
                System.out.print(  numerosAleatorios[i][j] + "\t ");
            }
            System.out.println();
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (i==0){
                    sumatorioFila1 += numerosAleatorios[i][j];
                }
                if (i==filas-1){
                    sumatorioFilaN += numerosAleatorios[i][j];
                }
                if(j==0){
                    sumatorioColumna1 += numerosAleatorios[i][j];
                }
                if(j==columnas-1){
                    sumatorioColumnaN += numerosAleatorios[i][j];
                }
            }
        }

        int numeroFila = 0;
        for(int[] item : numerosAleatorios){

            //primera fila
            if(numeroFila==0){

                for(int columna : item){
                    if(numeroFila==0){
                    sumatorioFila1 += columna;
                }

                    if (numeroFila ==filas-1){
                        sumatorioFila1 += columna;
                    }
                //última fila

                //primera columna

                //última columna

                numeroFila++;

                }
            }
        }

        System.out.println("Suma de la primera fila: " +sumatorioFila1);
        System.out.println("Suma de la última fila: " +sumatorioFilaN);
        System.out.println("Suma de la primera columna: " +sumatorioColumna1);
        System.out.println("Suma de la última columna: " +sumatorioColumnaN);
    }
}
