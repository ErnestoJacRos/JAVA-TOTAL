package com.ejacros.almacen.dominio;

public class Lacteo extends  Producto{
    /*variables de instancia o atributos*/
    private int cantidad;
    private int proteinas;

//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }
//////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public int getCantidad() {
        return this.cantidad;
    }

    public int getProteinas() {
        return this.proteinas;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/
}
