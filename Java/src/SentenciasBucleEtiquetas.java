public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        /*Etiquetas así poder detener un bucle, por ejemplo.*/

        System.out.println();
        /*Mostrar las horas de cada día que se trabaja y visualizar los días de descanso
         * usamos la tag bucle, para saltar lo especificado el if con ayuda del keyword continue.
         * Sí usamos la keyword break truncamos cuando se cumpla la condición del if */


        bucle:
        for (int dias = 1; dias <= 7; dias++) {
            System.out.println();
            for (int horas = 1; horas <= 8; horas++) {
                if (dias == 6 || dias == 7) {
                    System.out.println("Día " + dias + " Descanso");
                    continue bucle;
                }

                else {
                    System.out.println("dias = " + dias + " horas =" + horas);
                }
            }
        }

        /*En este caso como estamos usando un or en la condición solo basta con que se cumpla una para ejecutar
         * se if como vemos el primer valor que se ejecuta es el 6 y ahí se detiene  */

        System.out.println("====================================================================");


    }
}
