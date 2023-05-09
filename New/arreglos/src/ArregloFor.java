import java.util.Arrays;

public class ArregloFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Usb 64gb";
        productos[1] = "Samsung Galaxi";
        productos[2] = "SSD Samsung externo ";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook Air";
        productos[5] = "ChromeCast 4ta generación";
        productos[6] = "Bicicleta Oxford";
        System.out.println("=============Usando ForEach=============");
        Arrays.sort(productos);
        for (int indice = 0; indice < total; indice++) {
            System.out.println("para indice " + indice + ": " +productos[indice]);

        }


        System.out.println("=============Usando ForEach=============");


        for(String prod : productos){
            System.out.println("Prod = " + prod);
        }

        System.out.println("=============Usando While=============");
        int indice = 0;
        while (indice < total) {
            System.out.println("para indice " + indice + ": " +productos[indice]);
            indice++;
        }
        System.out.println("=============Usando DoWhile=============");
        int indiceTres = 0;
        do{
            System.out.println("para indice " + indiceTres + ": " +productos[indiceTres]);
            indiceTres++;
        }while (indiceTres < total);


        System.out.println("=============For para Números=============");
            int[] numeros = new int[10];
            int totalNumero = numeros.length;
        for (int inndiceFor  = 0; inndiceFor  < totalNumero; inndiceFor ++) {

            numeros[inndiceFor] =  inndiceFor *3;
        }
        for (int inndiceFor  = 0; inndiceFor  < totalNumero; inndiceFor ++) {
            System.out.println("numeros = " + numeros[inndiceFor]);
        }

    }
}
