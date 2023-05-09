package com.ejacros.compania;

public class Gerente extends  Empleado{

    /*variables de instancia o atributos*/
    private double presupuesto;

//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/

    public Gerente(String nombre, String apellido, String numeroFiscal,
                   String direccion, int empleadoId, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, empleadoId, remuneracion);
        this.presupuesto = presupuesto;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @Override*/

    @Override
    public String toString() {
        return super.toString()
                + ",\n presupuesto: " + this.presupuesto;
    }
}
