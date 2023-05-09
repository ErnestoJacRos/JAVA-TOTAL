package com.ejacros.compania;

public class Persona {
private String nombre;
private String apellido;
private String numeroFiscal;
private String direccion;
////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getNumeroFiscal() {
        return this.numeroFiscal;
    }
    public String getDireccion() {
        return this.direccion;
    }

 ////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return
                "\nnombre='" + nombre +
                ",\n apellido='" + apellido +
                ",\nnumeroFiscal='" + numeroFiscal +
                ",\ndireccion='" + direccion ;
    }
}
