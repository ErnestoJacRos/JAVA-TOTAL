public class SentenciaFor {
    public static void main(String[] args) {
        /*números impares*/
        System.out.println("Números impares");
        for (int indice = 0; indice <= 10; indice++) {
            if (indice % 2 != 0){
                System.out.println("indice = " + indice);
            }
        }

        /*números pares*/
        System.out.println("Números pares");

        for (int indice = 0; indice <= 10 ; indice++) {
            if (indice % 2 == 0){
                System.out.println("índice = " + indice);
            }

        }
    }
}
