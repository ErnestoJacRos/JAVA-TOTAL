import java.util.Arrays;

public class ArregloForOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"Usb 64gb", "Samsung Galaxi", "SSD Samsung externo ", "Asus notebook",
                "Macbook Air", "ChromeCast 4ta generación", "Bicicleta Oxford"};
        int total = productos.length;
        int contador = 0;
        for (int indice = 0; indice < total - 1; indice++) {
            for (int indiceDos = 0; indiceDos < total -1 - indice; indiceDos++) {
                if (productos[indiceDos +1 ].compareTo(productos[indiceDos]) < 0 ){
                    String auxiliar = productos[indiceDos];
                    productos[indiceDos] = productos[indiceDos + 1 ];
                    productos[indiceDos + 1] = auxiliar;
                }
                contador++;
            }
        }

        for (int indice = 0; indice < total; indice++) {
            System.out.println("productos = " + productos[indice]);
        }
        System.out.println("contador = " + contador);


    }
}
