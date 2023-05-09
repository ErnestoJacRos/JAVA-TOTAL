package pruebas;

import javax.swing.*;

public class ForNombre {
    public static void main(String[] args) {
        String [] arreglo = {"Ernesto", "Sara", "María", "Rafael", "Federico", "Don Ramon"};

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre  a buscar ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int indice = 0; indice < arreglo.length; indice++) {
            if (arreglo[indice].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,"el nombre: " + buscar + " Se encontró");
        }else {
            JOptionPane.showMessageDialog(null,"el nombre: " + buscar + " No se encontró");

        }

    }
}
