public class OperadoresLogicos {
    public static void main(String[] args) {
        /*Tenemos dos AND / OR y se representan con && y || respectivamente
        * con && las dos condiciones expuestas deben ser verdaderas para que retorne true y con ||
        * para que retorne true solo una de las dos condiciones debe ser cierta.
        * En el caso de && si una es falsa retorna false, otra cosa en tomar en cuenta
        * es que si la primera condicion es falsa ya no se evalua la segunda condicion
        * y a esto se le llama qu esta en corto circuito
        * en el caso de || si la primera es verdadera la segunda ya no se evalua
        * ,pero, tenemos otros tipo de operadores logicos que son lo mismo, pero, en lugar de
        * dos simbolos que representan al ADN Y OR solo sera uno o sea & y |
        * y la diferencia entre los otros es que estos si evaluan la segunda condicon    */

        int i = 3;
        byte j = 3;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        boolean  b1 = i == j && k < l && m == false ;
        //todas las condiciones deben ser verdaderas para que retorne true
        System.out.println("b1: i == j && k < l && m == false  = " + b1);

        boolean b2 =  i != j || k < l;
        //solo una debe cer verdadera para que retorne true
        System.out.println("b2: i != j || k < l = " + b2);

        /*podemos poner and y or al mismo tiepo y se ejetara segun la precedencia de los operadores
        * y se leen d eizquierda  aderecha en el siguiente ejemplo habra dos && como primras conciones
        * y despues  un ||
        * lo cual primero evaluara los 2 and y el resultado de eso se comparara con el or */
        boolean b3 = i != j  && k > l || m == false;
        System.out.println("b3: i != j  && k > l || m == false = " + b3);
        //Nota: a menos que modifiquemos la procedencia con los parentesis

        b3 = i == j  && (k > l || m == false);
        System.out.println("b3: i != j  && (k > l || m == false)  = " + b3);





    }
}
