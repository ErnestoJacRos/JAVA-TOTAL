public class Cliente {
    private String nombreCiente;
    private String apellidoCliebte;

    public Cliente(String nombreCiente, String apellidoCliebte){
        this.nombreCiente = nombreCiente;
        this.apellidoCliebte = apellidoCliebte;
    }

    public String getNombreCiente() {
        return nombreCiente;
    }

    public String getApellidoCliebte() {
        return apellidoCliebte;
    }

    @Override
    public String toString() {
        return this.nombreCiente + " " + this.apellidoCliebte;
    }
}
