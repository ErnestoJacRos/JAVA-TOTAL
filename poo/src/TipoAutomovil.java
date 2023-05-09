public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5 ),
    HATCHBACK("HatchBack", "Auto Compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE ("Convertible", "Auto Deportivp", 2),
    FURGON("Furgon", "Auto Utilitario", 2),
    SUV("Suv","Todo terreno ",5);




    private final String nombre;
    private final String descripcion;
    private final int puertas;

    TipoAutomovil(String nombre, String descripcion, int puertas){
        this.nombre =  nombre;
        this.descripcion = descripcion;
        this.puertas = puertas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getPuertas() {
        return this.puertas;
    }

    @Override
    public String toString() {
        return this.nombre + "\n" + this.descripcion + "\n" +  this.puertas;
    }
}
