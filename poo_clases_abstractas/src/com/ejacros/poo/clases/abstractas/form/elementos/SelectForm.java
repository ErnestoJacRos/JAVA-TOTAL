package com.ejacros.poo.clases.abstractas.form.elementos;

import com.ejacros.poo.clases.abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoFrom {

    private List<Opcion> opciones; //List es interface (genérico)


    ////////////////////////////////////////////////////////////////////////////////////////
    public SelectForm(String nombre){
        super(nombre);
        this.opciones = new ArrayList<Opcion>();//se inicializa con una clase concreta: ArrayList


    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;//retornamos la misma instancia para encadenar el método
    }
    ////////////////////////////////////////////////////////////////////////////////////////

    @Override public String dibujarHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        for(Opcion opcion : this.opciones){
            sb.append("\noption value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append("> ").append(opcion.getNombre())
                    .append("</option");
        }
        sb.append("</Select>");
        return sb.toString();
    }
}
