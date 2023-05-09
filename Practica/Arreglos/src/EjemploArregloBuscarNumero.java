import java.security.SecureRandom;
import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();
        int[] numeros = new int[10];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = aleatorio.nextInt(100);
        }
        System.out.println("Arreglo Actual");
        for (int numero : numeros){
            System.out.print(numero + "," + " ");
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("ingrese el número a buscar ");
        int numero = entrada.nextInt();

        int contador = 0;
        while (contador < numeros.length && numeros[contador] != numero ){
            contador++;
        }
        
        if (contador == numeros.length){
            System.out.println("No se encontró el numero buscado");
        } else if (numeros[contador] == numero) {
            System.out.println("Se encontró el numero buscado en la posición: " + contador);
        }

    }
}
