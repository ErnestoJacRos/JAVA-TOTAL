package pruebas;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de enteros a comparar, deben ser mínimo 10");
        int cantidad = entrada.nextInt();
        if (cantidad < 10){
            System.out.println("Error, la cantidad mínima a comparar deben ser 10 enteros");
        }else {
            int numeroMenor = Integer.MAX_VALUE;
            int numeroAComparar = 0;
            for (int indice = 0; indice < cantidad; indice++) {
                System.out.println("ingrese el muero " + (indice +1));
                numeroAComparar = entrada.nextInt();
                numeroMenor = (numeroAComparar < numeroMenor) ? numeroAComparar :  numeroMenor;
            }
            System.out.println("numeroMenor = " + numeroMenor);

            if (numeroMenor < 10){
                System.out.println("el numero: " + numeroMenor + " es menor a diez ");
            }else {
                System.out.println("el numero: " + numeroMenor + " es mayor o igual a diez ");
            }
        }
    }
}
