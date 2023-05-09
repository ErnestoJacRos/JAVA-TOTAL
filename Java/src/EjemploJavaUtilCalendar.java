import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        /*esta clas en particular no usa la keyWord new para lanzar una instancia porque es una clase abstracta
        * y eso quiere decir que no permite crear la instancia concreta con el operador new, asi que ña maneja el método
        * estático getInstance() */

        Calendar calendario = Calendar.getInstance();//Método Estático, método de la clase y no de la instancia
        /*con el método set que es un método de la instancia, podemos modificar la fecha, los meses empiezan
        * en Cero o sea 0 = enero*/
        calendario.set(1990,1,28);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
