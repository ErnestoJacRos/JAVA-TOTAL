/*sumar dos matrices en una tercera*/
public class EjemploMatrizSumasEnUnaTercera {
    public static void main(String[] args) {
        /*para que se puedan sumar las matrices debe ser de la misma cantidad
        * de filas y columnas*/
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int[][] suma = new int[3][3];
        for (int indice = 0; indice < a.length; indice++) {
            for (int indiceDos = 0; indiceDos < a[indice].length; indiceDos++) {
                suma[indice][indiceDos] = a[indice][indiceDos] + b[indice][indiceDos];
            }
        }

        System.out.println("Matriz donde se suman los dos anteriores ");
        for (int indice = 0; indice < suma.length; indice++) {
            for (int indiceDos = 0; indiceDos < suma[indice].length; indiceDos++) {
                System.out.print(suma[indice][indiceDos] + "\t");
            }
            System.out.println();
        }
    }
}
