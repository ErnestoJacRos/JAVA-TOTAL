public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        /*esto ya es un arreglo del tipo chart si lo queremos imprimir como se muestra a continuación lo que
        * obtendremos será el hash de la instancia */
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char [] arreglo = trabalenguas.toCharArray();
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.print(" " + arreglo[indice]);
        }
/*Nota: si nos damos cuenta cuando imprimimos el length del String estamos usando un método
* ya que tiene paréntesis posteriormente del nombre del metodo
* y cuando queremos imprimir el length de un arreglo notemos que no tiene parentesis y esto es
* un atributo o una propiedad  */
        System.out.println();
        /*este metodo divide y convierte  y recibe un arguemneto del tipo String
        * y este argumento funciona como separador de los arreglos que forman apartir
        * del String en cuestion*/
        /*aqui solo esta imprimiendo el hashing del arreglo que es del tipo referencia*/
        System.out.println("trabalenguas.split() = " + trabalenguas.split("a"));

        String[] arreglosDos = trabalenguas.split("a");

        // Int longitud = trabalenguas.length();
       // System.out.println("longitud = " + longitud);
        for (int indice = 0; indice < arreglosDos.length; indice++){
            System.out.println(arreglosDos[indice]);
        }

        /*erreglo para obtener la extension del archivo */

        System.out.println();
        String archivo = "nombre.archivo.pdf";
        System.out.println("archivo = " + archivo);
        String [] arregloTres = archivo.split("\\.");//[.]

        for (int indice = 0; indice < arregloTres.length; indice++) {
            System.out.println(arregloTres[indice]);
            /*el punto por si solo no lo podemos usar porque es un caracter especial propio
            * de expresiones regulares, asi que la escapamos con doble backslash
            * o también podemos usar los corchetes para usar el punto*/


        }
        /*para obtener solo la extensio usamos length*/
        System.out.println("extension = " + arregloTres[arregloTres.length - 1]);
    }
}
