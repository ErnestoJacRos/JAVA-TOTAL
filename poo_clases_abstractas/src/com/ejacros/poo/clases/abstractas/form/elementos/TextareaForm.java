package com.ejacros.poo.clases.abstractas.form.elementos;

public class TextareaForm extends ElementoFrom{
    private int filas;
    private int columnas;

    ///////////////////////////////////////////////////////////////////////////////////////////

    public TextareaForm(String nombre) {
        super(nombre);
    }

    public TextareaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    public int getFilas() {
        return this.filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return this.columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String dibujarHtml() {
        return "<textarea name = " + this.nombre +
                "cols= " + this.columnas +
                "rows= " +this.filas +">" +
                "valor= " + this.valor +
                "</textarea>";
    }
}
