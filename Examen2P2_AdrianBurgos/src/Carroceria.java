
public class Carroceria extends Partes{
    private String tipo;
    private int capacidad;

    public Carroceria(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        super.setTiempoEnsamblaje();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return tipo+";"+capacidad;
    }
    
}
