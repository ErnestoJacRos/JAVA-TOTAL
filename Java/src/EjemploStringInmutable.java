public class EjemploStringInmutable {
    public static void main(String[] args) {
        /*cuando se quiere modificar un String en realida dno se modifica el String original
        * si no se crea un nuevo objeto*/
        String curso = "Programacion Java";
        String profesor = "Andres Fuentes";
       String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        /* resive como argumento una Funsion  lambda */
        String resultadoDos  = curso.transform(c -> {return c + " con " + profesor;});
        System.out.println("curso = " + curso);
        System.out.println("resultadoDos con metodo transform y como \nargumento una funsion lambda= " + resultadoDos);
        System.out.println(resultadoDos == resultado);
        System.out.println(resultado.equals(resultadoDos));
        /*el siguiente metodo es para reemplazar un caracter de la cadena
        * para que se visualice el cambio que realizamos con el metodo
        * se debe crear un nuevo objeto String, ya que como mencionamos
        * los string son inmutables*/
        String resultadoTres = resultado.replace("a", "@");
        System.out.println("resultadoTres = " + resultadoTres);

        /*String value = "z";
        switch (value){
            case "a","b","c" -> System.out.println("no");
            case "z" -> System.out.println("si");
        }*/

    }
}
