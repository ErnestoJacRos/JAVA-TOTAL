package com.jacros.appfacturas.modelo;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private ItemFactura [] items;
    private int folio;
    private String descripcion;
    private Date fecha;

    private int indiceItems;

    private static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(Cliente cliente, String descripcion) {
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.folio = ++Factura.ultimoFolio;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return this.folio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   // public double calcularTotal(){}

    //public String verDetalle(){}

    public ItemFactura[] getItems() {
        return this.items;
    }

    public void addItems(ItemFactura item){

        if (indiceItems < MAX_ITEMS) {
            this.items[this.indiceItems++] = item;
        }
    }

    public float calculatTotal(){
        float total = 0.0f;
            for (ItemFactura item : this.items){
                //total += item.calcularImporte();
            }
            return total;

    }
}
