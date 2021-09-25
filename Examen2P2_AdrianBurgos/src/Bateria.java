
public class Bateria extends Partes{
    private int autonomia;
    private String material;

    public Bateria(int autonomia, String material) {
        this.autonomia = autonomia;
        this.material = material;
        super.setTiempoEnsamblaje();
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return autonomia+";"+material;
    }
}
