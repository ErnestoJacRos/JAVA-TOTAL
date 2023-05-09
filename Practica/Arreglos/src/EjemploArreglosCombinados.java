/*con dos arreglos se llena un tercer arreglo intercalando cada arreglo
* cada valor de cada arreglo usando una variable auxiliar y será incrementada
* a cada iteración, el for que llena el tercer se ejecuta a la mitad del tercer arreglo,
*  ya que a pesar de que tiene una longitud de 20, nosotros estamos
* asignando doble valor a cada iteración. */
public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int indice = 0; indice < a.length; indice++) {
            a[indice] = indice + 1;
        }
        for (int indice = 0; indice < b.length; indice++) {
            b[indice] = (indice + 1 ) * 5;
        }

        int aux = 0;
        for (int indice = 0; indice < c.length / 2 ; indice++) {
                c[aux++] = a[indice];
                c[aux++] = b[indice];
        }

        for (int num : c){
            System.out.println("num = " + num);
        }

    }
}
