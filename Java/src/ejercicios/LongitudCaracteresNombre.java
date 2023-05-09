package ejercicios;

import java.util.Scanner;

public class LongitudCaracteresNombre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el primer nombre");
        String nom1 = entrada.nextLine();

        System.out.println("Escriba el primer nombre");
        String nom2 = entrada.nextLine();

        System.out.println("Escriba el primer nombre");
        String nom3 = entrada.nextLine();

        int nombreMayor = nom1.length();

        if(nom2.length() > nombreMayor){
            nombreMayor = nom2.length();
            System.out.println("el nombre con mayor caracteres es: " +nom2 + "con " + nombreMayor + "carasctres");
        } else if (nom3.length() > nombreMayor) {
            nombreMayor = nom3.length();
            System.out.println("el nombre con mayor caracteres es: " +nom3 + "con " + nombreMayor + "carasctres");
        }else {
            System.out.println("el nombre con mayor caracteres es: " +nom1 + "con " + nombreMayor + " carasctres");
        }

    }
}
