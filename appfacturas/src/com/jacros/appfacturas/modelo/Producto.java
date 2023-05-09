package com.jacros.appfacturas.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;


    private static int ultimoid;

    public Producto(){

        this.codigo = ++Producto.ultimoid;
    }

    public int getCodigo() {
        return this.codigo;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
