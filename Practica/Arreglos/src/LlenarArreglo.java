import java.security.SecureRandom;

public class LlenarArreglo {
    public static void main(String[] args) {
        int[] numeros,
              pares,
              impares;
        SecureRandom aleatorio =  new SecureRandom();
        int contadorPares = 0,
            contadorImpares = 0,
            auxImpares = 0,
            auxPares = 0;
        numeros = new int[20];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = aleatorio.nextInt(10);
            if (numeros[indice] % 2 == 0){
                contadorPares++;
            }else {
                contadorImpares++;
            }
        }
        System.out.println("Arreglo Original");
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print(numeros[indice] + "\t");
        }
        System.out.println();
        
        pares = new int[contadorPares];
        impares = new int[contadorImpares];

        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] % 2 == 0){
                pares[auxPares++] = numeros[indice];
            }else {
                impares[auxImpares++] = numeros[indice];
            }
        }
        System.out.println("Arreglo de pares");
        for (int numero : pares){
            System.out.print(numero + "\t");
        }

        System.out.println();
        System.out.println("Arreglo de impares");
        for (int numero : impares){
            System.out.print(numero + "\t");
        }
    }
}
