public class PasarPorValor {
    public static void main(String[] args) {
        int enteroPrimitivo = 10;//Toda variable primitiva siempre se pasa por valor porque no es del tipo objeto
        /*si otro método cambia el valor de esta variable no afecta en el método principal */
        System.out.println("Iniciamos el método \"main\" con enteroPrimitivo =  " + enteroPrimitivo);
        otroMetodo(enteroPrimitivo);
        System.out.println("Iniciamos el método \"main\" con enteroPrimitivo (se mantiene Igual)=  " + enteroPrimitivo);
    }

    public static void otroMetodo(int enteroPrimitivo){
        System.out.println("Iniciamos el método \"otroMetodo\" con enteroPrimitivo =  " + enteroPrimitivo);
        enteroPrimitivo = 35;
        System.out.println("Finalizamos el método \"otroMetodo\" con enteroPrimitivo = " + enteroPrimitivo);
    }
}
