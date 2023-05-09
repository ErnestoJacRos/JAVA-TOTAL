import java.util.Scanner;

public class EjemploArregloDesplazarPosicionOrdenada {
    public static void main(String[] args) {
        int[] ns = new int[7];
        Scanner entrada = new Scanner(System.in);
        int elemento, posicion;
        /*ponemos menos un elemento en el for porque estamos dejando
        * un espacio vació*/
        for (int indice = 0; indice < ns.length - 1; indice++) {
            System.out.print("Digite un numero: ");
            ns[indice] = entrada.nextInt();
        }
       // Arrays.sort(ns);
        System.out.println();
        System.out.println("Numero que desea insertar: ");
        elemento = entrada.nextInt();

        posicion = 0;
        while (posicion < ns.length -1 && elemento > ns[posicion]){
            posicion++;
        }

        for (int indice = ns.length - 2; indice >= posicion ; indice--) {
            ns[indice + 1 ] = ns[indice];
        }

        ns[posicion] =elemento;
        System.out.println("nuevo arreglo ordenado");
        for (int indice = 0; indice < ns.length; indice++) {
            System.out.print(ns[indice] + ", ");
        }
    }
}
