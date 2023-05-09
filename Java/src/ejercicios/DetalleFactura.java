package ejercicios;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        double impuesto =  0.19;
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Escriba el nombre de la factura: ");
        String nombreFactura = entrada.nextLine();
        System.out.println("escriba el precio del primer producto: ");
        double precioUno = entrada.nextDouble();
        System.out.println("escriba el precio del segundo producto");
        double precioDos = entrada.nextDouble();

        double antesImpuesto = (precioUno + precioDos);
        double soloImpuesto = (precioUno + precioDos) * impuesto;
        double totalMasImpuesto = antesImpuesto + soloImpuesto;

        System.out.println("la factura: " + nombreFactura + "\ntiene un bruto de: " + antesImpuesto + "\ncon un impuesto de: "
        + soloImpuesto + "\ny el monto despues de impuesto: " + totalMasImpuesto);


    }
}
