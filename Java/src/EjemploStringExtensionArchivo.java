public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo =  "alguna.imagem.pdf";
        /*nos deveulve el último indice de la ocurrecnia que hemos puesto como argumento del método*/
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        /*Queremos que nos devuelva la extension del archivo, entonces vamos a sustraer con la ayuda
        * del pundo que nos indica la extensio del archvio y como ya tenemos ese indice en el metodo de arriba
        * nos basaremos en ello
        * como ya sabemos el método substring recibe un entero y devuelve un String
        * y ese String, que ese String se va a evaluar o a extraer dependiendo el indice que nosotros
        * pongamos como argumento del metodo
        * */
        System.out.println("archivo = " + archivo.substring(i + 1));





    }
}
