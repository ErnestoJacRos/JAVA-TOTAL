package com.ejacros.poo.clases.abstractas.form.elementos;

public class InputForm extends ElementoFrom{
    private String tipo = "text";
    ///////////////////////////////////////////////////////////////////////

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

////////////////////////////////////////////////////////////////////////

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    ////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////

    @Override
    public String dibujarHtml() {
        return "<input type = " + this.tipo+
                "'' name = ''" +this.nombre+
                        " value = "+this.valor +">";
    }
}
