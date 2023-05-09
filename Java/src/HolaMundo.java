import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        Scanner entrada = new Scanner(System.in);
        String saludo = "Hola Mundo desde Java";
        System.out.println(saludo);
        //como es una variable de clase referencia "String" tiene métodos
        // no es necesario instanciar esta clase porque viene por defecto en javalang
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());
        //int es un valor numérico que es de tipo primitivo y esta variable a comparación de la variable del tipo
        //String no tiene métodos
        /*una variable que se declara en un contexto mayor sin inicializar y querer usarla
        en un contexto inferior que este dentro del contexto mayor debe ser inicializada, sino
        //no se puede usar ejemplo de ello es cuando usamos un "if" que es un nuevo contexto
        y si no inicializamos en el contexto mayor esa variable no podremos usarla en el contexto del if

        * */
        System.out.println("Digite un numero");
        int numero = entrada.nextInt();

        if (numero > 10){
            numero = 12;
            System.out.println("numero = " + numero);
        }else {
            System.out.println(numero);
        }
    }
}
