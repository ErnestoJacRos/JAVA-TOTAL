package pruebas;

import java.util.Scanner;

public class TryAnCash {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Cual es tu edad ");
            int edad = entrada.nextInt();
            System.out.println("edad = " + edad);
        }catch (Exception e ){
            System.out.println("error, debes introducir un numero entero, inta de nuevo");
            System.out.println("e = " + e);
            main(args);
            System.exit(0);
        }
    }
}
