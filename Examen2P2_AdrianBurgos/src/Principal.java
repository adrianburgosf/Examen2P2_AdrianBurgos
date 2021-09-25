import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    //Para elimnar carros o un ensamblador hay un popupmenu cuando haces click en la lista y tenes algo seleccionado
    public Principal() {
        initComponents();
        cargarEnsamblador();
        cargarVehiculo();
        updateVehiculos();
        updateEnsambladores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDAgregarVehiculo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jBAgregarVehiculo = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jDAgregarEnsamblador = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTGenero = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jSEdad = new javax.swing.JSpinner();
        jBAgregarEnsamblador = new javax.swing.JButton();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItemEliminar2 = new javax.swing.JMenuItem();
        jDEnsamblar = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLTiempo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLParte = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jBEnsamblar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Crear Vehiculo");

        jLabel2.setText("VIN:");

        jLabel3.setText("Color:");

        jLabel4.setText("Marca sistema de audio:");

        jLabel5.setText("Cantidad de asientos:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Bateria");

        jLabel7.setText("Autonomia:");

        jLabel8.setText("Material:");

        jLabel9.setText("Capacidad del maletero");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Carroceria");

        jLabel11.setText("Tipo:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("General");

        jLabel13.setText("Tipo de Volante:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Interior");

        jLabel15.setText("Material:");

        jLabel16.setText("Cantidad de Botones:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Sistema IE");

        jLabel19.setText("Cantidad de pantallas:");

        jLabel20.setText("Ancho de pantalla:");

        jLabel17.setText("Visor?");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Asientos");

        jLabel22.setText("Material:");

        jLabel23.setText("Tipo de asiento:");

        jRadioButton2.setText("Falso/Verdadero");

        jLabel24.setText("Masaje?");

        jRadioButton1.setText("Falso/Verdadero");

        jBAgregarVehiculo.setText("Agregar Vehiculo");
        jBAgregarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarVehiculoMouseClicked(evt);
            }
        });

        jRadioButton3.setText("Manual/Electrico");

        javax.swing.GroupLayout jDAgregarVehiculoLayout = new javax.swing.GroupLayout(jDAgregarVehiculo.getContentPane());
        jDAgregarVehiculo.getContentPane().setLayout(jDAgregarVehiculoLayout);
        jDAgregarVehiculoLayout.setHorizontalGroup(
            jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel21)
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton3)))))
                        .addGap(100, 100, 100)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1))
                            .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinner3))
                                .addComponent(jLabel14)
                                .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                    .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2))
                            .addComponent(jLabel10)
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jSpinner5)))))
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDAgregarVehiculoLayout.setVerticalGroup(
            jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel12)
                        .addGap(21, 21, 21)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jRadioButton1))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDAgregarVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jRadioButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jDAgregarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel24))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jBAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemEliminar);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel25.setText("Crear Ensamblador");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("ID:");

        jTID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Nombre:");

        jTNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Genero:");

        jTGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Edad:");

        jBAgregarEnsamblador.setText("Agregar Ensamblador");
        jBAgregarEnsamblador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarEnsambladorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDAgregarEnsambladorLayout = new javax.swing.GroupLayout(jDAgregarEnsamblador.getContentPane());
        jDAgregarEnsamblador.getContentPane().setLayout(jDAgregarEnsambladorLayout);
        jDAgregarEnsambladorLayout.setHorizontalGroup(
            jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDAgregarEnsambladorLayout.createSequentialGroup()
                .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDAgregarEnsambladorLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(67, 67, 67)
                        .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jTGenero)
                            .addComponent(jTID)))
                    .addGroup(jDAgregarEnsambladorLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel25))
                    .addGroup(jDAgregarEnsambladorLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jBAgregarEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jDAgregarEnsambladorLayout.setVerticalGroup(
            jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDAgregarEnsambladorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addGap(38, 38, 38)
                .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDAgregarEnsambladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jSEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jBAgregarEnsamblador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jMenuItemEliminar2.setText("Eliminar");
        jMenuItemEliminar2.setToolTipText("");
        jMenuItemEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminar2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItemEliminar2);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel32.setText("Ensamblaje");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("Tiempo Transcurrido:");

        jLTiempo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLTiempo.setText("jLabel34");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Parte Ensamblada", "Tiempo en ensamblar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("Parte siendo ensamblado:");

        jLParte.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLParte.setText("jLabel36");

        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jDEnsamblarLayout = new javax.swing.GroupLayout(jDEnsamblar.getContentPane());
        jDEnsamblar.getContentPane().setLayout(jDEnsamblarLayout);
        jDEnsamblarLayout.setHorizontalGroup(
            jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEnsamblarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDEnsamblarLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jDEnsamblarLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jLTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(jDEnsamblarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDEnsamblarLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLParte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jDEnsamblarLayout.setVerticalGroup(
            jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDEnsamblarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLTiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDEnsamblarLayout.createSequentialGroup()
                        .addGroup(jDEnsamblarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLParte))
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 280));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Agregrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Vehiculos", jPanel1);

        jList2.setModel(new DefaultListModel());
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton2.setText("Agregrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Ensambladores", jPanel2);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Vehiculo a ser ensamblado:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("Ensamblador asignado:");

        jBEnsamblar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBEnsamblar.setText("Ensamblar");
        jBEnsamblar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEnsamblarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEnsamblar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jBEnsamblar)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ordenar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jDAgregarVehiculo.setModal(true);
        jDAgregarVehiculo.pack();
        jDAgregarVehiculo.setLocationRelativeTo(this);
        jDAgregarVehiculo.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jBAgregarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarVehiculoMouseClicked
        // TODO add your handling code here:
        Bateria b = new Bateria(Integer.parseInt(jTextField4.getText()), jTextField5.getText());
        Carroceria c = new Carroceria(jTextField6.getText(), (Integer) jSpinner2.getValue());
        Interior i = new Interior(jTextField7.getText(), jTextField8.getText(),(Integer) jSpinner3.getValue());
        SistemaIE ie = new SistemaIE((Integer) jSpinner5.getValue(), jRadioButton1.isSelected() ,(Integer) jSpinner4.getValue());
        Asientos a = new Asientos(jTextField9.getText(), jRadioButton3.isSelected(), jRadioButton2.isSelected());
        Vehiculo v = new Vehiculo(jTextField1.getText(), jTextField2.getText(), b, c, i, ie, jTextField3.getText(), (Integer) jSpinner1.getValue(), a);
        vehiculos.add(v);
        try {
            guardarVehiculo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateVehiculos();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jDAgregarVehiculo.setVisible(false);
    }//GEN-LAST:event_jBAgregarVehiculoMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        updateVehiculos();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (jList1.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // TODO add your handling code here:
        vehiculos.remove(jList1.getSelectedIndex());
        updateVehiculos();
        try {
            guardarVehiculo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        // TODO add your handling code here:
        if (jList2.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                jPopupMenu2.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jBAgregarEnsambladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarEnsambladorMouseClicked
        // TODO add your handling code here:
        Ensamblador e = new Ensamblador(jTID.getText(), jTNombre.getText(), jTGenero.getText(), (Integer)jSEdad.getValue());
        ensambladores.add(e);
        try {
            guardarEnsamblador();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateEnsambladores();
        jTNombre.setText("");
        jTID.setText("");
        jTGenero.setText("");
        jSEdad.setValue(0);
        jDAgregarEnsamblador.setVisible(false);
        
    }//GEN-LAST:event_jBAgregarEnsambladorMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jDAgregarEnsamblador.setModal(true);
        jDAgregarEnsamblador.pack();
        jDAgregarEnsamblador.setLocationRelativeTo(this);
        jDAgregarEnsamblador.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenuItemEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminar2ActionPerformed
        // TODO add your handling code here:
        ensambladores.remove(jList2.getSelectedIndex());
        try {
            guardarEnsamblador();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateEnsambladores();
    }//GEN-LAST:event_jMenuItemEliminar2ActionPerformed

    private void jBEnsamblarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEnsamblarMouseClicked
        // TODO add your handling code here:
        int opcion = 0;
        int x = ensambladores.get(jComboBox2.getSelectedIndex()).getVehiculosEnsamblados();
        if (x <= 5) {
            opcion = 1;
        }
        else if (x >= 6 && x <= 15) {
            opcion = 2;
        }
        else if (x >= 16 && x <= 30) {
            opcion = 3;
        }
        else if (x > 30) {
            opcion = 4;
        }
        int porcentaje = 0;
        switch (opcion) {
            case 1: {
                porcentaje = 30;
                break;
            }
            case 2: {
                porcentaje = 22;
                break;
            }
            case 3: {
                porcentaje = 13;
                break;
            }
            case 4: {
                porcentaje = 7;
                break;
            }
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        HiloEnsamblaje HE = new HiloEnsamblaje(jProgressBar1, jLTiempo, jLParte, jTable1, 
                vehiculos.get(jComboBox1.getSelectedIndex()), porcentaje, ensambladores.get(jComboBox2.getSelectedIndex()));
        HE.start();
        jDEnsamblar.setModal(true);
        jDEnsamblar.pack();
        jDEnsamblar.setLocationRelativeTo(this);
        jDEnsamblar.setVisible(true);
        try {
            guardarEnsamblador();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBEnsamblarMouseClicked

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void updateVehiculos() {
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        modelo.removeAllElements();
        modelo.clear();
        jList1.removeAll();
        for (int i = 0; i < vehiculos.size(); i++) {
            modelo.addElement(vehiculos.get(i));
        }
        jList1.setModel(modelo);
        updateComboboxes();
    }
    
    public void updateEnsambladores() {
        DefaultListModel modelo = (DefaultListModel) jList2.getModel();
        modelo.removeAllElements();
        modelo.clear();
        jList2.removeAll();
        for (int i = 0; i < ensambladores.size(); i++) {
            modelo.addElement(ensambladores.get(i));
        }
        jList2.setModel(modelo);
        updateComboboxes();
    }
    
    public void updateComboboxes() {
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        for (int i = 0; i < vehiculos.size(); i++) {
            jComboBox1.addItem(vehiculos.get(i).toString());
        }
        for (int i = 0; i < ensambladores.size(); i++) {
            jComboBox2.addItem(ensambladores.get(i).toString());
        }
    }
    
    public void guardarEnsamblador() throws IOException{
        File archivo = null;
        FileWriter canal = null;
        BufferedWriter ram = null;
        try {
            archivo = new File("./Ensambladores.txt");
            canal = new FileWriter(archivo, false);
            ram = new BufferedWriter(canal);
            for (int i = 0; i < ensambladores.size(); i++) {
                Ensamblador ensamblador = ensambladores.get(i);
            ram.write(ensamblador.getID()+";"+ensamblador.getNombre()+";"+ensamblador.getGenero()+";"+ensamblador.getEdad()+";"+ensamblador.getVehiculosEnsamblados());
            ram.newLine();
            }
            ram.flush();
        } catch (Exception e) {
        }
        ram.close();
        canal.close();
    }
    
    public void cargarEnsamblador() {
        File archivo=null;
        Scanner sc = null;
        try {
            //relativo
            archivo = new File("./Ensambladores.txt");
            sc = new Scanner(archivo);
            String linea = "";
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] tokens = linea.split(";");
                Ensamblador en = new Ensamblador(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
                en.setVehiculosEnsamblados(Integer.parseInt(tokens[4]));
                ensambladores.add(en);
            }
        } catch (Exception e) {
        }
        sc.close();
    }
    
    public void guardarVehiculo() throws IOException {
        File archivo = null;
        FileWriter canal = null;
        BufferedWriter ram = null;
        try {
            archivo = new File("./Vehiculos.txt");
            canal = new FileWriter(archivo, false);
            ram = new BufferedWriter(canal);
            for (int i = 0; i < vehiculos.size(); i++) {
                Vehiculo v = vehiculos.get(i);
                ram.write(v.getVIN() + ";" + v.getColor() + ";" + v.getBateria() + ";" + v.getCarroceria() + ";" + v.getInterior() + ";" + v.getSistemaie()
                        + ";" + v.getMarcaAudio() + ";" + v.getVIN() + ";" + v.getCantidadAsientos() + ";" + v.getAsientos());
                ram.newLine();
            }
            ram.flush();
        } catch (Exception e) {
        }
        ram.close();
        canal.close();
    }
    
    public void cargarVehiculo() {
        File archivo=null;
        Scanner sc = null;
        try {
            //relativo
            archivo = new File("./Vehiculos.txt");
            sc = new Scanner(archivo);
            String linea = "";
            Bateria b;
            Carroceria c;
            Interior i;
            SistemaIE ie;
            Asientos a;
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] tokens = linea.split(";");
                b = new Bateria(Integer.parseInt(tokens[2]), tokens[3]);
                c = new Carroceria(tokens[4], Integer.parseInt(tokens[5]));
                i = new Interior(tokens[6], tokens[7], Integer.parseInt(tokens[8]));
                ie =  new SistemaIE(Integer.parseInt(tokens[9]), Boolean.parseBoolean(tokens[10]), Integer.parseInt(tokens[11]));
                a = new Asientos(tokens[14], Boolean.parseBoolean(tokens[15]), Boolean.parseBoolean(tokens[16]));
                Vehiculo v = new Vehiculo(tokens[0], tokens[1], b, c, i, ie, tokens[12], Integer.parseInt(tokens[13]), a);
                vehiculos.add(v);
            }
        } catch (Exception e) {
        }
        sc.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarEnsamblador;
    private javax.swing.JButton jBAgregarVehiculo;
    private javax.swing.JButton jBEnsamblar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDAgregarEnsamblador;
    private javax.swing.JDialog jDAgregarVehiculo;
    private javax.swing.JDialog jDEnsamblar;
    private javax.swing.JLabel jLParte;
    private javax.swing.JLabel jLTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemEliminar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSpinner jSEdad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextField jTGenero;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private ArrayList <Vehiculo> vehiculos = new ArrayList();
    private ArrayList <Ensamblador> ensambladores = new ArrayList();
}
