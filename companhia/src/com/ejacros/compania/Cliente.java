package com.ejacros.compania;

public class Cliente extends Persona{
    /*variables de instancia o atributos*/
    private int clienteId;
//////////////////////////////////////////////////////////////////////////////////
    /*constructores*/
    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId){
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }
//////////////////////////////////////////////////////////////////////////////////
    /*gettters and setters*/

    public int getClienteId() {
        return this.clienteId;
    }
    //////////////////////////////////////////////////////////////////////////////////
    /*métodos operaciones*/
//////////////////////////////////////////////////////////////////////////////////
    /*métodos @override*/

    @Override
    public String toString() {
        return super.toString()+
                "\nclienteId=" + clienteId;
    }
}
