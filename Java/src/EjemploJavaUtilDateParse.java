import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite la fecha con el formato yyyy/MM/dd");
            String fecha = entrada.nextLine();
            Date fechaEntrada = format.parse(fecha);
            System.out.println("fechaEntrada = " + fechaEntrada);
            Date fechaDos = new Date();
            if (fechaEntrada.after(fechaDos)){
                System.out.println("La fecha del usuario es después de fecha dos(actual) ");
            }else if (fechaEntrada.before(fechaDos)){
                System.out.println("La fecha del usuario es antes de fecha dos(actual)");
            } else if (fechaEntrada.equals(fechaDos)) {
                System.out.println("Las fechas son iguales ");
            }

            /*otra forma de comparar las fechas es con el método compareTo()*/

            if (fechaEntrada.compareTo(fechaDos) > 0){
                System.out.println("LA fecha de usuario es después de la actual ");
            } else if (fechaEntrada.compareTo(fechaDos)<0 ){
                System.out.println("La fecha del usuario es antes de la actual");
            } else if (fechaEntrada.compareTo(fechaDos) == 0) {
                System.out.println("_Las fechas son iguales");
            }

        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("Error, ha escrito mal la fecha, intente de nuevo");
            main(args);
            System.exit(0);

        }



    }
}
