package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Calcular la edad del usuario */
public class EdadUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su fecha de nacimineto en formato dd/MM/yyyy");
        String fechaStr = entrada.nextLine();



        try {

            SimpleDateFormat formarto = new SimpleDateFormat("ddMMyyyy");
            String fechaNacimiento  = formarto.format(fechaStr);
            Date fechaActual = new Date();

            int numeroFechaNacimiento = Integer.parseInt(formarto.format(fechaNacimiento));
            int numeroFechaActual = Integer.parseInt(formarto.format(fechaActual));
            int edad = numeroFechaActual - numeroFechaNacimiento;
            System.out.println("La edad de usuario es: = " + edad);

        }catch (Exception e){

            System.out.println("Error, está mal la fecha puesta");
            main(args);
            System.exit(0);
        }
    }
}
