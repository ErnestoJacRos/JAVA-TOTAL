//Validacion de un String si es null, una referencia, si tiene un espacio, o longitud
public class EjemploStringValidar {
    public static void main(String[] args) {
    String curso = null;
    boolean esNull = curso == null;
        /*cuando sea un null aunque te deje llamar  metodos no podras usarlos
        * ya que se creara  una excepcion en esta caso NullPointerException
        * asi que para usarlo siempre debes asegurarte que debe tener un valor o una referencia
        * pero si usamos un signo de + para concatenar no nos dara erros ya que imprimira literalmente la frase null
        * */
        if (esNull){
            curso = "Progrmacion en Java";

        }
        System.out.println("esNull = " + esNull);
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso de ".concat(curso));

        String cursoDos =  " ";
        boolean estaVacio = cursoDos.isEmpty();
        System.out.println("estaVacio = " + estaVacio);

        boolean esBlanco = cursoDos.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        /*is Empty esta disponible desde el sdk 6 y isBlank desde el 11 y se puede considerar que isBlank
        * seria la forma mas completa de validar un String */



    }
}
