package practica;

import java.security.SecureRandom;

public class LlenarArregloConOtroDos {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();
        int[] numeros = new int[6];

        for (int indice = 0; indice < numeros.length ; indice++) {
            numeros[indice] = aleatorio.nextInt(100);
        }

        for (int numero : numeros){
            System.out.println("arreglo numeros= " + numero);
        }
            int auxiliar = 0;
        int[] numerosDos = new int[numeros.length] ;
        for (int numero : numeros){
            if (numero % 2 == 0 ){
                numerosDos[auxiliar++] = numero;
            }
        }

        for (int numero : numerosDos){
            System.out.println("numero = " + numero);
        }
    }
}
