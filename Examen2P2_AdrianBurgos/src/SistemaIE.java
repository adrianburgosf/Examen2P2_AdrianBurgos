
public class SistemaIE extends Partes{
    private int pantallas;
    private boolean visor;
    private int ancho;

    public SistemaIE(int pantallas, boolean visor, int ancho) {
        this.pantallas = pantallas;
        this.visor = visor;
        this.ancho = ancho;
        super.setTiempoEnsamblaje();
    }

    public int getPantallas() {
        return pantallas;
    }

    public void setPantallas(int pantallas) {
        this.pantallas = pantallas;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return pantallas+";"+visor+";"+ancho;
    }
    
}
