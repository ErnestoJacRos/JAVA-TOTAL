public enum TipoAutomovil {
    SEDAN("Sedan",4,"Autonormal"),
    STATION_WAGON("Station Wagon",4,"Audo Grande"),
    HATCHBACK("Hatchback ",4,"Auto compacto"),
    PICKUP("Pickup", 4,"Camioneta"),
    COUPE("Coupé",2, "Auto Pequeño"),
    CONVERTIBLE("Convertible",2,"Auto Deportivo"),
    FURGON("Furgón",5 ,"Auto Utilitario"),
    SUV("Suv",5,"Todo terreno deportivo");

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;



    TipoAutomovil(String nombre, int numeroPuertas, String descripcion){
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    /*@Override
    public String toString() {
        return "\n " + this.nombre+
                "\n " + this.numeroPuertas +
                "\n " + this.descripcion;
    }*/
}
