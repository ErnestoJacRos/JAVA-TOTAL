public class Producto {
    private String fabricante;
    private String nombreProducto;
    private int precio;

    public Producto(String fabricante, String nombreProducto, int precio){
        this.fabricante = fabricante;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getPrecio() {
        return this.precio;
    }
}
