public class OperadoresRelacionales {
    public static void main(String[] args) {

        /**/
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l  = 2.1413e3;
        boolean m = false;
        /*el operador de igualda se suele utilizar con primitivos ya que son del tipo valor y no referencia
        * con ello no podriamos usarlo con variables del tipo referencial ya que nos haria la comparacion de
        * de la referencia y no del valor de la instancia u objeto que estamos compararando
        * para ello s eusa el metodo equals() para poder hacer la comparacion */
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        /*el sigueinte es para invertor el valor y es con el signo de exclamacion
        * se antepone al valor en este caso arriba b1 es *false y ahora en el segundo
        booleano se convertira en true/
         */
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        /*el siguiente es el distinto de y se compone con el signo de exclamation y el signo de igual
        * asi que si los valores son diferentes retornara true y si lo son iguales retornara false */
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        /* el operado de comparcion o el de distinto de  tambien se puede usar en booleanos */
        boolean b4 = m == true;
        System.out.println("b4 igual a true = " + b4);
        b4 = m != true;
        System.out.println("b4 diferente de true = " + b4);

        /* mayor que y menor que */
        boolean b5 = i > j;
        System.out.println("b5:  i > j = " + b5);
        b5 = i < j;
        System.out.println("b5: i < j = " + b5);

        /*mayoy igula y menor igual*/
        boolean b6 = i >= j;
        System.out.println("b6: i >= j = " + b6);
        b6 = i <= j;
        System.out.println("b6 = " + b6);

        boolean b7 = l >= k;
        System.out.println("b7: l >= k  = " + b7);

        b7 = l <= k;
        System.out.println("b7: l <= k = " + b7);




    }
}
