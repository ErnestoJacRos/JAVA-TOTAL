package com.ejacros.almacen.dominio;

public class Producto {
    /*variables de instancia o atributos*/
    protected String nombre;
    protected double precio;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/

}
