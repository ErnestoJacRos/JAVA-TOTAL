package ejercicios;

import java.util.Scanner;

public class TanqueGas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es la cantidad actual de litros en el tanque?");
        double litros = entrada.nextDouble();
        if (litros == 70){
            System.out.println("Tanque lleno");
        } else if (litros >= 60 && litros < 70) {
            System.out.println("Taque casi lleno");
        } else if (litros >= 40 && litros < 60) {
            System.out.println("Tanque a 3/4 de capacidad");
        } else if (litros >= 35 && litros < 40 ) {
            System.out.println("Medio tanque");
        } else if (litros >= 20 && litros < 35) {
            System.out.println("Suficiente");
        } else if (litros >= 1 && litros < 20) {
            System.out.println("Insuficiente");
        }else {
            System.out.println("Ni gota de Gasolina");
        }

    }
}
