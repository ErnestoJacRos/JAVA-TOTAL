import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un Entero ");
        String numeroString = entrada.nextLine();

        int numeroDecimal = 0;//sistema del 0 -9
        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (Exception e ){
            System.out.println("Error, Debe introducir un numero entero");
            System.out.println("e = " + e);
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        //convertir a número Binario
        //usando la clase Integer y el metodo toBynariString()
        // y meteremos como argumento un Entero
        String resultadoBinario = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        //el metodo de arriba es un el String de 500 en binario para trabajar con caculos demos tenerlo en numero
        //binario y para hacer eso creamos un int y en la literal para que no lo tome solamente como un Entero
        //anteponemos un 0B
        int numeroBinario = 0B111110100;

        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoHex = "numero HexaDecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        //para usar un numero Hexadecimla debemos anteponer 0X al numero en sistema octal
        int numeroHex =  0X1f4;//sistema que se basa en alafanumerico
        System.out.println("numeroHex = " + numeroHex);
        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        //para imprimir un numero octal y no solo lo reconozca como un simple entero anteponemos el numero 0
        int numeroOctal =  0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String mensaje = "\nnumeroDecimal = " + numeroDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\nnumeroBinario = " + numeroBinario;
        mensaje += "\n" + resultadoHex;
        mensaje += "\nnumeroHex = " + numeroHex;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\nnumeroHex = " + numeroHex;

        System.out.println("mensaje = " + mensaje);

    }
}
