import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su promedio");
        float promedio = entrada.nextInt();

        /*la sentencia de control de flujo puede ir sin llaves, siempre y cuando
        * solo tenga una sentencia que aplicar y no sea un bloque más grande
        * */

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio");
        }else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte más");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más");
        }else{
            System.out.println("Reprobado!");
        }

        System.out.println("tu promedio es: = " + promedio);
    }
}
