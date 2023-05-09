import java.util.Date;

public class TestOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("prodcutos tienda");
        orden1.setClienta(new Cliente("Adriana","Pérez"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Maruchan","Sopa MAruchan",20));
        orden1.addProducto(new Producto("Gamesa","Galletas Gamesa",15));
        orden1.addProducto(new Producto("CocaCola","Refresco Coca cola",47));
        orden1.addProducto(new Producto("Bimbo","Mantecadas",25));


        OrdenCompra orden2 = new OrdenCompra("Productos para Pc");
        orden2.setClienta(new Cliente("Sara", "Garcia"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Sansumg","Monitor",3500));
        orden2.addProducto(new Producto("Logitech","Mouse",1200));
        orden2.addProducto(new Producto("Logitech","KeyBoar",3500));
        orden2.addProducto(new Producto("AMD","Precesador AM10",4800));

        OrdenCompra orden3 = new OrdenCompra("Prodcutos Muebleria");
        orden3.setClienta(new Cliente("Mónica","Alvarado"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Troncoso","Silla",800));
        orden3.addProducto(new Producto("Troncoso","Sillón",4000));
        orden3.addProducto(new Producto("Troncoso","Mesa",2000));
        orden3.addProducto(new Producto("Troncoso","Tv",9000));


        OrdenCompra[] ordenes = {orden1, orden2 ,orden3};

        for (int indice = 0; indice < ordenes.length; indice++) {
            System.out.println("numero de orden: " + ordenes[indice].getIdentificador());
            System.out.println("Cliente: " + ordenes[indice].getClienta());
            System.out.println("Descripción: " + ordenes[indice].getDescripcion());
            System.out.println("Fecha: " + ordenes[indice].getFecha());
            System.out.println("Total: " + ordenes[indice].sumaGranTotal());

            int indice2 = 1;
            for (Producto producto : ordenes[indice].getProductos()){
                System.out.println("Producto " + indice2 + ": " + producto.getNombreProducto() + " " + producto.getFabricante() +
                        " Precio: " +producto.getPrecio() );
                indice2++;
            }
            System.out.println();
        }
    }

}
