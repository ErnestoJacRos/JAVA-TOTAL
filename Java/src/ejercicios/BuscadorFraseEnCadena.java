package ejercicios;

import java.util.Scanner;

public class BuscadorFraseEnCadena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorPalabra = 0;
        String frase = "La era del humano como la conocemos ha llegado a su fin por la mano del mismo hombre";
        System.out.println("frase = " + frase);
        System.out.println("Ingrese la la palabra que desea encontrar en la frase");
        String palabra = entrada.nextLine();
        buscador: for (int indiceFrase = 0; indiceFrase < frase.length(); indiceFrase++) {
            int indiceFraseDos = indiceFrase;
            for (int indicePalabra = 0; indicePalabra < palabra.length() ; indicePalabra++) {
                if (frase.charAt(indiceFraseDos++) != palabra.charAt(indicePalabra)){
                  continue  buscador;
                }
            }
            contadorPalabra++;
        }

        System.out.println("Encontrado = " + contadorPalabra + " veces la palabra " + "\"" + palabra + "\""+
                " en la frase ");

    }
}
