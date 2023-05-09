public class EjemploMatrizStringColumnasVariable {
    public static void main(String[] args) {
        int[][] matriz = new int[3][];

        /*como va a ser de columnas variables lo siguiente declarar un arreglo
        * por cada fila de la matriz*/
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        for (int indice = 0; indice < matriz.length; indice++) {
            for (int cols = 0; cols < matriz[indice].length; cols++) {
                matriz[indice][cols] = indice * cols;
            }
            System.out.println();
        }


        for (int indice = 0; indice < matriz.length; indice++) {
            for (int cols = 0; cols < matriz[indice].length; cols++) {
                System.out.print(matriz[indice][cols] + ", ");
            }
            System.out.println();
        }

    }
}
