public class OperadorInstanceOf {
    public static void main(String[] args) {
        /*el método instanceOf es para validar si un objeto es instancia de una clase  */
        //dos objetos
        //a esto se le conoce como autoboxing que es el encapsulamiento de un primitivo
        //en su clase wrapper
        String texto = "Creando un objeto de la clase String";
        Integer num = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("¿texto es una instancia de la clase String?  = " + b1);

        System.out.println();
        /* De manera implícita "Object" es la clase padre de los objetos es decir toda clase de Java
        *  heredad de la clase "Object"    */

        b1 = texto instanceof Object;
        System.out.println("¿texto es una instancia de la clase Object ?  = " + b1);
        System.out.println();

        /*Clase wrapper Integer*/

        b1 = num instanceof Integer;
        System.out.println("¿num es una instancia de la clase Integer ?  = " + b1);
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
