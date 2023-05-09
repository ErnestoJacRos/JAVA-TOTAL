import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;

    private Date fecha;
    private Cliente clienta;
    private Producto[] productos;

    private int indiceProductos;

    private static int ultimoId;



    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
        //this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return this.identificador;
    }



    public String getDescripcion() {
        return this.descripcion;
    }


    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getClienta() {
        return this.clienta;
    }

    public void setClienta(Cliente clienta) {
        this.clienta = clienta;
    }

    public Producto[] getProductos() {
        return this.productos;
    }

    public void addProducto(Producto producto){
        if (indiceProductos < this.productos.length) {

            this.productos[this.indiceProductos++] = producto;
        }

    }

    public int sumaGranTotal(){
        int total = 0;
        for(Producto p : productos){
            total += p.getPrecio();
        }
        return total;
    }

}
