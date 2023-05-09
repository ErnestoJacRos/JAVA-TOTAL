package com.ejacros.compania;

public class Empleado extends Persona{
    /*variables de instancia o atributos*/
    private double remuneracion;
    private int empleadoId;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, int empleadoId, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public double getRemuneracion() {
        return this.remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return this.empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += this.remuneracion *(porcentaje/100);

    }
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + remuneracion +
                ",\n empleadoId=" + empleadoId;
    }
}
