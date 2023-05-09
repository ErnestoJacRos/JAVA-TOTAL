package com.ejacros.almacen.dominio;

public class Fruta extends Producto{
    /*variables de instancia o atributos*/
    private double peso;
    private String color;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/
    public Fruta(String nombre, double precio, double peso, String color){
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }
//////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public double getPeso() {
        return this.peso;
    }

    public String getColor() {
        return this.color;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/
}
