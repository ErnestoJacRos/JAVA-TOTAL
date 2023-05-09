package com.ejacros.almacen.dominio;

public class NoPerecible extends Producto{
    /*variables de instancia o atributos*/
    private int contenido;
    private int calorias;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/
    public NoPerecible(String nombre, double precio, int contenido, int calorias){
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }
//////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public int getContenido() {
        return this.contenido;
    }

    public int getCalorias() {
        return this.calorias;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/
}
