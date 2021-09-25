
public class Interior extends Partes{
    private String material;
    private String volante;
    private int botones;

    public Interior(String material, String volante, int botones) {
        this.material = material;
        this.volante = volante;
        this.botones = botones;
        super.setTiempoEnsamblaje();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Override
    public String toString() {
        return material+";"+volante+";"+botones;
    }
}
