public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int total = numeros.length;
        for (int indice = 0; indice < total; indice++) {
            numeros[indice] = indice+1;
        }

        for (int indice = 0; indice < total /2; indice++) {
            /*dividimos entre dos para que no se repitan los números
            * y la otra forma es al total le vamos restando el índice*/
            System.out.print(numeros[indice] + " ");
            /*para recorrer el arreglo de atrás hacia adelante tomamos el total del
            * arreglo menos uno y le vamos a restar el índice de cada iteración  */
            System.out.println(numeros[total  -1 -indice]);
        }
    }
}
