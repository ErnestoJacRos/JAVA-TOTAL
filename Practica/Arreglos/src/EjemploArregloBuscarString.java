import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {

        String[] nombres = {"Ernesto", "Jacros", "Neto", "Harry"};

        for (String nombre : nombres ){
            System.out.print(nombre +", ");
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("ingrese el nombre a buscar ");
        String nombre = entrada.nextLine();

        int contador = 0;
        while (contador < nombres.length && !nombres[contador].equalsIgnoreCase(nombre) ){
            contador++;
        }
        
        if (contador == nombres.length){
            System.out.println("No se encontró el numero buscado");
        } else if (nombres[contador].equalsIgnoreCase(nombre)) {
            System.out.println("Se encontró el numero buscado en la posición: " + contador);
        }

    }
}
