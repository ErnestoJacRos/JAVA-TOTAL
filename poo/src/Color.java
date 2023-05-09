/*personalizamos las constantes del enum con String color*/
public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    /*ponemos el método toString para que cunado se llame se imprima como le hemos personalizado*/
    @Override
    public String toString() {
        return this.color;
    }
}

/* ENUM sin personalizar
* public enum Color {
    ROJO,
    AMARILLO,
    AZUL,
    BLANCO,
    GRIS,
    NARANJA
}*/
