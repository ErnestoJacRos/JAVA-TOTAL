package com.jacros.poosobrecarga;
import static com.jacros.poosobrecarga.Calculadora.*;

public class TestCalculadora {
    public static void main(String[] args) {

        System.out.println("Sumas int: " + suma(5,5));
        System.out.println("Suma float: " + suma(5.2f,6.8f));
        System.out.println("Suma int-float: " + suma(78,1.2f));
        System.out.println("Suma float-int: " + suma(2.1f,5));
        System.out.println("Suma double: " + suma(5.0,10.0));
        System.out.println("Suma String: " + suma("4","9"));
        System.out.println("Suma de tres: " + suma(5,5,3));
        System.out.println("Suma Long: " + suma(10L,45L));
        System.out.println("Sumar entero: " + suma(10,'@'));
        System.out.println("Suma ints: " + suma(2,2,3,3,5,4,5,6,3));
        System.out.println("Suma float + Cantidad...n : " + suma(2.3f,4,8,9,10));
        System.out.println("Suma doble..n: " + suma(2.0,2.0,5.6,145.1));
    }
}
