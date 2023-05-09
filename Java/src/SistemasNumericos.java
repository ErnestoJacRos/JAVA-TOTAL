import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 0;//sistema del 0 -9
        try{
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Digite un Entero "));
        }catch (NumberFormatException e ){
            JOptionPane.showMessageDialog(null,"Error, Debe introducir un numero entero");
            JOptionPane.showMessageDialog(null,e);
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

        JOptionPane.showMessageDialog(null,mensaje);

    }
}
