public class EjemploArregloConForOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"mesa de pin pong", "puerta del caribe sudamericano", "sillón del abuelo pepe", "closet",
         "escritorio precolombino areruki", "crefirgerador de la divia providencia "
        ,"silla del cerro de la silla "};
        int contador = 0;
        //Vamos a comparar un elemento con otro
        /*estamos haciendo un método burbuja que es equivalente
        * al método del helper Arrays.sort() que es para ordenarlos  */
        for (int indice = 0; indice < productos.length; indice++) {
            for (int indiceDos = 0; indiceDos < productos.length; indiceDos++) {
                if (productos[indice].compareTo(productos[indiceDos]) < 0){
                    String auxiliar = productos[indice];
                    productos[indice] = productos[indiceDos];
                    productos[indiceDos] = auxiliar;
                    /*si la cadena que llamó al método cadenaLLamante.compareTO() en orden
                    * alfabético va primero que la cadena que está dentro del método
                    * compareTo(cadenaDentro) entonces el método retorna un valor
                    * menor a cero, pero, si es al revés o sea que alfabéticamente
                    * la cadena que está dentro del método va primero que la cadena qque
                    * llamó al método, el método retorna un valor mayor a cero, pero,
                    * si son la misma cadena retorna un valor de cero */
                }
                contador++;
            }

        }
       // Arrays.sort(productos);

       // arregloInvertido(productos);
        /*también lo podemos hacer con la API de java con Collections.reverse(), pero,
        * requiere de una list y no de un arreglo y para convertir ese arreglo a una list podemos usar
        * Arrays.asList() que recibe como argumento un arreglo, caber mencionar
        * que para invertir tipo numúerico debes unsa las clases wrapper como Integer
        * Double, Float, etc. */
       // Collections.reverse(Arrays.asList(productos));

        //Ordenamiento burbuja para ordenar conforme al abecedario sin usar el método
        //del helper Arrays.sort()



        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos = " + productos[indice]);
        }
        System.out.println("contador = " + contador);
        int contadorDos = 0;
        for (int indice = 0; indice < productos.length - 1 ; indice++) {
            for (int indiceDos = 0; indiceDos < productos.length -1 -indiceDos; indiceDos++) {
                if (productos[indice].compareTo(productos[indiceDos]) < 0){
                    String auxiliar = productos[indice];
                    productos[indice] = productos[indiceDos];
                    productos[indiceDos] = auxiliar;
                }
                contadorDos++;
            }

        }

        System.out.println("========================================================================");
        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos = " + productos[indice]);
        }
        System.out.println("contadorDos = " + contadorDos);

    }

    public static void arregloInvertido(String[] arreglo){
        /*en el ejemplo anterior lo ordenamos al inverso, pero, solo fue a la hora de imprimir
         * ahora vamosa mutar el arreglo para que ya se quede así */
        for (int indice = 0; indice < arreglo.length/2; indice++) {
            String actual = arreglo[indice];
            String inverso = arreglo[arreglo.length- 1 - indice];
            arreglo[indice] = inverso;
            arreglo[arreglo.length- 1 - indice] = actual;

        }
    }
}
