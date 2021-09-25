public class Vehiculo {
    private String VIN;
    private String color;
    private Bateria bateria;
    private Carroceria carroceria;
    private Interior interior;
    private SistemaIE sistemaie;
    private String marcaAudio;
    private int cantidadAsientos;
    private Asientos asientos;

    public Vehiculo(String VIN, String color, Bateria bateria, Carroceria carroceria, Interior interior, SistemaIE sistemaie, String marcaAudio, int cantidadAsientos, Asientos asientos) {
        this.VIN = VIN;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.sistemaie = sistemaie;
        this.marcaAudio = marcaAudio;
        this.cantidadAsientos = cantidadAsientos;
        this.asientos = asientos;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public SistemaIE getSistemaie() {
        return sistemaie;
    }

    public void setSistemaie(SistemaIE sistemaie) {
        this.sistemaie = sistemaie;
    }

    public String getMarcaAudio() {
        return marcaAudio;
    }

    public void setMarcaAudio(String marcaAudio) {
        this.marcaAudio = marcaAudio;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }

    
    

    @Override
    public String toString() {
        return "Vehiculo[" + "VIN: " + VIN + ", Color: " + color + ", Marca del sistema de audio:" + marcaAudio + ", Cantidad de asientos:" + cantidadAsientos + ']';
    }
    
}
