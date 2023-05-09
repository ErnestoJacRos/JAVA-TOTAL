import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;

public class ArregloNumerosInvertido {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Integer[] numeros = new Integer[10];
        for (int indice = 0; indice < numeros.length; indice++) {
                numeros[indice] = random.nextInt(1000);
        }
        Arrays.sort(numeros);
        Collections.reverse(Arrays.asList(numeros));
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
    }
}
