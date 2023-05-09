import java.util.Scanner;

public class EjemploArregloEliminarElemento {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print("Digite un numero: ");
            numeros[indice] = entrada.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese la posición a eliminar en un rango de 0-9");
        int indiceElemtDelete = entrada.nextInt();

        for (int indice = indiceElemtDelete; indice < numeros.length - 1 ; indice++) {
            numeros[indice] = numeros[indice + 1];
        }
        System.out.println("Arreglo con el elemento eliminado");
        /*aquí imprimimos hasta menos uno del total del arreglo
        * porque a la hora de eliminar y no quedar espacio alguno al eliminarlo
        * los elementos se recorren y el último se repite, por eso
        * si ponemos */
        for (int indice = 0; indice < numeros.length - 1; indice++) {
            System.out.print(numeros[indice] + ", ");
        }
        System.out.println();

        /*forma de copiar es usar el método arraycopy() de la clase System*/
        int[] numerosDos = new int[numeros.length-1];
        System.arraycopy(numeros,0,numerosDos,0,numerosDos.length);

        System.out.println("Arreglo copiado con método de System arraycopy()");
        for (int numero : numerosDos){
            System.out.print(numero + ", ");
        }

    }
}
