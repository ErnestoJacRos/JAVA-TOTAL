public class IterarConForEachArreglo {
    public static void main(String[] args) {
        int[][] numeros = { {1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12} };
            for (int[] filas : numeros){
                for (int cols : filas){
                    System.out.print(cols +", ");
                }
                System.out.println();
            }
    }
}
