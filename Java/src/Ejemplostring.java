//ver las diferencias entre crear un objeto String  con literal con comillas
//y con el operador "new"

public class Ejemplostring {
    public static void main(String[] args) {
        //los dos crean una instancia, pero, lo podemos hacer  de las dos formas porque
        //la clase String pertence al paquete de JavaLang donde no es necesario instacniar un objeto de la clase
        //
        String curso = "Programacion Java";
        String cursoDos = new String("programacion Java");
        //una forma de devolver un valor false o true es haciendo la comparacions
        //dentro del sout o crear una variable del tipo boolean hacer la comparacion y despues imprimir la variable
        //al hacer esta comparacion lo que comparamos no es el contenido del objeto sino dle objeto en si
        //y como sabemos los objeto creados son unicos, por ende el valor que nos dara sera falso
        System.out.println(cursoDos == curso);
        boolean esIgual =  curso ==  cursoDos;//COMPARACION SI LOS OBJETOS OSN LOS MISMOS O LA REFERENCIA A LA QUE HACEA CADA OBJETO
        System.out.println("esIgual LOS DOS OOBJETO?  = " + esIgual);
        //para poder comparar ahora si el contenido del obtejeto debemos hacer el uso dle metodot "equals" del clase strig
        esIgual = curso.equals(cursoDos);//COMPARACION DEL CONTENIDO
        System.out.println("esIgual EL CONTENIDO DE LSO OBJETOS?= " + esIgual);

        esIgual = curso.equalsIgnoreCase(cursoDos);//ignora si son mayusculas y minusculas
        System.out.println("esIgual donde se ignora si son mayusculas y minusculas = " + esIgual);

        //cuando tenemos dos objetos iniciualizados con literal si los camparamos sera true
        //que a diferencia de inicializarlo con una instancia donde sea un objeto, pero,
        //si inicilizamos dos String de forma con literales Y ESTAS LITERALES TIENEN EL MISMO cONTENIDO
        //SE UTILIZA LA MISMA REFERENCIA PARA OPTIMIZAR Y NO CREAR MAS OBJETOS
        //PERO QUE SE GUARDAN EN DISTINTAS VARIABLES
        String cursoTres =  "Programacion Java";
        esIgual = curso == cursoTres;
        System.out.println("esIgual = " + esIgual);


    }
}
