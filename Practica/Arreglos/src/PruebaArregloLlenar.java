import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;

public class PruebaArregloLlenar {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();
        double total = 0;

        Double[] numeros = new Double[101];
       for (int indice = 0; indice < numeros.length; indice++) {

                  numeros[indice] = (double)Math.round(aleatorio.nextDouble(10000000));
        }

       Arrays.sort(numeros);
       Collections.reverse(Arrays.asList(numeros));

      for (double numero : numeros){
        System.out.println("numero = " + numero);
        total += numero;
      }
        System.out.println("total = " + total);

    }
}
