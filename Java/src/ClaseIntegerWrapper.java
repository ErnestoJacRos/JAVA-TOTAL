public class ClaseIntegerWrapper {
    public static void main(String[] args) {

        /*cada tipo numérico tiene su propia clase de objetos
        * ejemplo: int tiene Integer */


        /*para instancia un objeto de la clase Wrapper Integer debes usar el método valueOf()
        * paar hacerlo y no usar new como se hacía antes en el jdk 7 e inferiores, aunque el uso del método
        *  valueOf() es lo correcto para instance, ya es innecesario hacerlo explícitamente, ya que lo
        * hace implícitamente  */
        Integer i = Integer.valueOf(1234567);//instancia de un objeto de la Integer
        System.out.println("i = " + i);
        String s = i.toString();//es la forma String de la variable
        int j = i.intValue();//retorna un valor Integer a un valor int
        long l = i.longValue();//retorna de un valor Integer a un valor long
        float f = i.floatValue();//lo convierte en un valor float
        double d = i.doubleValue(); //lo convierte en double
        int k = Integer.parseInt("1234567");//toma un String y lo convierte a un int

        /*Los métodos que están seguidos de una clase, por ejemplo Integer.valueOf() es un método estático
        * o sea que necesita solo el nombre de la clase y el separador, en el caso de que el método esté declarado
        * en ela misma clase solo se necesita el nombre del método
        *
        * los métodos que están después de la instancia u objeto son métodos de la instancia  */

        /*Constantes de la clase Integer son:
        -Integer.MIN_VALUE
        -Integer.MAX_VALUE
        */

        /*Métodos Estáticos:
        * a todos le puede poner la base, en realidad es uan sobre carga de métodos aunque se llama igual piden
        * diferentes argumentos, porque al declarar los métodos se han puesto más parámetros
        * Integer.toString(78);
        Integer.parseInt("4545");
        Integer.valueOf(23);
        Integer.valueOf("4545");*/


        /*Métodos de la instancia
        *
        * intValue() de un integer pasa a un int primitivo
        * longValue() de un integer pasa a un long primitivo
        * floatValue() de un integer pasa a un float primitivo
        * doubleValue() de un integer pasa a un double primitivo
        * toString() de un Integer pasa a un String
        * hashCode() identificador con la cual se guarda en memoria
        * equals() retorna un booleano y asi sabemos si son igual en valor
        * byteValue() lo convierte a un byte, pero no se debe hacer por la perdida de datos
        * shortValue() lo convierte a un short, pero, no se debe hacer por la perdida d edatos
        * */
        System.out.println("hashCode " + i.toString());





    }
}
