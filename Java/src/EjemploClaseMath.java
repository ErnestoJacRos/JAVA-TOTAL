public class EjemploClaseMath {
    public static void main(String[] args) {
        /*Valor absoluto de la clas Math*/

        int ValorAbsoluto = Math.abs(-8);
        System.out.println("ValorAbsoluto = " + ValorAbsoluto);

        /*Valor Máximo y valor Mínimo entre dos valores tiene sobre carga de métodos así que puedes diferentes valores*/
        double valorMax = Math.max(89.12,89.13);
        System.out.println("valorMax = " + valorMax);

        double valorMin = Math.min(89.12,89.13);
        System.out.println("valorMin = " + valorMin);

        /*redondea hacia arriba  */

        double techo = Math.ceil(8.2);
        System.out.println("techo = " + techo);

        /*redondea hacia abajo */

        double piso = Math.floor(3.9);
        System.out.println("piso = " + piso);

        /*redondea según su valor decimal y retorna un entero
        * redondea hacia donde está más cercano  */
        long entero = Math.round(4.8);
        System.out.println("entero = " + entero);

        /*como vemos los métodos son estáticos o sea de la clase y son así, ya que
        * la clase es final el constructor es privado por eso no se pueden crear instancias*/

        /*Exponencial */
        double exp = Math.exp(1);
        System.out.println("exp = " + exp); //es una constante

        /*Logaritmo natural */

        double log = Math.log(10);//toma como base la constante anterior 
        System.out.println("logNatural de 10 = " + log);

        /*Potencia */

        double potencia = Math.pow(2,3);
        System.out.println("potencia = " + potencia);

        /*Raíz Cuadrada*/

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        /*Métodos para trigonometría  */

        double grados = Math.toDegrees(1.57);
        System.out.println("convertir de radianes a grados = " + grados);

        double resultado = Math.PI / 3; //radianes
        System.out.println("resultado = " + resultado);

        double gradosDos = Math.toDegrees(resultado); //de radianes a grados
        System.out.println("gradosDos = " + gradosDos);

        /*de grados a radianes */

        double radianes = Math.toRadians(90.00);
        System.out.println(" Conversión de grados a radianes = " + radianes);

        double grados2 = Math.toDegrees(radianes);
        System.out.println("grados2 = " + grados2);

        /*Seno */

        System.out.println("(Seno) => sin(90): " + Math.sin(radianes));//recibe un double pero en radianes
        System.out.println("(Coseno) => cons(90): " + Math.cos(radianes));//recibe un double pero en radianes

    }
}
