import java.util.Scanner;

public class EjemploArregloDesplazarPosicionElejida {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        int elemento, posicion;
        for (int indice = 0; indice < numeros.length - 1; indice++) {
            System.out.print("ingrese un numero: ");
            numeros[indice] = entrada.nextInt();
        }
        System.out.println();
        System.out.println("Digite el nuevo elemento");
        elemento = entrada.nextInt();
        System.out.println("Digite en que posición desea agregarlo en un rango del 0-9");
        posicion = entrada.nextInt();
        for (int indice = numeros.length - 2; indice >= posicion; indice--) {
            numeros[indice + 1 ] = numeros[indice];
        }

        numeros[posicion] = elemento;
        for (int numero : numeros){
            System.out.print(numero + ", ");
        }
    }
}
