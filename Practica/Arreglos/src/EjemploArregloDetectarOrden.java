import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese siete números enteros");
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = entrada.nextInt();
        }
        boolean ascendente = false,
                descendente = false;


        for (int indice = 0; indice < numeros.length - 1; indice++) {
            if (numeros[indice] > numeros[indice + 1]){
                    descendente = true;
            }
            if (numeros[indice] < numeros[indice + 1]){
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true){
            System.out.println("Arreglo está desordenado");
        }
        if (ascendente == false && descendente == false){
            System.out.println("Arreglo: todos son iguales");
        }

        if (ascendente == true && descendente == false){
            System.out.println("Arreglo: ordenado de forma ascendente");
        }

        if (ascendente == false && descendente == true){
            System.out.println("Arreglo: ordenado de forma descendente");
        }



    }
}
