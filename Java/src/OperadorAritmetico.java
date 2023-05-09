

public class OperadorAritmetico {
    public static void main(String[] args) {

        int numeroUno = 2 , numeroDos = 4 , suma = numeroDos + numeroUno;
        System.out.println("suma = " + suma);

        /*com el signo "+" se usa para dos cosas, el concatenar y el sumar depende como lo utilicemos
        * y asi obtener los resultados que queremos, ejemplo uno: si concatenamos con un String y un o mas enteros
        * lo que va a hacer en concatenar esos enteros con el String
        * ,pero, si ponemos la suma de dos enteros antes que el String se realizara la suma primero antes quee
        * concatene el String*/
        System.out.println("Cadena de caracteres " + numeroDos + numeroUno);
        System.out.println(numeroUno + numeroDos + "  cadena de caracteres");

        /*otra forma de que antes de concatenarse y que primero este el String es que pongamos
        * parentesis eso hace que la procedencia cambie y que primero haga lo que este dentro d elos parentesis*/
        System.out.println("Cadena de caractere " + (numeroUno + numeroDos) );

        /*Resta : con resta y de mas operadores aritmeticos que no son de suma debemos utilizar el parentesis ya qye
        * si nos preguntamos porque que con el operador de suma no lo hacemo, la razon es la siguiente
        * este operado se le espermitido ya que se usa para concatenar asi que tiene doble funcionalidad y dependiendo
        * como se use sera el resultado, en cambio los otros operadores aritmeticos no son permitidos o no tiene esa doble
        * funcionalidad y esto hace que sea un error por ende siempre va a ir con parentesis
        * Nota: esto se refiere siempre y cuando usemos el metodo println() para mostrarlos en consola
        * ,pero,  si los usamos o los asignamos a una variable , esto d elos parentesis no es neccesario */
        int resta = numeroUno - numeroDos;
        System.out.println("resta = " + resta);
        System.out.println("cedena caracteres " + (numeroUno - numeroDos));
        /*division
        * como son dos enteros y el resultado de la division es un flotante el resultado se trunca y se redondea la numeor mas
        * cercano en esta caso el resultado seria .5 pero nos da 0 y esto es poorque los primitvios del tipo entero
        * no dan decimales mas que que los primitivos del tipo flotanjte o sea
        * float and double loq ue podemos hacer aqui es un cateo y que es forzar la conversion de un primitivo del tipo entero
        * al un primitivo del tipo flotante*, pero para esos debemos  tener una variable del tipo flotante donde se guardara
        * el resultado de la divison y en la division poner explicitamente a que valos lo vamos a castear con parentesis*/
        int division =  numeroUno/ numeroDos;

        System.out.println("division = " + division);
        float divisionDos = numeroUno / numeroDos;
        System.out.println("divisionDos = " + divisionDos);
        /*si solo ponemos la variable del tipo flotante donde se guardara el resultado, solo nos arrogara
        * el mismo cero pero ahora con punto decimal, es necesario poner el casteo explicito*/
        divisionDos = (float) numeroUno / numeroDos;
        System.out.println("divisionDos = " + divisionDos);

        /*Multiplicacion*/
        int multi = numeroUno * numeroDos;
        System.out.println("multi = " + multi);
        System.out.println("multiplicacion = " + (numeroUno * numeroDos));

        /*mod o resto
        * */
        int resto = numeroUno % numeroDos;
        System.out.println("resto = " + resto);
        System.out.println( "Cadena de texto " + (numeroUno % numeroDos));





    }
}
