/*método mas importantes del objeto String*/

public class EjemplosStringMetodos {
    public static void main(String[] args) {
        /*Un string es un arreglo de caracteres por lo cual siempre empieza con un índice 0
        * donde índice 0 ≥ a e índice 6 ≥ s  */
    String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        /*para hacer que un string se convierta en mayúsculas o minúsculas hay dos métodos*/
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //Comparar dos String en nivel de valor y no de instancia. Retorna true or falso
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        /*recordemos que java es sensible a mayúsculas y minúscula si hacemos la comparación
        * con una minúscula o mayúscula diferente ya no serán igual*/
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        /*Pero si usamos el método equalsIgnoreCase ya no importará si se diferencian entre mayúsculas y minúscula*/
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));

        /*retorno un valor int, compara dos strings lexicográficamente basado en la tabla unicode
        * si devuelve 0 es que son iguales y si es un valor diferente no los osn*/
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));

        /* este método devuelve el character según el índice que recibe como argumento del arreglo String*/
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        /*si queremos tener el último character dinámicamente debemos usar length -1 */
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        /*recibe como argumento un valor entero y loq ue devuelve es el string a partir
        * del índice que hemos puesto, pero, también podemos usar otro el mismo método con dos argumentos
        * donde le vamos a indicar el índice donde empieza y donde termina para solo
        * substraer una parte de se String */
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(2,5) = " + nombre.substring(2,5));
        /*Nota: el índice de inicio se incluye dentro de la cadena que se va a substraer, pero, el
        * índice de hasta donde va a substraer esa subcadena no se incluirá */

        /*el siguiente método reemplaza un character por otro este método pide dos argumentos
        * el character que vamos a cambiar y el nuevo porque será cambiado
        * RECORDEMOS que los String son inmutables por lo que no se modifica el string, sino que
        * crea una nueva instancia*/
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\"@\") = " + trabalenguas.replace("a","@"));
        System.out.println("trabalenguas = " + trabalenguas);

        /*método indexOf and lastIndexOf devuelve el índice del character que pongamos
        * en indexOf devuelve el primer índice que coincida con el character que hemos puesto de argumento
        * en el caso de lastIndexOf devuelve el último índice que coincida con el character que hemos puesto de argumento
        * */
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        /*pero si ponemos sun character que no está dentro del String nos marcara -1 entonces; para validar si uun
        * character está dentro del String podemos validarlo con un if y poner que sea menor a cero, ya que como recordamos
        * el valor cero estará ocupado por el primer índice del String */
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); 
        /*el siguiente método es parecido, pero, de argumento necesita una secuencia por lo cual
        * para usarlo debemos usarlo con comillas dobles, y devuelve un valor booleano, ya que
        * solo te dice si la secuencia de caracteres está dentro del string o sea devuelve true o false*/
        System.out.println("trabalenguas.contains(\"tra\") = " + trabalenguas.contains("tra"));
        /*el siguiente método devuelve un valor booleano y te dice que si la cadena empieza con los la secuencia
        * que tú estás poniendo como argumento, como podemos ver el método si es sensible a
        * upperCase and lowerCase*/
        System.out.println("trabalenguas.startsWith(\"len\") = " + trabalenguas.startsWith("len"));
        System.out.println("trabalenguas.startsWith(\"Tra\") = " + trabalenguas.startsWith("Tra"));
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));
        /*y como método contrario tenemos endsWith() donde nos dice que si el String termina
        * con la secuencia que hemos puesto como argumento*/
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));

        /*el siguiente método se usa para eliminar los espacios que pudiera haber al inicio o al final de un string
        * lo podemos usar cuando el usuario tenga que por datos e introduzca un espacio port error
        * el método es trim() chequemos la diferencia */
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());




    }
}

