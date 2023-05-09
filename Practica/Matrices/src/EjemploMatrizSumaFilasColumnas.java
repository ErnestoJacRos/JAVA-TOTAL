/*sumar dos matrices en una tercera*/
public class EjemploMatrizSumaFilasColumnas {
    public static void main(String[] args) {
        int sumaColumna,
            sumaFila;
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int indice = 0; indice < a.length; indice++) {
            /*se inicializan aquí porque cada vez que se itere se van a
            * poner en cero y así sumar la siguiente y columna*/
            sumaColumna = 0;
            sumaFila = 0;
            for (int indiceDos = 0; indiceDos < a[indice].length; indiceDos++) {
                sumaFila += a[indice][indiceDos];
                sumaColumna += a[indiceDos][indice];
            }
            System.out.println("suma total de fila: " + indice + ": " + sumaFila);
            System.out.println("suma total de columna: " + indice + ": " + sumaColumna);
        }

    }
}
