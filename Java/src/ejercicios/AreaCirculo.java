package ejercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo que desea calcular la área ");
        double radio = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio,radio);
        System.out.println("El área  del círculo es: " + areaCirculo);

        System.out.println(System.getProperty("user.dir"));
    }
}
