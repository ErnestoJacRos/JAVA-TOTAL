import java.util.Scanner;

/*Buscar un carácter y saber cuántas veces se repite  */
public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        System.out.println("Digite un caracter");
        letra = entrada.next().charAt(0);

        String frase = "tres tristes tigres tragaban trigo en un trigal en tres tristes trastos trabajan tres tristes tigres";
        int contadorCaracter = 0;
        for (int indice = 0; indice < frase.length(); indice++) {
            if (frase.charAt(indice) == letra){
                contadorCaracter++;
            }
        }
        System.out.println("La letra " + letra +" se encontró = " + contadorCaracter + " veces");

    }
}
