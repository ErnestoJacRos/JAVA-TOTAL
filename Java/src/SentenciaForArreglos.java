import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String [] arreglo = {"Ernesto", "Sara", "María", "Rafael", "Federico", "Don Ramon"};

       for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(indice + " Nombre -> " + arreglo[indice] );
        }
        /*for mejorado no sirve para modificar el arreglo, pero, si para mostrar lo que contiene
        * se necesita una variable que sea del mismo tipo que arreglo más el arreglo*/
        System.out.println("For mejorado");
        for (String indice : arreglo){
            System.out.println("indice = " + indice);
        }
        /*for para ignorar el primer y el último nombre del arreglo con palabra reservada continue
        * el cual sirva para que si la sentencia es true la salte y siga imprimiendo los parámetros
        * que no cumplen con la condición del if*/
        System.out.println("Ignorando algunos nombres, for normal");
        for (int indice  = 0; indice  < arreglo.length; indice ++) {
            if (arreglo[indice].equalsIgnoreCase("ernesto") ||
                    arreglo[indice].equalsIgnoreCase("don ramon")){
                continue;
            }
            System.out.println("arreglo = " + arreglo[indice]);
        }
        System.out.println("Ignorando algunos nombres, pero, con el for mejorado");
        for (String indice : arreglo){
            if (indice.equalsIgnoreCase("ernesto") ||
                indice.equalsIgnoreCase("don ramon")){
                continue;
            }
            System.out.println("arreglo = " + indice);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre  a buscar ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int indice = 0; indice < arreglo.length; indice++) {
            if (arreglo[indice].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }

        if (encontrado){//aquí no es necesario poner una condición, ya que encontrado es true y por eso se va a ejecutar
            //hay que recordar que mientras sea verdadera se ejecutará, pero, si lo ponemos así en un
            //loop será infinito, porque si no se convierte en falso en algún del loop no se detendrá
            JOptionPane.showMessageDialog(null,"el nombre: " + buscar + " Se encontró");
        }else {
            JOptionPane.showMessageDialog(null,"el nombre: " + buscar + " No se encontró");

        }


    }
}
