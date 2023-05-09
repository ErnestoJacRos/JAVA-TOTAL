package pruebas;

import java.util.Scanner;

public class ImprimirNombreDeIndice {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    char letra = entrada.next().charAt(0);


        String[] nombres = {"Marcos", "Laura", "Mónica", "Javier", "Camila", "Martha", "Darío", "Emiliano", "Melisa"};
        for (int nombre = 0; nombre < nombres.length ; nombre++) {

                if (nombres[nombre].startsWith("M")){
                    System.out.println(nombres[nombre]);
                }

        }

    }
}
