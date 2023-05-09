package practica;

import java.security.SecureRandom;
import java.util.Arrays;

public class LlenarArregloConOtro {
    public static void main(String[] args) {
        int contador = 0;
        SecureRandom aleatorio = new SecureRandom();
        int[] arregloNumeros = new int[6];


        for (int indice = 0; indice < arregloNumeros.length; indice++) {
            arregloNumeros[indice] = aleatorio.nextInt(100);
        }


        Arrays.sort(arregloNumeros);

        

        for (int numero : arregloNumeros){
            System.out.println("numeroPrimerArreglo = " + numero);
        }


        int[] arregloDos = new int[6];
        int auxiliar = 0;
        for (int numero : arregloNumeros) {
            if (numero % 2 == 0) {
                contador++;
                arregloDos[auxiliar++] = numero;
            }
        }
        for (int numero : arregloDos){
            System.out.println("numero = " + numero);
        }
        System.out.println("contador = " + contador);
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));
    }
}
