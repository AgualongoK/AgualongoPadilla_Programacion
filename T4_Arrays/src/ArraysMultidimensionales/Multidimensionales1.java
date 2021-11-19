package ArraysMultidimensionales;

public class Multidimensionales1 {

    public static void main(String[] args) {

        int[][] arrayMultiDiferente = {{1,2,3,4},{1,2,3},{4,5}};
        int[][] arrayMulti = new int[3][3];
        int arrayLongitud = arrayMulti.length;
        arrayMulti[0][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[1][2] = 6;

        for (int i = 0; i < arrayLongitud; i++) {
            // System.out.println(arrayMulti[i]);

            // estando en la fila
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println(arrayMulti[i][j]);

                //Hace que se muestre en forma de matriz por consola
                //System.out.print(arrayMulti[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
