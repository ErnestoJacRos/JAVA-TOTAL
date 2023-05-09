package com.ejacros.poo.clases.abstractas.form.elementos.select;

public class Opcion {
    private String valor;
    private String nombre;
    private boolean Selected;
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return this.Selected;
    }

    public void setSelected(boolean selected) {
        this.Selected = selected;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
