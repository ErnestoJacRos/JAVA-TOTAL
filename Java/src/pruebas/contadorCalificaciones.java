package pruebas;
/*Encuesta sobre la calidad de la comida de la cafetería en un rango del 1 - 5*/
public class contadorCalificaciones {
    public static void main(String[] args) {
        int [] frecuencia = new int[6];
        int [] arregloCalificaciones = {1,4,5,2,3,4,1,5,2,3,3,5,2,1,1,3,4,5,3,2,3,4,5,4,4,4,4};
        for (int indice = 1; indice < arregloCalificaciones.length; indice++) {
            /*hace un pre-incremento al índice del arreglo frecuencia, que ese índice es determinado
            * por el arreglo calificaciones*/
            ++frecuencia[arregloCalificaciones[indice]];

        }
        for (int indice = 1; indice < frecuencia.length; indice++) {
            System.out.println("la calificación "+indice + "  se repitió  " +frecuencia[indice]);
        }

    }
}
