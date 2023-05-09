public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 =  num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        /*Como sabemos el operador de igualdad es para saber si son el mismo objeto no para saber si tienen el
        * mismo valor, para eso es el método equals() pero en esta ocasión lo estamos usando con ese fin, de saber
        *si son el mismo objeto. y como veremos si lo son porque en el segundo objeto le estamos asignando
        *  el primer objeto  */
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        /*en este caso el resultado será falso, ya que a pesar de tener el mismo valor ya está apuntando
        * hacia otro objeto  */
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        /*Y este método como ya lo hemos mencionado sí es para verificar si tienen el mismo valor*/

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)) );
        /*Otra forma de verificar el valor es convertir los dos objetos Integer a enteros primitivos y usar
        * el operador de igualdad  */
        System.out.println();
        System.out.println("¿Tiene el mismo valor? " + (num1.intValue() == num2.intValue()));

        /*Nota: hay una excepción en Java donde hasta 127 el operador de igualdad "==" al usarlo entre dos
        * objetos sí comparará el valor entre esos dos objetos y no la referencia*/

        /*Verificando como los otros operadores relacionales
         funcionan en los objetos como funcionan en los tipos primitivos*/
        num2 = 200;
        boolean condicion = num1 <= num2;
        System.out.println(condicion);






        }
    }

