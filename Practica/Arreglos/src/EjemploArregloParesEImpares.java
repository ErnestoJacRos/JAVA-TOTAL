import java.security.SecureRandom;

public class EjemploArregloParesEImpares {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();

        int[] numeros,
                pares,
                impares;
        int contadorPares = 0,
            contadorImpares = 0;
        numeros = new int[50];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = aleatorio.nextInt(100);
            if (numeros[indice] % 2 == 0){
                contadorPares++;
            }else {
                contadorImpares++;
            }
        }
        System.out.println("Arreglo Original");
        for (int numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Total de pares encontrados = " + contadorPares);
        System.out.println("total de impares encontrados = " + contadorImpares);
        System.out.println();

        int auxPares = 0,
            auxImpares= 0;

        pares = new int[contadorPares];
        impares = new int[contadorImpares];
        for (int indice = 0; indice < numeros.length; indice++) {
            if (numeros[indice] % 2 == 0){
                pares[auxPares++] = numeros[indice];
            } else {
                impares[auxImpares++] = numeros[indice];
            }
        }
        System.out.println("SubArreglo de Pares");
        for (int numero : pares){
            System.out.print(numero + " ");
        }
        System.out.println("\r\nSubArreglo de Impares");
        for (int numero : impares){
            System.out.print(numero + " ");
        }


    }
}
