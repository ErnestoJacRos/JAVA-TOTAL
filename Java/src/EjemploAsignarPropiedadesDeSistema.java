import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        /*el objeto nos obliga a poner un try and catch para manejar el error en caso de que este mal*/

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            /*cargamos el archivo con el método de instancia load()*/
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto Proper...");
            //Las configuramos para que aparezcan
            System.setProperties(p);
            //Listamos las Properties
            Properties ps =System.getProperties();
            //para obtener la property por objeto o Clase como es el segundo renglón
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("otra"));
            ps.list(System.out);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
