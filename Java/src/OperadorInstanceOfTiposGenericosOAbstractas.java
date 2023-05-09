public class OperadorInstanceOfTiposGenericosOAbstractas {
    public static void main(String[] args) {
        /*clases Genéricas o Abstractas
        * si en lugar de poner String ponemos Object y la literal sigue siendo una cadena de caracteres
        * (o mejor dicho la instancia del tipo String)
        * será correcto, ya que como habíamos dicho todos los objetos heredan de la clase
        * padre Object*/

        Object texto = "Creando un objeto de la clase String";
        Number num = 7;

        /*Como sabemos las clases wrapper crean instancias y esas se crean implícitamente, Para hacerlo
        * explícitamente podemos usar "new" para crearlo, pero, eso sería una forma incorrecta no causará
        * error, pero, sería una mala práctica. Lo correcto será el uso del método valueOf() respectivamente
        * de cada clase wrapper. Que en sí es un método estático y devuelve un Integer */
        System.out.println();
        System.out.println("Método estático valueOf() para crear una instancia explícitamente ");
        Integer numero = Integer.valueOf(7);
        System.out.println("instancia numero de la clase Integer, creado con el método estático valueOf() = " + numero);
        /*y con este método es le forma correcta de crear una instancia de una clase de wrapper*/
        System.out.println();

        Boolean b1 = texto instanceof String;
        System.out.println("¿texto es una instancia de la clase String?  = " + b1);
        /*Vamos hace una prueba, donde utilizando el método instanceOf() para saber si la variable
        * del tipo Object es una instancia del tipo Integer. A pesar de que la instancia sea del tipo String*/

        b1 = texto instanceof Integer;
        System.out.println("texto es una instancia de la clase Integer = " + b1);
        /*como vemos no da error de sintaxis que, sería el error que normalmente nos daría
        * pero, a pesar de eso, el resultado será false. Mencionar que todo es por la clase
        * Object*/

        System.out.println();
        /* De manera implícita "Object" es la clase padre de los objetos es decir toda clase de Java
        *  heredad de la clase "Object"    */

        b1 = texto instanceof Object;
        System.out.println("¿texto es una instancia de la clase Object ?  = " + b1);
        System.out.println();

        /*Clase wrapper Integer*/

        b1 = num instanceof Integer;
        System.out.println("¿num es una instancia de la clase Integer ?  = " + b1);

        b1 = num instanceof  Long;
        System.out.println("Number es una instancia de la clase Long " + b1);
        /*aunque podíamos usar la clase Object como la instancia del tipo String
        * ahora vamos a utilizar la clase Number que es la clase padre
        * o superClase de los tipos primitivos del tipo numéricos, pero, al igual
        * que en el ejemplo anterior no nos dara error de sintaxis, pero, de igual forma
        * el resultado será False */
        System.out.println();

        b1 = num instanceof Number;

        System.out.println("¿num es una instancia de la clase Number ?  = " + b1);
        System.out.println();

        b1 = num instanceof Object;
        System.out.println("¿num es una instancia de la clase Object ?  = " + b1);
        System.out.println();
        Double decimal = 45.45;
        b1 = decimal instanceof Number;
        System.out.println("¿decimal es una instancia de la clase Number ?  = " + b1);
        System.out.println();

        b1 = b1 instanceof Boolean;
        System.out.println("¿b1 es una instancia de la clase Boolean ?  = " + b1);
        System.out.println();



    }
}
