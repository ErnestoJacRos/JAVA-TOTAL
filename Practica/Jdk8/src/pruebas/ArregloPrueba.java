package pruebas;

public class ArregloPrueba {
    public static void main(String[] args) {

        /*Comprobando com el valor por defecto de tipos primitivos y tipos referencia */
        int[] arregloInt = new int[3];
        System.out.println("arregloInt = " + arregloInt[1]);//valor por defecto tipo primitivo es cero

        Integer[] arregloInteger = new Integer[1];
        System.out.println("arregloInteger = " + arregloInteger[0]);//valor por defecto tipo referencia es null


        }
    }

