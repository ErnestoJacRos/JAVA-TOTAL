package pruebas;
/*programa para determinar promedio de clase sin saber cuál es el total de las calificaciones*/

import java.util.Scanner;

public class SentenciaForCentinela {
    public static void main(String[] args) {
        int total = 0;
        int indice = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la calificación, si desea terminar ingrese -1 ");
        System.out.println("Digite la primera entrada ");
        int cali = entrada.nextInt();

        for (; cali != -1 ; indice++) {
            total +=cali;
            System.out.println("ingrese la calificación si desea terminar ingrese -1 ");
            System.out.println("Digite la primera entrada ");
            cali = entrada.nextInt();




        }
        if (indice != 0){
            System.out.println("total = " + total);
           int  promedio = total / indice;
            System.out.println("promedio = " + promedio);
        }else {
            System.out.println("no hubo calificaciones");
        }

    }
}
