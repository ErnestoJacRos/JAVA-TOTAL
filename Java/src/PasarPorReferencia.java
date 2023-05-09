public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades ={10, 11, 12};
        System.out.println("Iniciamos el método main");

        for (int indice = 0; indice < edades.length; indice++) {
            System.out.println("edades = " + edades[indice]);
        }

        System.out.println("Antes de llamar el método test");
        test(edades);

        System.out.println("Después de llamar al método test");
        for (int indice = 0; indice < edades.length; indice++) {
            /*Este segundo for imprime nuevamente los valores del arreglo, pero, modificados por ser de
            * referencia.*/
            System.out.println("edades = " + edades[indice]);
        }

    }
    public static void test(int[] edades){
        System.out.println("Iniciamos el método test ");
        for (int indice = 0; indice < edades.length; indice++) {
            edades[indice] += 20;
        }

        System.out.println("Finaliza el método test");

    }
    /*el arreglo se modifica en el método "test" y se ve reflejado en arreglo del método "main"
    * y esos significa que estamos pasando por referencia apunta al mismo puntero en memoria, mismo objeto,
    * misma referencia  */
}
