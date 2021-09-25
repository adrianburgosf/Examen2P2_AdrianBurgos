import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HiloEnsamblaje extends Thread{
    static Random rand = new Random();
    private JProgressBar ensamblaje;
    private JLabel tiempoTranscurrido;
    private JLabel parte;
    private JTable table;
    private Vehiculo vehiculo;
    private Ensamblador ensamblador;
    private int tiempo;
    private int porcentaje;
    
    public HiloEnsamblaje(JProgressBar ensamblaje, JLabel tiempoTranscurrido, JLabel parte, JTable table, Vehiculo vehiculo, int porcentaje, Ensamblador ensamblador) {
        this.ensamblaje = ensamblaje;
        this.tiempoTranscurrido = tiempoTranscurrido;
        this.parte = parte;
        this.vehiculo = vehiculo;
        this.table = table;
        this.tiempo = vehiculo.getBateria().getTiempoEnsamblaje()+vehiculo.getCarroceria().getTiempoEnsamblaje()+vehiculo.getInterior().getTiempoEnsamblaje()+
                vehiculo.getSistemaie().getTiempoEnsamblaje()+vehiculo.getAsientos().getTiempoEnsamblaje();
        this.porcentaje = porcentaje;
        this.ensamblador = ensamblador;
    }
    
    public void fallo() throws IOException {
        File archivo = null;
        FileWriter canal = null;
        BufferedWriter ram = null;
        try {
            archivo = new File("./EnsamblajesFallidos.txt");
            canal = new FileWriter(archivo, true);
            ram = new BufferedWriter(canal);
            ram.write(vehiculo.toString());
            ram.newLine();
            ram.flush();
        } catch (Exception e) {
        }
        ram.close();
        canal.close();
    }
    
    @Override
    public void run() {
        int parteE = 1;
        int contador = 0;
        int segundos = 0;
        ensamblaje.setMaximum(tiempo);
        ensamblaje.setValue(0);
        tiempoTranscurrido.setText("0 Segundos");
        while(segundos != tiempo){
            switch (parteE) {
                case 1: {
                    this.parte.setText("Bateria");
                    if (contador == vehiculo.getBateria().getTiempoEnsamblaje()) {
                        contador = 0;
                        parteE = 2;
                        Object[] newrow = {
                            "Bateria",
                            segundos + "Segundos"};
                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                        modelo.addRow(newrow);
                        table.setModel(modelo);
                    }
                    break;
                }
                case 2: {
                    this.parte.setText("Carroceria");
                    if (contador == vehiculo.getCarroceria().getTiempoEnsamblaje()) {
                        contador = 0;
                        parteE = 3;
                        Object[] newrow = {
                            "Carroceria",
                            segundos + "Segundos"};
                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                        modelo.addRow(newrow);
                        table.setModel(modelo);
                    }
                    break;
                }
                case 3: {
                    this.parte.setText("Interior");
                    if (contador == vehiculo.getInterior().getTiempoEnsamblaje()) {
                        contador = 0;
                        parteE = 4;
                        Object[] newrow = {
                            "Interior",
                            segundos + "Segundos"};
                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                        modelo.addRow(newrow);
                        table.setModel(modelo);
                    }
                    break;
                }
                case 4: {
                    this.parte.setText("Sistemas de IE");
                    if (contador == vehiculo.getSistemaie().getTiempoEnsamblaje()) {
                        contador = 0;
                        parteE = 5;
                        Object[] newrow = {
                            "Sistemas de IE",
                            segundos + "Segundos"};
                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                        modelo.addRow(newrow);
                        table.setModel(modelo);
                    }
                    break;
                }
                case 5: {
                    this.parte.setText("Asientos");
                    parteE = 0;
                    break;
                }
            }
            contador++;
            segundos++;
            tiempoTranscurrido.setText(segundos+" Segundos");
            ensamblaje.setValue(ensamblaje.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
        //para agregar los asientos
        Object[] newrow = {
            "Asientos",
            segundos + "Segundos"};
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.addRow(newrow);
        table.setModel(modelo);
        //--------------------------------------------------------------------------
        int num = rand.nextInt(100) + 1;
        if (num <= porcentaje) {
            JOptionPane.showMessageDialog(table, "El ensamblador a fallado");
            try {
                fallo();
            } catch (IOException ex) {
                Logger.getLogger(HiloEnsamblaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(table, "Se ha ensamblado el vehiculo con VIN: "+vehiculo.getVIN());
            ensamblador.agregarEnsamblaje();
        }
    }
}
