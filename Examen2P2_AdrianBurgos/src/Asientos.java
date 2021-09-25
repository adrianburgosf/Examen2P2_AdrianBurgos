
public class Asientos extends Partes{
    private String material;
    private boolean EoM;
    private boolean masaje;

    public Asientos(String material, boolean EoM, boolean masaje) {
        this.material = material;
        this.EoM = EoM;
        this.masaje = masaje;
        super.setTiempoEnsamblaje();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEoM() {
        return EoM;
    }

    public void setEoM(boolean EoM) {
        this.EoM = EoM;
    }

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return material+";"+EoM+";"+masaje;
    }
    
}
