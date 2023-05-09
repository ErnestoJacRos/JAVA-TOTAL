package test;

import com.ejacros.almacen.dominio.*;
 
public class TestAlmacen {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Lacteo("leche",32.50,1,56);
        productos[1] = new Lacteo("queso",100,2,56);
        productos[2] = new Fruta("fresa",180,1000,"rojo");
        productos[3] = new  Fruta("sandia",60, 10000,"verde");
        productos[4] = new Limpieza("detergente",120,"salvo",900);
        productos[5] = new Limpieza("cloro",10,"purific",1000);
        productos[6] = new NoPerecible("harina",50, 170,25);
        productos[7] = new NoPerecible("sardian",10, 80,56);

        for (Producto producto : productos){
            System.out.println("==============" + producto.getClass().getSimpleName() + "==========================");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            if (producto instanceof  Fruta){
                System.out.println("Peso: " + ((Fruta)producto).getPeso());
                System.out.println("Color: " + ((Fruta)producto).getColor());
            } else if (producto instanceof  Limpieza) {
                System.out.println("Componenetes: " + ((Limpieza)producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza)producto).getLitros());
            } else if (producto instanceof Lacteo) {
                System.out.println("Cantidad: " + ((Lacteo)producto).getCantidad() );
                System.out.println("Proteínas: " + ((Lacteo)producto).getProteinas());
            } else if (producto instanceof NoPerecible) {
                System.out.println("Calorías: " + ((NoPerecible)producto).getCalorias());
                System.out.println("Contenido: " + ((NoPerecible)producto).getContenido());

            }
        }


    }
}
