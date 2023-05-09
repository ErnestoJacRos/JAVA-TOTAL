package ejercicios;

import java.util.Scanner;

public class NumeroMenorErnesto {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Ingrese las cantidades a comparar, mínimo son diez");
        int cantidad = entrada.nextInt();
        if (cantidad < 10){
            System.out.println("Error, la cantidad mínima de enteros debe ser 10 enteros");
        }else {
            int numeroMenor = Integer.MAX_VALUE;
            int numeroIntroducido;
            for (int indice = 0; indice < cantidad; indice++) {
                System.out.println("Ingrese el numero " + (indice + 1));
                numeroIntroducido = entrada.nextInt();
                numeroMenor = (numeroIntroducido < numeroMenor) ? numeroIntroducido : numeroMenor;
            }
            System.out.println("numeroMenor = " + numeroMenor);
            if (numeroMenor < 10 ){
                System.out.println("El numero:  " + numeroMenor + " es menor a diez");
            }else {
                System.out.println("El numero:  " + numeroMenor + " es mayor o igual  a diez");
            }

        }
    }
}
