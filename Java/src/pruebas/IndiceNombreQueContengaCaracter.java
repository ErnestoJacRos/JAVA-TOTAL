package pruebas;

import java.util.Scanner;

/*Mostraremos si un elemento del arreglo contiene el character puesto.
* A diferencia del otro programa donde usamos el método startsWith donde nos sirva para saber si
* el character que hemos puesto está en el inicio de alguno de los elementos del arreglo. El
*  siguiente programa de igual forma
* mostrará los nombres que tengan dicho character. Pero, la diferencia será que el character
* no importará en que posición se encuentre y lo haremos con el método contains() */
public class IndiceNombreQueContengaCaracter {
    public static void main(String[] args) {
        String[] nombres = {"Marcos", "Laura", "Mónica", "Javier", "Camila", "Martha", "Darío", "Emiliano", "Melisa"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el character que desea encontrar en el arreglo de nombres");
        char letra = entrada.next().charAt(0);
        for (int indice = 0; indice < nombres.length; indice++) {
            if (nombres[indice].indexOf(letra) != -1){
                System.out.println(indice + " "+nombres[indice]);
            }
        }
    }


}
