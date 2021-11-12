public class Ejercicio1Arrays {

    public static void main(String[] args) {

        // meter en un array de 15 posiciones, 15 números aleatorios entre 0 - 50

        int aleatorios = (int)(Math.random()*51);
        int[] array = new int[15];
        int longitudArray = array.length;
        int numerosPares=0, numerosImpares=0;

        for (int i = 0; i < longitudArray; i++) {

            array [i] = (int)(Math.random()*51);
            System.out.println(array[i]);
        }
        // una vez generados los numeros, indicar cuantos pares e impares hay en la coleccion
        for (int i = 0; i < 15 ; i++) {
            if(array[i] % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Hay " + numerosPares + " números pares en el array");
        System.out.println("Hay " + numerosImpares + " números impares en el array");

        System.out.println("La posición 0 corresponde al número " + array[0]);

    }
}
