package pruebas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd MMMM yyyy");
        String dateSimple = fechaFormato.format(fecha);
        System.out.println("dateSimple = " + dateSimple);

    }
}
