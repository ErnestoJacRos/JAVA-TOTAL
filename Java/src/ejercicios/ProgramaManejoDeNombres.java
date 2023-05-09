package ejercicios;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre");
        String nombre = entrada.nextLine();
        String nombre_a = nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length()-2);

        System.out.println("Ingrese el segundo  nombre");
        String nombreDos = entrada.nextLine();
        String nombreDos_a = nombreDos.toUpperCase().charAt(1) + "." + nombreDos.substring(nombreDos.length()-2);

        System.out.println("Ingrese el tercer nombre");
        String nombreTres = entrada.nextLine();
        String nombreTres_a = nombreTres.toUpperCase().charAt(1) + "." + nombreTres.substring(nombreTres.length()-2);

        System.out.println(nombre_a + "_" + nombreDos_a + "_" + nombreTres_a);

    }
}
