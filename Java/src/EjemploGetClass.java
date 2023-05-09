import java.lang.reflect.Method;

public class EjemploGetClass {
    public static void main(String[] args) {
        /*el método getClass() del objeto para reflexión y metadata de la clase
        * Da información sobre el objeto*/
        String texto = "Hola";
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());/*devuelve de la clase del objeto
        junto con el paquete del que viene*/
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());/*nombre de la clase de donde viene
        el objeto*/
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        /*devuelve el el paquete y el nombre dle paquete */
        System.out.println("strClass = " + strClass); /*devuelve la clase junto con el paquete */

            /*para ver todo los arreglos usamos un for porque los métodos están en un arreglo*/
        for (Method metodo : strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
            }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass);//nombre de la clase y paquete
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //Nos da la clase a la que pertenece
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        /*si usamos el método getSuperclass() nos la clase number, que es a la que pertenece
        en primera instancia como perteneciente de la clase números, pero si encadenamos otro método
        * getSuperclass() nos dará la clase Object, ya que todos los objetos */


        /*para ver los métodos de la object */

        for (Method metodo : intClass.getSuperclass().getSuperclass().getMethods()){
            System.out.println("metodos de las clases  = " + metodo.getName());
        }
        }
}
