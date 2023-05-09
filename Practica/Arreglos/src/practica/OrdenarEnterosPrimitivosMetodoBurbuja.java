package practica;

import java.security.SecureRandom;

public class OrdenarEnterosPrimitivosMetodoBurbuja {
    public static void main(String[] args) {
       SecureRandom aleatorio = new SecureRandom();

        Integer[] arreglo = new Integer[5];
        for (int indice = 0; indice < arreglo.length; indice++) {
            arreglo[indice] = aleatorio.nextInt(100);
        }

        sortBurbuja(arreglo);

    }

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length,
            contador = 0;
        for (int indice = 0; indice < total -1 ; indice++) {
            for (int indiceDos = 0; indiceDos < total -1 -indice; indiceDos++) {
                if ( ((Comparable)arreglo[indiceDos + 1]).compareTo(arreglo[indiceDos]) > 0 ){
                    Object auxiliar = arreglo[indiceDos];
                    arreglo[indiceDos] = arreglo[indiceDos + 1];
                    arreglo[indiceDos + 1] = auxiliar;
                }
               contador++;
            }

        }

        for (Object numero : arreglo){
            System.out.println("numero = " + numero);
        }
        System.out.println("contador = " + contador);

    }
}
