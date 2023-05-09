public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso =  "Programación Java";
        String profesor = "Andres Fuentes";
        String detalle = curso + " con el instructor:  " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        /*como la precedencia de los operadores, primero se encuentra un string todo lo demas
        *se considerara como string sino alteramos esa procedencia. Entonces las dos variables del tipo
        * int se van a concatenar y no sumar*/
        System.out.println(detalle  + numeroA + numeroB);
        /*aqui auque no  hemos modificado la procedencia con algo adicional como parentesis
        * si le hemos modificado con el orden dde los operadores poniendo en un inicio a las varaibales del tipo primitivo entero
        * enteonces se hara la suma y el resultado se concatenara a la variable del tipo String */
        System.out.println(numeroA + numeroB + detalle);
        /*en este caso hemos alterado la procedencia de los operadores con unos paréntesis entonces
         * primero se ejecutara la operacion de suma. y concatenera pero el resultado de dicha suma */
        System.out.println(detalle + (numeroA + numeroB));
        /*otra forma de concatenar es con el metodo concat, de la clase String. los objetos del tipo String
        *son inmutables, por lo tanto, se crea una nueva instancia  y se asigna a la nueva variable*/
         String detalleDos = curso.concat(profesor);
        System.out.println("detalleDos = " + detalleDos);
        /*Los metodos Concat se puede anidar.En este caso lo vamos hacer para tener un espacio entre los String que
        * estamos concatenando*/
        detalleDos = curso.concat(" con ".concat(profesor));
        System.out.println("detalleDos = " + detalleDos);
        /*otra forma de anidar ese metodo concat em lugar de hacerlo dentro del del primer concat
        * lo vamos hacer fuera del concat primero*/
        detalleDos = curso.concat(" con ").concat(profesor);
        System.out.println("detalleDos = " + detalleDos);

    }
}
