import java.util.Random;

public class Partes {
    static Random rand = new Random();
    private int tiempoEnsamblaje;

    public Partes() {
    }

    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }

    public void setTiempoEnsamblaje() {
        this.tiempoEnsamblaje = rand.nextInt(20 - 5 + 5) + 5;
    }
    
    
}
