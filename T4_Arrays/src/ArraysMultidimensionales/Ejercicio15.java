package ArraysMultidimensionales;

public class Ejercicio15 {

    public static void main(String[] args) {

        // escribimos object para permitir la entrada de valores de todo tipo
        Object[][] alumnos = new Object[3][5];

        alumnos[0][0] = "Borja";
        alumnos[0][1]=6;
        alumnos[0][2]=5;
        alumnos[0][3]=7;
        alumnos[0][4]=false;

        alumnos[1][0] = "Pedro";
        alumnos[1][1]=4;
        alumnos[1][2]=7;
        alumnos[1][3]=9;
        alumnos[1][4]=true;

        alumnos[2][0] = "Jose";
        alumnos[2][1]=7;
        alumnos[2][2]=1;
        alumnos[2][3]=2;
        alumnos[2][4]=true;

        String nombre = (String) alumnos[0][0];
        double media = ((double) (int) alumnos[0][1] + (int) alumnos[0][2] + (int)alumnos[0][3]);
        boolean conv = (boolean)alumnos[0][alumnos[0].length-1];

        if(conv){
            System.out.printf("%s tiene una media de %.2f y tiene asignaturas cv", nombre, media);
        }else {
            System.out.printf("%s tiene una media de %.2f y no tiene asignaturas cv", nombre, media);
        }
    }
}
