import java.util.Arrays;

public class ArregloForInverso {
    public static void main(String[] args) {

     //   String[] productos = new String[7];
        String[] productos ={"Usb 64gb", "Samsung Galaxi","SSD Samsung externo ", "Asus notebook",
                "Macbook Air", "ChromeCast 4ta generación","Bicicleta Oxford" };
        int total = productos.length;
       /* productos[0] = "Usb 64gb";
        productos[1] = "Samsung Galaxi";
        productos[2] = "SSD Samsung externo ";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook Air";
        productos[5] = "ChromeCast 4ta generación";
        productos[6] = "Bicicleta Oxford";*/
        System.out.println("=============Usando ForEach=============");
        Arrays.sort(productos);
        for (int indice = 0; indice < total; indice++) {
            System.out.println("para indice " + indice + ": " +productos[indice]);

        }
        System.out.println("===========For Inveros===========");
        for (int indice  = 0; indice< total; indice++) {
            System.out.println("para indice " + (total-1 -indice) + ": " +productos[total-1 -indice]);
        }

        System.out.println("===========For Inveros Dos===========");
        for (int inidce = total - 1; inidce >= 0  ; inidce--) {
            System.out.println("para indice " + inidce + ": " +productos[inidce]);
        }


    }
}
