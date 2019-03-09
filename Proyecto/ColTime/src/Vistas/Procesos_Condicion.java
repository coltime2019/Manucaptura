package Vistas;

import Controlador.Condicion_producto;
import Controlador.RenderProcesos;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import javax.sql.rowset.CachedRowSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyAnimated;

public class Procesos_Condicion extends javax.swing.JPanel {// Dimensiones 905x673

    public Procesos_Condicion() {
        initComponents();
        consultarCondicionesProductosProcesos(0);
        consultarProcesosArea();
        estadoFormularioCondicionesProducto(false);
        consultarProductos();
        jLID.setVisible(false);
        jLArea.setVisible(false);
        jLIDCondicion.setVisible(false);
        habilitaraODesabilitarBotonesCondicionProducto(1);
        //...
    }
    // Variables
    static final String HEADER_PROCESO[] = {"ID Proceso","Nombre proceso","Estado"};
    static final String HEADER_PROCESO_PRODUCTO[] = {"ID procesos","Nombre del proceso","Orden","Seleccionado","ID seleccionP"};
    static final String HEADER_CONDICIONES[] = {"ID Condicion", "Área","idArea", "Producto", "Material", "Antisolder", "Ruteo", "¿Procesos asignados?"};
    
    CachedRowSet informacion= null;
    // ...
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnNuevaCondicionProducto = new javax.swing.JButton();
        btnGuardarCondicionProducto = new javax.swing.JButton();
        btnUpdateCondicionProducto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cbProducto = new elaprendiz.gui.comboBox.ComboBoxRound();
        jLabel4 = new javax.swing.JLabel();
        cbMaterial = new elaprendiz.gui.comboBox.ComboBoxRound();
        jLabel3 = new javax.swing.JLabel();
        cbArea = new elaprendiz.gui.comboBox.ComboBoxRound();
        jLabel5 = new javax.swing.JLabel();
        jCheckRuteo = new javax.swing.JCheckBox();
        jCheckAntisolder = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTBProcesos = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTFE = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 2){
                    return true;
                }else{
                    return false;
                }
            }
        };
        jScrollPane5 = new javax.swing.JScrollPane();
        jTTE = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 2){
                    return true;
                }else{
                    return false;
                }
            }
        };
        jScrollPane6 = new javax.swing.JScrollPane();
        jTEN = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 2){
                    return true;
                }else{
                    return false;
                }
            }
        };
        jScrollPane7 = new javax.swing.JScrollPane();
        jTGlobal = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 2){
                    return true;
                }else{
                    return false;
                }
            }
        };
        btnNuevoProceso = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTSeleeccionProcesos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                if(colIndex == 3 || colIndex == 2){
                    return true; //Disallow the editing of any cell
                }else{
                    return false; //Disallow the editing of any cell
                }
            }
        };
        btnAccionSeleccionProcesos = new javax.swing.JButton();
        jLIDCondicion = new javax.swing.JLabel();
        jLArea = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTCondicionProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(219, 219, 219));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        setToolTipText("");
        setName("Procesos"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(128, 128, 131)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Condicion producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(128, 128, 131))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel5.setLayout(null);

        btnNuevaCondicionProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_Proyect.png"))); // NOI18N
        btnNuevaCondicionProducto.setBorderPainted(false);
        btnNuevaCondicionProducto.setContentAreaFilled(false);
        btnNuevaCondicionProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCondicionProducto.setFocusPainted(false);
        btnNuevaCondicionProducto.setFocusable(false);
        btnNuevaCondicionProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_prpyect_roll.png"))); // NOI18N
        btnNuevaCondicionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCondicionProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevaCondicionProducto);
        btnNuevaCondicionProducto.setBounds(0, 0, 40, 48);

        btnGuardarCondicionProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_proyect.png"))); // NOI18N
        btnGuardarCondicionProducto.setBorderPainted(false);
        btnGuardarCondicionProducto.setContentAreaFilled(false);
        btnGuardarCondicionProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCondicionProducto.setEnabled(false);
        btnGuardarCondicionProducto.setFocusPainted(false);
        btnGuardarCondicionProducto.setFocusable(false);
        btnGuardarCondicionProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_roll.png"))); // NOI18N
        btnGuardarCondicionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCondicionProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardarCondicionProducto);
        btnGuardarCondicionProducto.setBounds(40, 0, 40, 48);

        btnUpdateCondicionProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnUpdateCondicionProducto.setBorderPainted(false);
        btnUpdateCondicionProducto.setContentAreaFilled(false);
        btnUpdateCondicionProducto.setEnabled(false);
        btnUpdateCondicionProducto.setFocusPainted(false);
        btnUpdateCondicionProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update1.png"))); // NOI18N
        btnUpdateCondicionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCondicionProductoActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdateCondicionProducto);
        btnUpdateCondicionProducto.setBounds(40, 0, 40, 48);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        cbProducto.setForeground(new java.awt.Color(102, 102, 102));
        cbProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione..." }));
        cbProducto.setColorDeBorde(new java.awt.Color(204, 204, 204));
        cbProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductoItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("Productos:");

        cbMaterial.setForeground(new java.awt.Color(102, 102, 102));
        cbMaterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "TH", "FV" }));
        cbMaterial.setColorDeBorde(new java.awt.Color(204, 204, 204));
        cbMaterial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setText("Material:");

        cbArea.setForeground(new java.awt.Color(102, 102, 102));
        cbArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Formato estandar - FE", "Teclados - TE", "Ensamble - EN" }));
        cbArea.setColorDeBorde(new java.awt.Color(204, 204, 204));
        cbArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAreaItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(128, 128, 131));
        jLabel5.setText("Área:");

        jCheckRuteo.setBackground(new java.awt.Color(255, 255, 255));
        jCheckRuteo.setText("Ruteo");

        jCheckAntisolder.setBackground(new java.awt.Color(255, 255, 255));
        jCheckAntisolder.setText("Antisolder");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLID.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jCheckAntisolder)
                        .addGap(67, 67, 67)
                        .addComponent(jCheckRuteo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLID))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addGap(6, 6, 6)
                        .addComponent(cbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckAntisolder)
                        .addComponent(jCheckRuteo))
                    .addComponent(jLID))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(128, 128, 131))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTBProcesos.setBackground(new java.awt.Color(63, 179, 255));
        jTBProcesos.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTBProcesos.setToolTipText("");
        jTBProcesos.setFocusCycleRoot(true);
        jTBProcesos.setName(""); // NOI18N
        jTBProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBProcesosMouseClicked(evt);
            }
        });

        jTFE.setAutoCreateRowSorter(true);
        jTFE.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTFE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre del proceso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTFE.setFillsViewportHeight(true);
        jTFE.setName("FE"); // NOI18N
        jTFE.setRowHeight(18);
        jTFE.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTFE.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTFE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTFEMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTFE);

        jTBProcesos.addTab("FE", jScrollPane3);

        jTTE.setAutoCreateRowSorter(true);
        jTTE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre del proceso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTTE.setFillsViewportHeight(true);
        jTTE.setName("TE"); // NOI18N
        jTTE.setRowHeight(18);
        jTTE.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTTEMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTTE);

        jTBProcesos.addTab("TE", jScrollPane5);

        jTEN.setAutoCreateRowSorter(true);
        jTEN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTEN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre del proceso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEN.setFillsViewportHeight(true);
        jTEN.setName("EN"); // NOI18N
        jTEN.setRowHeight(18);
        jTEN.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTENMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTEN);

        jTBProcesos.addTab("EN", jScrollPane6);

        jTGlobal.setAutoCreateRowSorter(true);
        jTGlobal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTGlobal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proceso", "Nombre del proceso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTGlobal.setFillsViewportHeight(true);
        jTGlobal.setName("GBL"); // NOI18N
        jTGlobal.setRowHeight(18);
        jTGlobal.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTGlobal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTGlobalMouseReleased(evt);
            }
        });
        jScrollPane7.setViewportView(jTGlobal);

        jTBProcesos.addTab("Globales", jScrollPane7);

        jPanel2.add(jTBProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 351, 205));

        btnNuevoProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_Proyect.png"))); // NOI18N
        btnNuevoProceso.setActionCommand("0");
        btnNuevoProceso.setBorderPainted(false);
        btnNuevoProceso.setContentAreaFilled(false);
        btnNuevoProceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProceso.setFocusPainted(false);
        btnNuevoProceso.setFocusable(false);
        btnNuevoProceso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_prpyect_roll.png"))); // NOI18N
        btnNuevoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProcesoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevoProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 36, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccion de procesos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(128, 128, 131))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTSeleeccionProcesos.setAutoCreateRowSorter(true);
        jTSeleeccionProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del proceso", "Orden", "Seleccionado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTSeleeccionProcesos.setFillsViewportHeight(true);
        jTSeleeccionProcesos.setFocusTraversalPolicyProvider(true);
        jTSeleeccionProcesos.setFocusable(false);
        jTSeleeccionProcesos.setRowHeight(18);
        jTSeleeccionProcesos.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTSeleeccionProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSeleeccionProcesosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTSeleeccionProcesos);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 430, 190));

        btnAccionSeleccionProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_proyect.png"))); // NOI18N
        btnAccionSeleccionProcesos.setBorderPainted(false);
        btnAccionSeleccionProcesos.setContentAreaFilled(false);
        btnAccionSeleccionProcesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccionSeleccionProcesos.setEnabled(false);
        btnAccionSeleccionProcesos.setFocusPainted(false);
        btnAccionSeleccionProcesos.setFocusable(false);
        btnAccionSeleccionProcesos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_roll.png"))); // NOI18N
        btnAccionSeleccionProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionSeleccionProcesosActionPerformed(evt);
            }
        });
        jPanel4.add(btnAccionSeleccionProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 40, -1));

        jLIDCondicion.setText("0");
        jPanel4.add(jLIDCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 234, 20, 20));

        jLArea.setText("0");
        jPanel4.add(jLArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 20, 20));

        jTCondicionProducto.setAutoCreateRowSorter(true);
        jTCondicionProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTCondicionProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Condicion", "Area", "idArea", "Producto", "Material", "Antisolder", "Ruteo", "¿Asignacion proceso?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTCondicionProducto.setFillsViewportHeight(true);
        jTCondicionProducto.setFocusTraversalPolicyProvider(true);
        jTCondicionProducto.setFocusable(false);
        jTCondicionProducto.setRowHeight(18);
        jTCondicionProducto.setSelectionBackground(new java.awt.Color(63, 179, 255));
        jTCondicionProducto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTCondicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTCondicionProductoMouseReleased(evt);
            }
        });
        jScrollPane8.setViewportView(jTCondicionProducto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductoItemStateChanged
        validacionDeFormularioDeCondiciones();
    }//GEN-LAST:event_cbProductoItemStateChanged

    private void btnGuardarCondicionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCondicionProductoActionPerformed
        registrarModificarCondicionesProducto();
    }//GEN-LAST:event_btnGuardarCondicionProductoActionPerformed

    private void btnUpdateCondicionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCondicionProductoActionPerformed
        registrarModificarCondicionesProducto();
    }//GEN-LAST:event_btnUpdateCondicionProductoActionPerformed

    private void btnNuevaCondicionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCondicionProductoActionPerformed
        estadoFormularioCondicionesProducto(true);
        limpiarFormularioCondicionesProducto();
        estadoInicialTablaSeleccionDeProcesos();
    }//GEN-LAST:event_btnNuevaCondicionProductoActionPerformed

    private void btnNuevoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProcesoActionPerformed
          mostrarVistaGestionProcesos(0,"");
          //jDialog1 Pendiente ver como se muestra esto desde acá 
    }//GEN-LAST:event_btnNuevoProcesoActionPerformed

    private void cbAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAreaItemStateChanged
        validacionDeFormularioDeCondiciones();
    }//GEN-LAST:event_cbAreaItemStateChanged

    private void btnAccionSeleccionProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionSeleccionProcesosActionPerformed
        registrarModificarSeleccionProcesosCondicion();
    }//GEN-LAST:event_btnAccionSeleccionProcesosActionPerformed

    private void jTBProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBProcesosMouseClicked
        consultarProcesosArea();
    }//GEN-LAST:event_jTBProcesosMouseClicked

    private void jTFEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFEMouseReleased
        ejecutarAccionesSeleecionTabla(evt);
    }//GEN-LAST:event_jTFEMouseReleased

    private void jTTEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTEMouseReleased
        ejecutarAccionesSeleecionTabla(evt);
    }//GEN-LAST:event_jTTEMouseReleased

    private void jTENMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTENMouseReleased
        ejecutarAccionesSeleecionTabla(evt);
    }//GEN-LAST:event_jTENMouseReleased

    private void jTGlobalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTGlobalMouseReleased
       ejecutarAccionesSeleecionTabla(evt);
    }//GEN-LAST:event_jTGlobalMouseReleased

    private void jTCondicionProductoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCondicionProductoMouseReleased
        if(!evt.isPopupTrigger()){
            int row = jTCondicionProducto.getSelectedRow();
            if(evt.getClickCount() == 2){ // Editar condición de producto
                if (row > -1) {
                    jLID.setText(String.valueOf(jTCondicionProducto.getValueAt(row, 0)));// ID de la condición
                    cbArea.setSelectedItem(String.valueOf(jTCondicionProducto.getValueAt(row, 1)));// Área
                    cbProducto.setSelectedItem(jTCondicionProducto.getValueAt(row, 3));// Producto
                    cbMaterial.setSelectedItem(String.valueOf(jTCondicionProducto.getValueAt(row, 4)));// Material
                    jCheckAntisolder.setSelected(Boolean.parseBoolean(String.valueOf(jTCondicionProducto.getValueAt(row, 5))));// Antisolder
                    jCheckRuteo.setSelected(Boolean.parseBoolean(String.valueOf(jTCondicionProducto.getValueAt(row, 6))));// Ruteo
                    // ...
                    habilitaraODesabilitarBotonesCondicionProducto(0);
                    estadoFormularioCondicionesProducto(true);
                }    
            }else{ // Seleecion de procesos para las condiciones de productos
                // ...
                estadoFormularioCondicionesProducto(false);
                habilitaraODesabilitarBotonesCondicionProducto(0);
                limpiarFormularioCondicionesProducto();
                // ...
                jLIDCondicion.setText(String.valueOf(jTCondicionProducto.getValueAt(row, 0)));// ID de la condición
                jLArea.setText(String.valueOf(jTCondicionProducto.getValueAt(row, 2)));// ID del área
                // Consultar procesos pertenecientes al área donde se va a trabajar el producto cuando se cumpla esta condición... 
                consultarProcesosProductoCondicion(String.valueOf(jTCondicionProducto.getValueAt(jTCondicionProducto.getSelectedRow(), 0)));
                // ...
                btnAccionSeleccionProcesos.setEnabled(Boolean.parseBoolean(String.valueOf(jTCondicionProducto.getValueAt(row, 7))));
            }
        }
    }//GEN-LAST:event_jTCondicionProductoMouseReleased

    private void jTSeleeccionProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSeleeccionProcesosMouseClicked
        if (!evt.isPopupTrigger()) {
            // Cuando se seleccione el CheckBox de la columna 4 se va activar la validacion
            if(evt.getX() > 240 && evt.getX() <= 410){
                validarExistenciaProcesoSeleccionadoTabla();
            }
        }
    }//GEN-LAST:event_jTSeleeccionProcesosMouseClicked

    private void ejecutarAccionesSeleecionTabla(java.awt.event.MouseEvent evt){
        JTable tabla = clasificarTablaProcesos();
        if(!evt.isPopupTrigger() && tabla.getSelectedRow() > 0){
            int idProceso = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
            //Modificar el nombre del proceso
            if (evt.getClickCount() == 2 && tabla.getSelectedColumn() == 1) {
                // ...
                mostrarVistaGestionProcesos(idProceso, String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 1)));
            }
            //Cambiar el estado del proceso
            if (evt.getClickCount() == 1 && tabla.getSelectedColumn() == 2) {
                Controlador.Condicion_producto procesos = new Controlador.Condicion_producto();
                if(procesos.cambiarEstadoProcesos(idProceso)){
                    new rojerusan.RSNotifyAnimated("Realizado!", "El cambio de estado fue realizado correctamente", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                }else{
                    new rojerusan.RSNotifyAnimated("Alerta!", "Ocurrio un problema a la hora de ejecutar la acción", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
                }
            }   
        }
    }
    
    private void mostrarVistaGestionProcesos(int idProceso,String nombreProceso){
        //Los procesos globales aun no estan funcionando.
        GestionProcesos formulario = new GestionProcesos(null, true, idProceso, jTBProcesos.getSelectedIndex() + 1, nombreProceso,this);
        formulario.setLocationRelativeTo(this);
        formulario.setVisible(true);
    }
    
    private void registrarModificarSeleccionProcesosCondicion(){
        // Seleccionar cual va a ser el proceso final de los productos de las áreas de FE y TE <- pendiente
        String[] botones = {" SI ", " NO "};
        int accion = JOptionPane.showOptionDialog(null, "¿seguro desea realizar esta acción?", "Seguridad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null/*icono*/, botones, botones[0]);
        // ...
        if(accion == 0){
            
            if (validarAsignacionDeOrdenProcesos()) {// Validacion del orden antes de registrar o actualizar

                boolean seleccionados, respuesta = false;
                // ...
                Condicion_producto controlador = new Condicion_producto();
                // ... 
                for (int i = 0; i < jTSeleeccionProcesos.getRowCount(); i++) {//Actualizar o registrar los nuevos procesos
                    // ...
                    seleccionados = Boolean.parseBoolean(String.valueOf(jTSeleeccionProcesos.getValueAt(i, 3)));
                    if (seleccionados) {
                        respuesta = controlador.registrarModificarSeleccionDeProcesosCondicionProducto(
                                convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 0)),// idProceso
                                convertirObjetoAInteger(jLIDCondicion.getText()), // idCondicion
                                convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 2)), // Orden
                                convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 4)) // idProceso_producto
                        );
                    } else {
                        if (convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 4)) > 0) {// Eliminar el proceso del producto
                            respuesta = controlador.eliminarSeleccionDeProcesoCondicionProducto(
                                    convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 4))
                            );
                        }
                    }
                }
                // ...
                if (respuesta) {
                    // Consultar nuevamente las condiciones y la seleccion de procesos...
                    consultarProcesosProductoCondicion(jLIDCondicion.getText());
                    consultarCondicionesProductosProcesos(0);
                    new rojerusan.RSNotifyAnimated("Realizado!", "La acción se realizo exitosamente.", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                } else {
                    new rojerusan.RSNotifyAnimated("Alerta!", "Ocurrio un problema a la hora de ejecutar la acción...", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
                }

            } else {
                new rojerusan.RSNotifyAnimated("Alerta!", "El orden establecido no esta bien espesificado...", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
            }            
            
        }
        // ...
    }
    
    private boolean validarAsignacionDeOrdenProcesos(){
        if(jLArea.getText().equals("1")){ // Esta validacion solo aplica para los productos que van hacer procesadas en el área de Formato Estandar - FE
            ArrayList<Integer> orden = new ArrayList();
            int OrdenProceso = 0;
            for (int i = 0; i < jTSeleeccionProcesos.getRowCount(); i++) {

                if (Boolean.parseBoolean(String.valueOf(jTSeleeccionProcesos.getValueAt(i, 3)))) {
                    OrdenProceso = convertirObjetoAInteger(jTSeleeccionProcesos.getValueAt(i, 2));
                    if (OrdenProceso > 0) {
                        orden.add(OrdenProceso);
                    } else {
                        return false; // No cumple el orden necesario
                    }
                }

            }
            // ...
            Collections.sort(orden);//El metodo "sort" se encarga de ordenar el array list de menor a mayor...
            // ...
            for (int i = 0; i < orden.size(); i++) {

                if ((orden.size() - 1) > i) {

                    if (i == 0) {
                        if (orden.get(i) != 1) {
                            return false;
                        }
                    } else {
                        if ((orden.get(i) + 1) != (orden.get(i + 1))) {
                            return false;
                        }
                    }

                } else {

                    if (orden.size() == 1) {
                        if (orden.get(i) != 1) {
                            return false;
                        }
                    } else {
                        if (orden.get(i) != (orden.get(i - 1) + 1)) {
                            return false;
                        }
                    }

                }

            }  
        }
        // ...
        return true;//Cumple el orden -> validación ejecutada correctamente
    } 
    
    private void validarExistenciaProcesoSeleccionadoTabla(){
        boolean respuesta = false;
        //Tiene que estar como minimo un proceso seleccionado en la tabla "Seleccion de procesos"
        for (int i = 0; i < jTSeleeccionProcesos.getRowCount(); i++) {
            // ...
            respuesta = Boolean.parseBoolean(String.valueOf(jTSeleeccionProcesos.getValueAt(i, 3)));
            if (respuesta) {
                break;
            }
        }
        // ...
        if(respuesta){
            btnAccionSeleccionProcesos.setEnabled(true);
        }else{
            btnAccionSeleccionProcesos.setEnabled(false);
        }
        // ...
    }
    
    private int convertirObjetoAInteger(Object dato){
        return Integer.parseInt(String.valueOf(dato));
    }
    
    private void registrarModificarCondicionesProducto(){
        if(cbProducto.getSelectedIndex()>0 && cbArea.getSelectedIndex()>0){
            String[] botones = {" SI ", " NO "};
            int accion = JOptionPane.showOptionDialog(null, "¿seguro desea realizar esta acción?", "Seguridad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null/*icono*/, botones, botones[0]);
            // ...
            if (accion == 0) {
                Condicion_producto condicion = new Condicion_producto();
                try {
                    //1= Registrado correctamente o modificado, 0=No se pudo registrar, 2= la condicion ya existe
                    int respuesta = condicion.registrarModificarCondicionProducto(Integer.parseInt(jLID.getText()), cbProducto.getSelectedIndex(), cbArea.getSelectedIndex(), (cbMaterial.getSelectedIndex() > 0 ? String.valueOf(cbMaterial.getSelectedItem()) : "0"), jCheckAntisolder.isSelected(), jCheckRuteo.isSelected());
                    String mensaje = "", titulo = "";
                    int tipo = 0;
                    switch (respuesta) {
                        case 0:
                            mensaje = "No se pudo realizar la acción correctamente.";
                            titulo = "Alerta!!";
                            tipo = 0;
                            break;
                        case 1:
                            mensaje = "La acción se realizo correctamente.";
                            titulo = "Realizado!";
                            tipo = 1;
                            consultarCondicionesProductosProcesos(0);
                            estadoFormularioCondicionesProducto(false);
                            limpiarFormularioCondicionesProducto();
                            break;
                        case 2:
                            mensaje = "Esta condicion ya existe.";
                            titulo = "Alerta!!";
                            tipo = 2;
                            break;
                    }
                    new rojerusan.RSNotifyAnimated(titulo, mensaje, 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, (tipo == 0 ? RSNotifyAnimated.TypeNotify.ERROR : (tipo == 1 ? RSNotifyAnimated.TypeNotify.SUCCESS : RSNotifyAnimated.TypeNotify.WARNING))).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // ...
            }            
        }else{
            new rojerusan.RSNotifyAnimated("Alerta!", "Falta algun campo obligatorio por diligenciar...", 6, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
        }
        // ...
    }
    
    private void consultarProcesosProductoCondicion(String idCondicion){ 
        Condicion_producto condicion = new Condicion_producto();
        try {
            Object[] cuerpoTabla= new Object[5];
            CachedRowSet crs = condicion.consultarProcesosSeleeccionCondicionProducto(idCondicion);
            jTSeleeccionProcesos.setDefaultRenderer(Object.class, new RenderProcesos());
            DefaultTableModel informacion = new DefaultTableModel(null, HEADER_PROCESO_PRODUCTO){
                Class[] types = new Class[]{
                    java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class,java.lang.Object.class
                };
              
                public Class getColumnClass(int columnIndex){
                  return types[columnIndex];
                }
            };
            //...
            while(crs.next()){
               cuerpoTabla[0] = crs.getInt("idproceso");
               cuerpoTabla[1] = crs.getString("nombre_proceso");
               cuerpoTabla[2] = crs.getInt("orden");
               cuerpoTabla[3] = crs.getBoolean("seleccion");
               cuerpoTabla[4] = crs.getInt("idProceso_producto");
               // ...
               informacion.addRow(cuerpoTabla);
            }
            // ... 
            jTSeleeccionProcesos.setModel(informacion);
            jTSeleeccionProcesos.updateUI();
            // ...
            ocultarColumnasTabla(jTSeleeccionProcesos, new Objeto_tabla[]{new Objeto_tabla(0,0), new Objeto_tabla(4,0)});
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void consultarProductos(){
        // ...
        Condicion_producto condicion = new Condicion_producto();
        // ...
        try {
            CachedRowSet crs = condicion.consultarProductos();
            String names_productos = "Seleccione...;";
            while(crs.next()){
                names_productos+= crs.getString("nombre")+";";
            }
            names_productos = names_productos.substring(0,names_productos.length()-2);
            DefaultComboBoxModel itemsProducto = new DefaultComboBoxModel(names_productos.split(";"));
            cbProducto.setModel(itemsProducto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ...
    }
    
    private void consultarCondicionesProductosProcesos(int idCondicion){
        Condicion_producto condicion = new Condicion_producto();
        try {
            CachedRowSet crs = condicion.consultarCondicionesProductos(idCondicion);
             Object[] cuerpoTabla = new Object[8];
             jTCondicionProducto.setDefaultRenderer(Object.class, new RenderProcesos());
         // ...
            DefaultTableModel contenido = new DefaultTableModel(null, HEADER_CONDICIONES){
                Class[] types = new Class[]{
                   java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Boolean.class,java.lang.Boolean.class,java.lang.Boolean.class
                };
               
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }
            };
            // ...
            jTCondicionProducto.getTableHeader().setFont(new Font("Arial",1,13));
        // ...
        int area =0;
            while(crs.next()){
                
                cuerpoTabla[0]= crs.getString("idCondicion");
                area= crs.getInt("area");
                cuerpoTabla[1]= (area==1?"Formato estandar - FE":(area==2?"Teclados - TE":"Ensamble - EN"));
                cuerpoTabla[2]= area;
                cuerpoTabla[3]= crs.getString("nombre");
                cuerpoTabla[4]= crs.getString("material");
                cuerpoTabla[5]= crs.getBoolean("antisorder");
                cuerpoTabla[6]= crs.getBoolean("ruteo");
                cuerpoTabla[7]= crs.getBoolean("asignado");
              
                contenido.addRow(cuerpoTabla);
            }
            // ...
            jTCondicionProducto.setModel(contenido);// No me esta agregando la información en el jTable <- 05/03/2019 Estipular una metodologia Scrum
            jTCondicionProducto.updateUI();
            // ...
            ocultarColumnasTabla(jTCondicionProducto, new Objeto_tabla[]{new Objeto_tabla(2,0), new Objeto_tabla(1,200), new Objeto_tabla(4,70), new Objeto_tabla(5,80), new Objeto_tabla(6,65)});
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void consultarProcesosArea(){
        JTable tabla=null;
        int index = jTBProcesos.getSelectedIndex() + 1;
        // ...
        DefaultTableModel ObjectTBL = new DefaultTableModel(null, HEADER_PROCESO){
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
        Object registro[]= new Object[3];
        // ...
        tabla = clasificarTablaProcesos();
        tabla.setDefaultRenderer(Object.class, new RenderProcesos());
        // ...
        Controlador.Condicion_producto procesos = new Controlador.Condicion_producto();
        informacion = procesos.consultarProcesos(index);
        // ...
        try {
            // ...
            while (informacion.next()) {
                
                registro[0] = informacion.getString("idproceso");
                registro[1] = informacion.getString("nombre_proceso");
                registro[2] = informacion.getBoolean("estado");
                
                ObjectTBL.addRow(registro);
                
            }
            // ...
            tabla.setModel(ObjectTBL);
            tabla.updateUI();
            // ...
            ocultarColumnasTabla(tabla, new Objeto_tabla[]{new Objeto_tabla(0,0)});
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
        // ...
    }
    
    private JTable clasificarTablaProcesos(){
        JTable tabla=null;
        // ...
        int index = jTBProcesos.getSelectedIndex() + 1;
        switch (index) {
            case 1: // FE
                tabla = jTFE;
                break;
            case 2: // TE
                tabla = jTTE;
                break;
            case 3: // EN
                tabla = jTEN;
                break;
            default: // Globales
                tabla = jTGlobal;
                break;
        }
        // ...
        return tabla;
    }
    
    private void ocultarColumnasTabla(JTable tabla,Objeto_tabla[] objetos){
        
        for (Objeto_tabla objeto : objetos) {
            tabla.getColumnModel().getColumn(objeto.indexColumn).setMinWidth(objeto.width);
            tabla.getColumnModel().getColumn(objeto.indexColumn).setMaxWidth(objeto.width);
            tabla.getTableHeader().getColumnModel().getColumn(objeto.indexColumn).setMaxWidth(objeto.width);
            tabla.getTableHeader().getColumnModel().getColumn(objeto.indexColumn).setMinWidth(objeto.width);
        }
        
    }
    
    private void estadoInicialTablaSeleccionDeProcesos(){
        DefaultTableModel estadoInicial = new DefaultTableModel(null, HEADER_PROCESO_PRODUCTO);
        jTSeleeccionProcesos.setModel(estadoInicial);
        ocultarColumnasTabla(jTSeleeccionProcesos, new Objeto_tabla[]{new Objeto_tabla(0,0), new Objeto_tabla(4,0)});
        jLIDCondicion.setText("0");
        jLArea.setText("0");
        btnAccionSeleccionProcesos.setEnabled(false);
    }
    
    private void estadoFormularioCondicionesProducto(boolean estado){
        cbProducto.setEnabled(estado);
        cbArea.setEnabled(estado);
        cbMaterial.setEnabled(estado);
        jCheckAntisolder.setEnabled(estado);
        jCheckRuteo.setEnabled(estado);
    }
    
    private void limpiarFormularioCondicionesProducto(){
        cbProducto.setSelectedIndex(0);
        cbArea.setSelectedIndex(0);
        cbMaterial.setSelectedIndex(0);
        jCheckAntisolder.setSelected(false);
        jCheckRuteo.setSelected(false);
        jLID.setText("0");
        habilitaraODesabilitarBotonesCondicionProducto(1);
    }
    
    private void habilitaraODesabilitarBotonesCondicionProducto(int accion){
        boolean btnGuardar = true;
        boolean btnUpdate = true;
        if(accion == 1){//Activar boton guardar y desactivar boton actualizar
            btnGuardar = true;
            btnUpdate = false;
        }else{// Desactivar boton guardar y activar boton actualizar
            btnGuardar = false;
            btnUpdate = true;
        }
//        btnGuardarCondicionProducto.setEnabled(!btnGuardar);
        btnGuardarCondicionProducto.setVisible(btnGuardar);
//        btnUpdateCondicionProducto.setEnabled(!btnUpdate);
        btnUpdateCondicionProducto.setVisible(btnUpdate);
    }
    
    private void validacionDeFormularioDeCondiciones(){
        if(cbProducto.getSelectedIndex() > 0 && cbArea.getSelectedIndex() > 0){
            if(jLID.getText().equals("0")){
                // Activar Boton de registrar
                btnGuardarCondicionProducto.setEnabled(true);
            }else{
                // Activar boton de modificar
                btnUpdateCondicionProducto.setEnabled(true);
            }
        }else{
            if (jLID.getText().equals("0")) {
                //Desactivar boton de registrar
                btnGuardarCondicionProducto.setEnabled(false);
            }else{
                // Desactivar boton de modificar
                btnUpdateCondicionProducto.setEnabled(false);
            }            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccionSeleccionProcesos;
    private javax.swing.JButton btnGuardarCondicionProducto;
    public static javax.swing.JButton btnNuevaCondicionProducto;
    public static javax.swing.JButton btnNuevoProceso;
    public static javax.swing.JButton btnUpdateCondicionProducto;
    public static elaprendiz.gui.comboBox.ComboBoxRound cbArea;
    public static elaprendiz.gui.comboBox.ComboBoxRound cbMaterial;
    public static elaprendiz.gui.comboBox.ComboBoxRound cbProducto;
    private javax.swing.JCheckBox jCheckAntisolder;
    private javax.swing.JCheckBox jCheckRuteo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLArea;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLIDCondicion;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTBProcesos;
    private javax.swing.JTable jTCondicionProducto;
    private javax.swing.JTable jTEN;
    private javax.swing.JTable jTFE;
    private javax.swing.JTable jTGlobal;
    private javax.swing.JTable jTSeleeccionProcesos;
    private javax.swing.JTable jTTE;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
//Metodos---------------------------------------------------------------------------------------------->  
}

class Objeto_tabla{
    
    int indexColumn = 0,
        width = 0;
    
    Objeto_tabla(){}
    
    Objeto_tabla(int columna, int width){
        this.indexColumn = columna;
        this.width = width;
    }
}