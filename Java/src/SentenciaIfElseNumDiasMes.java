import java.util.Scanner;

/*calcula loas días que tiene el mes a elegir del año que desee incluyendo año bisiesto  */

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca el mes que desea saber cuántos días tiene");
      int mes = entrada.nextInt();
      int numeroDias = 0;
        System.out.println("Introduzca el año del mes en cuestión");
      int anInt = entrada.nextInt();
      if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
        numeroDias = 31;
       } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        numeroDias = 30;
       } else if (mes == 2 ) {
            if (anInt % 400 == 0 || ( (anInt % 4 == 0) && !(anInt % 100 == 0) ) ){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
       }
        System.out.println("El mes tiene:   = " + numeroDias + " días");
    }
}
