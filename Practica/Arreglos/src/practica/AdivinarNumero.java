package practica;

import javax.swing.*;
import java.security.SecureRandom;

public class AdivinarNumero {
    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String mensaje = "Hola, " + nombre + " tienes 8 intentos para adivinar un numero que " +
        "\nha sido escogido entre los numero del 1 al 100";
          JOptionPane.showMessageDialog(null,mensaje);
          int numero;
          int numeroAleatorio = aleatorio.nextInt(101);
          int indice;
        try {


            loop:
            for (indice = 0; indice <= 7; indice++) {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero pensado"));
                if (numero >= 1 && numero <= 10) {


                    if (numero == numeroAleatorio) {
                        JOptionPane.showMessageDialog(null, "Haz ganado en el intento: " + (indice + 1));

                        break loop;
                    } else if (indice == 7) {
                        JOptionPane.showMessageDialog(null, "Has perdido. utilizaste todos tus intentos");

                    } else if (numero < numeroAleatorio) {
                        JOptionPane.showMessageDialog(null, "el numero secreto es mayor a " + numero);
                    } else {
                        JOptionPane.showMessageDialog(null, "el numero secreto es menor a " + numero);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Te mamaste, no lees bien" +
                            "\n del 1 al 100, perro.");
                }
            }
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null,"Debes ingresar un numero entero");
            JOptionPane.showMessageDialog(null, e);
            main(args);
        }
    }
}
