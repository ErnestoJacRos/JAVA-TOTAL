package ejercicios;

import java.util.Scanner;

public class PedirNotas {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int contadorMayorCinco = 0,
            contadorMenorCuatro = 0,
            contadorUno = 0,
            totalCinco = 0,
            totalUno = 0,
            totalCuatro= 0,

            cali = 0;
        cali: for (int indice = 0; indice < 20 ; indice++) {
            System.out.println("Ingrese la calificación en un rango del 1 - 7");
            cali = entrada.nextInt();
            if (cali == 0){
                System.out.println("La calificación debe ser mayor cero");
                break cali;
            }else if (cali == 1){
                    contadorUno++;
                    totalUno +=cali;
                } else if (cali <= 4 ) {
                    contadorMenorCuatro++;
                    totalCuatro += cali;
                } else if (cali >= 5) {
                    contadorMayorCinco++;
                    totalCinco += cali;
                }

        }
        if (contadorUno == 0){
            System.out.println("no hubo calificaciones con el valor 1 para sacar promedio");
        }else {
            double promedioUno = (double) totalUno / contadorUno;
            System.out.println("Promedio de Unos " + promedioUno);
        }

        if (contadorMenorCuatro == 0){
            System.out.println("no hubo calificaciones con el valor 4 o menor para sacar promedio");
        }else {
            double promedioCuatro = (double) totalCuatro / contadorMenorCuatro;
            System.out.println("promedioCuatro = " + promedioCuatro);
        }

        if (contadorMayorCinco == 0){
            System.out.println("no hubo calificaciones con el valor 5 o más para sacar promedio");
        }else {
            double promedioCinco = (double) totalCinco / contadorMayorCinco;
            System.out.println("promedioCuatro = " + promedioCinco);
        }

    }
}
