public class EjemploArreglos {
    public static void main(String[] args) {
        int []  numeros = new int[4];
        for (int indice = 0; indice < numeros.length; indice++) {
            numeros[indice] = indice++;
            System.out.println(numeros[indice]);
        }


    }
}
