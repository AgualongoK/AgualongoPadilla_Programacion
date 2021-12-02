package ArraysMultidimensionales;

import java.util.Locale;

public class TratamientoPalabras {
    public static void main(String[] args) {

        String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
        System.out.println(palabraTratar.toUpperCase());
        String palabraComparar = "Esto es un ejemplo";
        // Para comparar dos Strings se usa .equals
        if (palabraTratar.toLowerCase().equals(palabraComparar.toLowerCase())) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        System.out.println(fraseCompleta.length());

        //saber cuantas palabras hay
        String[] palabras = fraseCompleta.split(" ");
        System.out.println("El numero de palabras es: " + palabras.length);

        //contar cuantas letras hay
        int letrasTotales = 0;
        for (String caracteres : palabras) {
            letrasTotales += caracteres.length();

        }
        System.out.println("El numero total de letras es: " + letrasTotales);

        System.out.println(fraseCompleta.replaceAll(" ", "").length());

        // cuando se realice una modificación, hay que guardarlo de nuevo en la variable

        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' ') {
                System.out.println(fraseCompleta.charAt(i));
            }
        }
        System.out.println(fraseCompleta.indexOf("w"));

        String correo = "borja.martin@cesjuanpablosegundo.es";
        String nombre= correo.substring(0, correo.indexOf("@"));
        String dominio = correo.substring(correo.indexOf("@")+1, correo.length());
        System.out.println(nombre);
        System.out.println(dominio);
    }
}
