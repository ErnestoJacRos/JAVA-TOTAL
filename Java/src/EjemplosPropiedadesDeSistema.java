import java.util.Properties;

public class EjemplosPropiedadesDeSistema {
    public static void main(String[] args) {
        String user = System.getProperty("user.name");
        System.out.println("user = " + user);

        String homeUser = System.getProperty("user.home");
        System.out.println("homeUser = " + homeUser);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String versionJava = System.getProperty("java.version");
        System.out.println("versionJava = " + versionJava);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "nueva Linea");

        String lineSeparatorDos = System.lineSeparator();//método funciona igual
        System.out.println("lineSeparatorDos con método = " + lineSeparatorDos + "Nueva Linea");

        /*Para listar las propiedades de system*/

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
