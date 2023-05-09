package ejercicios;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = entrada.nextInt();

        System.out.println("ingrese el segundo numero");
        int num2= entrada.nextInt();

        System.out.println("ingrese el tercer numero");
        int num3 = entrada.nextInt();
         int max = 0;
        /* max = num1 > num2 ? num1 : num2;
         max = max > num3 ? max : num3;*/

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        //System.out.println("max = " + max);

        /*max = num1;
        if (num2> max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println("max = " + max);*/

        max = Math.max(Math.max(num1,num2),num3);
        System.out.println("max = " + max);

    }
}

