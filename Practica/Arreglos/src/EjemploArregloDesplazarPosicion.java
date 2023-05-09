import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        int ultimo;
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("ingrese un numero: ");
            numeros[indice] = entrada.nextInt();
        }
        System.out.println();
        ultimo = numeros[numeros.length - 1];
        for (int indice = numeros.length - 2; indice >= 0; indice--) {
            numeros[indice + 1 ] = numeros[indice];
        }

        numeros[0] = ultimo;
        for (int numero : numeros){
            System.out.print(numero + ", ");
        }
    }
}
