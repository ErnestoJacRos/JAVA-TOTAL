/*Clase identidad que representa datos */
public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Tanque tanque;

    private Persona conductor;
    private  Rueda[] ruedas;

    private TipoAutomovil tipo;
    private int indiceRuedas;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 80;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

//////////////////////////////////////////////////////////////////////////////
    public Automovil(){

        id = ++ultimoId;
        this.ruedas =  new Rueda[5];
    }

    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }

    public Automovil(String fabricante, String modelo){
        this(fabricante);
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        this(fabricante,modelo,color,motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }
    //////////////////////////////////////////////////////////////////////////////////////

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCapacidadTanqueEstatico() {
        return Automovil.capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public static Color getColorPatente() {
        return Automovil.colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante() {
        return this.fabricante;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public TipoAutomovil getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {

        if (this.tanque == null){
            this.tanque = new Tanque();
        }
        return this.tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return this.conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    //////////////////////////////////////////////////////////////////////////

    public Automovil  addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public String verDetalle(){
        String detalle = "auto.fabricante = " + this.fabricante +
                "\nauto.Id = " + this.id +
                "\nauto.modelo = " + this.modelo;

                if (this.tipo != null){
                   detalle += "\nauto.tipo = " + this.tipo.getDescripcion();
                }
                detalle += "\nauto.color = " + this.color +
                "\nauto.colorPatente = " + Automovil.colorPatente ;
                if (this.motor != null) {
                    detalle += "\nauto.cilindrada = " + this.motor.getCilidranda();
                }
                if (this.conductor != null) {
                    detalle += "\nCondutor de " + this.getModelo() + ": " + this.getConductor();
                }

                if (getRuedas() != null){
                    detalle += "\n ruedas del automóvil;";
                    for (Rueda r : this.getRuedas()){
                        detalle += "\n "+ (r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho() );
                    }
                }
                return detalle;
    }

    public String acelerar(int rpm){
        return "el auto: " + this.fabricante + " acelerando a " + rpm + "rpm";
     }

     public String frenar (){
        return this.fabricante + " " + this.modelo + " frenando";
     }

     public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm),
                frenar = this.frenar();

        return acelerar + "\n" + frenar;
     }

     public float calcularConsumo(int km, float porcentajeGasolina){
        return km /(this.getTanque().getCapacidad() * porcentajeGasolina);

     }

    public float calcularConsumo(int km, int porcentajeGasolina){
        return km /(this.getTanque().getCapacidad() * (porcentajeGasolina / 100f));

    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km /(Automovil.capacidadTanqueEstatico * (porcentajeGasolina / 100f));

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {

        return this.id + " : " + this.fabricante + " " + this.modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Automovil) ){
            return false;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null &&
                this.modelo != null &&
                this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.getFabricante());
    }
}
