import java.security.SecureRandom;
import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
       // SecureRandom random = new SecureRandom();
        /*Método random() d ela clase Math */
        double aleatorio = Math.random();
        System.out.println("aleatorio = " + aleatorio);

        String[] colores = {"Verde", "Rojo", "azul", "Negro", "Vino", "Amarillo"};
            aleatorio *= colores.length;
        System.out.println("colores random con método random() de la clase MAth:  "+colores[(int)aleatorio]);

        /*Clase Random */
        Random aleatorioDos = new Random();
        /*si ponemos de argumento un número hasta ahí llegará el rango de 0 hasta ese número*/
        /*si queremos un rango más específico debemos sumar en primera instancia la cantidad de donde partirá
        * el rango y lo restamos en el argumento*/
        int randomInt = aleatorioDos.nextInt(45);
        System.out.println("randomInt = " + randomInt);
        Random aleDos = new Random();
        int aleInt = 15 + aleDos.nextInt(30-15);
        System.out.println("aleInt con rango de 15 a 30= " + aleInt);
        Random aleCol =  new Random();
        int coloresRan = aleCol.nextInt(colores.length);
        System.out.println("colores aleatorios con clase Random = " + colores[coloresRan]);

        /*Clase SecureRandom*/
        SecureRandom random = new SecureRandom();
        int aleatorioInt = random.nextInt(colores.length);
        System.out.println("Colores con clase SecureRandom  = " + colores[aleatorioInt]);


    }
}
