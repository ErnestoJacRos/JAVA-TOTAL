package pruebas;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class ArregloConLoop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduzca el numero de enteros del arreglo");
        int numero = entrada.nextInt();
        int [] arreglo = new int[numero];
        /* se lleno el arreglo  del 1 - 15*/
        for (int indice = 1; indice < arreglo.length; indice++) {
            arreglo[indice] = indice;
            System.out.println("arreglo = " + arreglo[indice]);
        }
        System.out.println();
        /*cada valor de indice se puso la doble y se sumo */
        System.out.println("Arreglo al cuadrado");

        int total = 0;

        for (int indice = 1; indice < arreglo.length ; indice++) {
            arreglo[indice] *= arreglo[indice];
            System.out.println(indice +" al cuadrado = " + arreglo[indice]);

            total += arreglo[indice];

        }
        System.out.println("total = " + total);

    }
}
