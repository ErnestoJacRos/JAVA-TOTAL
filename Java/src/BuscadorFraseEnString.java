import java.util.Scanner;

public class BuscadorFraseEnString {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragaban trigo en un trigal en tres tristes trastos trabajan tres tristes tigres";
        System.out.println("frase = " + frase);
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca la palabra que desea buscar en la frase");
        String palabra = entrada.nextLine();
        int contadorPalabra = 0;
        System.out.println("longitud de frase =  " + frase.length());

        String [] arreglo = frase.split(" ");
        for (int indice = 0; indice < arreglo.length; indice++) {
            if (arreglo[indice].equalsIgnoreCase(palabra)){
                contadorPalabra++;
            }
        }
        System.out.println("La palabra: " + palabra + " apareció " + contadorPalabra + " veces");
    }
}
