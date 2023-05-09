package com.ejacros.almacen.dominio;

public class Limpieza extends  Producto{
    /*variables de instancia o atributos*/
    private String componentes;
    private double litros;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/
    public Limpieza(String nombre, double precio, String componentes, double litros){
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }
//////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public String getComponentes() {
        return this.componentes;
    }

    public double getLitros() {
        return this.litros;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/
}
