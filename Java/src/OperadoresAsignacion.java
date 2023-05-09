public class OperadoresAsignacion {
    public static void main(String[] args) {
        /*el operador de asiganacion es signo de igual que no funciona como el d eigualda en matematicas
        * ya que en progrmacion funciona como la asignacion d eun valo o una referencia a una variable*/

        int v1 = 34;
        int v2 = 354;
        /*tambien existen los operadore combinados que tienen funcion de asigbnar */
        v1 += v2;
        System.out.println("v1 = " + v1);
        v1 -= v2;
        System.out.println("v1 = " + v1);
        v1 /= v2;
        System.out.println("v1 = " + (float)v1);
        v1 = 34;
        v1 *= v2;
        System.out.println("v1 multi = " + v1);
        v1 %= v2;
        System.out.println("v1  con mod= " + v1);
        /*se puede usar con Strings*/
        String cadena = "primer cadena ";
        String cadenaDos = "segunda cadena";
        cadena += cadenaDos;
        System.out.println("cadena = " + cadena);
    }
}
