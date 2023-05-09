package com.jacros.poosobrecarga;


public class Calculadora {

    private Calculadora() {
    }

    public static int suma(int... argumentos){
        int total = 0;
        for (int indice = 0; indice <argumentos.length; indice++) {
            total += argumentos[indice];
        }
        return total;
    }

    public static  float suma(float a, int... argumentos){
        float total = a;
        for (int indice = 0; indice <argumentos.length; indice++) {
            total += argumentos[indice];
        }
        return total;
    }

    public static double suma(double... varargs){
        double total = 0.0;
        for (int indice = 0; indice < varargs.length ; indice++) {
            total += varargs[indice];
        }
        return total;
    }

    public static long suma(long a , long b){
        return a + b;
    }

    public static int suma(int a, int b){
        return a + b;
    }
    public static float suma(float a, float b){
        return a + b;
    }

    public static float suma(int a, float b){
        return a + b;
    }

    public static float suma(float a, int b){
        return a + b;
    }

    public static double suma(double a, double b){
        return a + b;
    }

    public static int suma(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e ){
            return resultado =  0;
        }

        return resultado;
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }





}
