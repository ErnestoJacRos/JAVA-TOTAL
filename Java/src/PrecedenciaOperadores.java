public class PrecedenciaOperadores {
    public static void main(String[] args) {
        /* La precedencia es como se ejecuta, podemos modificarla con paréntesis así que no e slo mismo:
        *
        * Porque la división tine más prioridad que la suma. Los de mayor precedencia los operadores
        * de incremento y decremento de ahi los paréntesis
        * en caso de que en una misma expresión estén dos o más operadores con la misma prioridad
        * como el de una multiplicación y una división, se ejecutará en orden de aparición de izquierda a
        * derecha */
        int i = 4,
            j = 5,
            k= 3;
        double promedio =  i + j + k / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (double) (i + j + k )/ 3;
        System.out.println("promedio = " + promedio);

        /*dos operadores con la misma precedencia
        * primero se ejecuta la división, ya que aparece primero que la multiplicación
        * después se ejecutará la multiplicación, porque tiene más prioridad que la suma
        * y la final se ejecuta la suma*/

        promedio = i + j + k / 3d * 5;
        System.out.println("promedio = " + promedio);

        /*podemos alterar esa precedencia de orden de misma precedencia y eso lo hacemos con paréntesis*/
        promedio = i/*4*/ + j/*5*/ + k/*3*/ / (double)(3 * 5);
        System.out.println("promedio multi primero= " + promedio);
    }
}
