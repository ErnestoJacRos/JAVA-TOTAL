package ejercicios;

import java.util.Scanner;

public class EncontrarLetraEnString {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragaban trigo en un trigal en tres tristes trastos trabajan tres tristes tigres";
        System.out.println("frase = " + frase);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el character que desea encontrar en la cadena de texto");
        char letra = entrada.next().charAt(0);
        int contadorLetra = 0;
        for (int indice = 0; indice < frase.length(); indice++) {
            if (frase.charAt(indice) != letra ){
                continue;
            }
            contadorLetra++;
        }
        System.out.println("la letra: " +  "\"" + letra + "\"" +  " se encontró: " + contadorLetra + " veces");
    }
}
