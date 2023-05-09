package ejercicios;
/*el for que conocemos como mejorado aquí es el for each */

public class SentenciaForEach {
    public static void main(String[] args) {
        int [] numeros = {1,4,5,2,3,4,1,5,2,3,3,5,2,1,1,3,4,5,3,2,3,4,5,4,4,4,4};

        for (int numero:
             numeros) {
            System.out.println("numero = " + numero);
        }



    }
}
