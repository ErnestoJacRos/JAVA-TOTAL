import java.util.Arrays;
import java.util.Collections;

public class ArregloForInversoMutable {
    public static void main(String[] args) {

        //   String[] productos = new String[7];
        String[] productos = {"Usb 64gb", "Samsung Galaxi", "SSD Samsung externo ", "Asus notebook",
                "Macbook Air", "ChromeCast 4ta generación", "Bicicleta Oxford"};
        int total = productos.length;

        System.out.println("========= For =============");
        Arrays.sort(productos);
        for (int indice = 0; indice < total; indice++) {
            System.out.println("Para indice " + indice + ": " + productos[indice]);
        }

        System.out.println("========= For Mutable =============");
        arregloInverso(productos);
       //Collections.reverse(Arrays.asList(productos));


        for (int indice = 0; indice < total; indice++) {
            System.out.println("Para indice " + indice + ": " + productos[indice]);
        }


    }

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int indice = 0; indice < total2; indice++) {
            String actual = arreglo[indice];
            String ultimo = arreglo[total - 1 - indice];
            arreglo[indice] = ultimo;
            arreglo[total - 1 - indice] = actual;
            total2--;
        }


    }
}
