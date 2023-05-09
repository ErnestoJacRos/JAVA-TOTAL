public class TestAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.fabricante = "Subaru";
        auto.modelo = "Inpreza";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        auto.detalle();
        mazda.detalle();
    }
}
