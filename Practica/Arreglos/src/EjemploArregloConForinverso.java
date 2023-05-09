import java.util.Arrays;

public class EjemploArregloConForinverso {
    public static void main(String[] args) {
        String[] productos = {"mesa", "puerta", "sillón", "closet", "escritorio", "refirgerador"
        ,"silla"};
        Arrays.sort(productos);
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos = " + productos[indice]);
        }

        System.out.println();
        System.out.println("Con for mejorado");
        System.out.println();

        for (String producto : productos){
            System.out.println("producto = " + producto);
        }

        int[] arregloEnteros = new int[10];

        for (int indice = 0; indice < arregloEnteros.length; indice++) {
            arregloEnteros[indice] += indice*2;
        }

        for (int indice = 0; indice < arregloEnteros.length; indice++) {
            System.out.println("arregloEnteros = " + arregloEnteros[indice]);
        }
        System.out.println("============ for para iterar al inverso ============");

        for (int indice = productos.length - 1; indice >=0 ; indice--) {
            System.out.println("producto " + indice + ": " + productos[indice]);
        }


    }
}
