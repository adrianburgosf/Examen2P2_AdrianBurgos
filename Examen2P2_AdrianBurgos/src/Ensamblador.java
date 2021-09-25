
public class Ensamblador {
    private String ID;
    private String nombre;
    private String genero;
    private int edad;
    private int vehiculosEnsamblados;

    public Ensamblador(String ID, String nombre, String genero, int edad) {
        this.ID = ID;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.vehiculosEnsamblados = 0;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVehiculosEnsamblados() {
        return vehiculosEnsamblados;
    }

    public void setVehiculosEnsamblados(int vehiculosEnsamblados) {
        this.vehiculosEnsamblados = vehiculosEnsamblados;
    }
    
    public void agregarEnsamblaje() {
        this.vehiculosEnsamblados++;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", ID: "+ID+", Genero: "+genero+", Edad: "+edad+", Vehiculos ensamblados: "+vehiculosEnsamblados;
    }
}
