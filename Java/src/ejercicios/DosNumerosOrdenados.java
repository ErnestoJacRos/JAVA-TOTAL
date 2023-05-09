package ejercicios;

import java.util.Scanner;

public class DosNumerosOrdenados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite dos números");
        System.out.println("Digite el primer numero");
        int numero1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        int numero2 = entrada.nextInt();
        if (numero1 > numero2 ){
            System.out.println( numero1 + " " + numero2 );
        }else {
            System.out.println( numero2 + " " + numero1 );
        }
    }
}
