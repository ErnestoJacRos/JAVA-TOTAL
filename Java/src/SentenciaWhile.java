

public class SentenciaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 5){
            System.out.println("contador = " + contador);
            contador++;
        }
        System.out.println("contador fuera del loop");
        System.out.println("contador = " + contador);
        contador = 0;//se reasigna a cero de nuevo, ya que con el while de arriba el contador se queda en 6
         boolean prueba = true;
         while (prueba){
             if ( contador == 7){
                 prueba = false;
             }
             System.out.println("contador = " + contador);
             contador++;
         }


         /*Do While primero se ejecuta y después evalúa*/
        prueba = false;
        do {
            System.out.println("Se ejecuta lamenos una vez");
        }while (prueba);
    }
}
