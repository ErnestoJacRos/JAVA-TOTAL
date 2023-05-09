import java.util.Scanner;

public class SentenciaSwitchCaseDiasMeses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int diasMes;

        System.out.println("ingrese el mes ");
        int mes = entrada.nextInt();
        System.out.println("ingrese el año");
        int anInt = entrada.nextInt();
        /*el Switch Case soporta enteros primitivos y sus clases wrapper, al igual shot byte chart y a partir del jdk 7 soporta Strings
        * y por último soporta ENUM que son numeradores, que a su vez son constantes. */

        switch (mes){
            case 1,3,5,7,8,10,12:
                diasMes = 31;
                System.out.println("el mes que ha ingresado tiene = " + diasMes);
                break;
            case 4,6,9,11:
                diasMes = 30;
                System.out.println("el mes que ha ingresado tiene = " + diasMes);
                break;
            case 2:
                if (anInt % 400 == 0 || ( (anInt % 4 == 0) && !(anInt % 100 == 0))){
                    diasMes = 29;
                    System.out.println("el mes que ha ingresado tiene = " + diasMes);
                }else {
                    diasMes = 28;
                    System.out.println("el mes que ha ingresado tiene = " + diasMes);
                }
            default:
                System.out.println("Ese mes no existe, intenta de nuevo");
        }
    }
}
