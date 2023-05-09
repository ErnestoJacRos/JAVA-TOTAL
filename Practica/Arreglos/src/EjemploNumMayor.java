import java.util.Scanner;

public class EjemploNumMayor {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 numeros enteros");
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = entrada.nextInt();
        }
        int max = 0;
        for (int indice = 0; indice < numeros.length; indice++) {
            max = (numeros[max] > numeros[indice]) ? max : indice;
        }
        System.out.println("numero mayor del arreglo es: " + numeros[max]);
    }
}
