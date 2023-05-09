import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class PrimerArreglo {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Usb 64gb";
        productos[1] = "Samsung Galaxi";
        productos[2] = "SSD Samsung externo ";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook Air";
        productos[5] = "ChromeCast 4ta generación";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[0] = " + productos[1]);
        System.out.println("productos[0] = " + productos[2]);
        System.out.println("productos[0] = " + productos[3]);
        System.out.println("productos[0] = " + productos[4]);
        System.out.println("productos[0] = " + productos[5]);
        System.out.println("productos[0] = " + productos[6]);
        int[] numeros = new int[4];
        numeros[0] = -1;
        numeros[1] = Integer.valueOf("45");
        numeros[2] = 10;
        numeros[3] = 0;
        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length-1];
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
