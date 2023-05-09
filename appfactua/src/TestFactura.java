
import com.ejacros.appfacturas.modelo.*;
import java.util.Scanner;

public class TestFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura ");
        Factura factura = new Factura(entrada.nextLine(), cliente);

        Producto producto;



        for (int indice = 0; indice < 2; indice++) {
            producto = new Producto();
            System.out.print("Ingrese el prodcuto n° " + producto.getCodigo() + ": ");

            producto.setNombre(entrada.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(entrada.nextFloat());

            System.out.println("Ingrese la cantidad: ");


            factura.addItemFactura(new ItemFactura(entrada.nextInt(),producto));

            System.out.println();
            entrada.nextLine();

        }
        System.out.println(factura);

    }
}
