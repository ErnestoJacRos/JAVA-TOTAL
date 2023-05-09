package ejercicios;

import java.util.Scanner;
/*Programa que multiplica sin usar el operador aritmético de multiplicación*/
public class MultiplicarSinUsarOperador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese le primer numero para multiplicar ");
        int numero = entrada.nextInt();
        System.out.println("Ingrese el segundo numero para multiplicar");
        int numeroDos = entrada.nextInt();
        int total = 0;

        if (numero < 0 && numeroDos < 0){
            numero = Math.abs(numero);
            numeroDos = Math.abs(numeroDos);

        }

        for (int indice = 1; indice <= numeroDos ; indice++) {
            total += numero;
        }
        System.out.println("total = " + total);
    }
}
