import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtil {
    public static void main(String[] args) {
        Date fecha = new Date();
        //para obtener la fecha solo hay que el objeto por defecto se imprime en inglés
        System.out.println("fecha = " + fecha);

        /*Puede recibir un argumento el formato que deseamos imprimir. Sí ponemos 4 "m's" nos dará
        * el nombre completo del mes, pero, si ponemos dos m's nos dará el dígito del mes
        * c0n 3 m's el nombre corto del mes y deben ser en mayúsculas
        *  para imprimirlo debemos llamar al método del objeto format()
        * que va a recibir un argumento del tipo Date y es método retorna un String */
        SimpleDateFormat fechaSimple = new SimpleDateFormat(" EEEE dd MM yyyy");
        String strFecha = fechaSimple.format(fecha);
        System.out.println("strFecha = " + strFecha);

        /*Para calcular en milisegundos tenemos el método que es un método de objeto Date llamado getTime()
        * Vamos a calcular el tiempo que tarde ne sumar el índice de un for con longitud de 1 M
        * * */
            long total = 0;
        for (int indice  = 0; indice  < 100000000; indice ++) {
                total += indice;
        }
        System.out.println("total = " + total);

        Date fechaDos = new Date();

       long  tiempoFinal = fechaDos.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for: " +tiempoFinal);


    }
}
