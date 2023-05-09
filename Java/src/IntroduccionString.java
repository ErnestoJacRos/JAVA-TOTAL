public class IntroduccionString {
    public static void main(String[] args) {
        String str1 = "   Hola Ernesto";
        String str2 = new String("Hola Ernesto");

        //checa si son el mismo objeto
        System.out.println("Son el mismo objeto? " + (str1 == str2));
        //checa si tienen el mismo valor
        System.out.println("Tiene el mismo valor? " + str1.equals(str2));//compara si ambas son igules, por valor
        System.out.println("str2 = " + str2.length());//regresa el numero de caracteres de la cadena
        System.out.println(str1.equalsIgnoreCase(str2));//compara si ambas son iguales, independiente de mayusculas y minusculas
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.trim());
        System.out.println(str1.charAt(1));
    }
}
