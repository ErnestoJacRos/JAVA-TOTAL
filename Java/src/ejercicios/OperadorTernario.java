package ejercicios;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        /*ternario porque está formado por tres elementos
        * donde la primera evalua una expression booleana donde si se cumple
        * devuelve un valor y si no se cumple devuelve otro valor
        * podría decirse que el operador ternario es una version simplificada del if-else */

        String variable = 7 == 7 ? "Es correcto" : "Es falso";
        System.out.println("variable = " + variable);
        Scanner entrada = new Scanner(System.in);
        String estado;
        double mate = 0.0, cien = 0.0, histo = 0.0;

        System.out.println("introduczca matematicas");
        mate = entrada.nextDouble();
        System.out.println("introduzca ciencias");
        cien = entrada.nextDouble();
        System.out.println("introduzca historia");
        histo = entrada.nextDouble();

        double promedio = (mate + cien + histo) / 3 ;
        //double caliExam = 5.0;
        estado = promedio >= 6.0  ? "aprobado con promedio de: " + promedio : "reprobado con promedio de: "+ promedio;
        System.out.println("estado = " + estado);

    }
}
