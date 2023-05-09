import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloConForinversoMutable {
    public static void main(String[] args) {
        String[] productos = {"mesa", "puerta", "sillón", "closet",
         "escritorio", "refirgerador"
        ,"silla"};
        Arrays.sort(productos);

       // arregloInvertido(productos);
        /*también lo podemos hacer con la API de java con Collections.reverse(), pero,
        * requiere de una list y no de un arreglo y para convertir ese arreglo a una list podemos usar
        * Arrays.asList() que recibe como argumento un arreglo*/
        Collections.reverse(Arrays.asList(productos));


        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos = " + productos[indice]);
        }

    }

    public static void arregloInvertido(String[] arreglo){
        /*en el ejemplo anterior lo ordenamos al inverso, pero, solo fue a la hora de imprimir
         * ahora vamosa mutar el arreglo para que ya se quede así */
        for (int indice = 0; indice < arreglo.length/2; indice++) {
            String actual = arreglo[indice];
            String inverso = arreglo[arreglo.length- 1 - indice];
            arreglo[indice] = inverso;
            arreglo[arreglo.length- 1 - indice] = actual;

        }
    }
}
