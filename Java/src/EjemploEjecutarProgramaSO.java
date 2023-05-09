import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        /* Runtime Nos permite ejecutar aplicaciones con el método exec()*/
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if (System.getProperty("os.name").startsWith("Windows")){
                proceso = rt.exec("notepad");
            }else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();// se queda esperando hasta que nosotros cerremos el programa
        }catch (Exception e){

            System.err.println("El comando es desconocido" + e.getMessage());
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
