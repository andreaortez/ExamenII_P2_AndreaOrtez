package andreaortez_examen2p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Frame extends javax.swing.JFrame {

    ArrayList<Deporte> deportes = new ArrayList();
    ArrayList<Partido> partidos = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;

    public Frame() {
        initComponents();
        LlenarArbol();
        pn_partido.setVisible(false);
        pn_listar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        torneo = new javax.swing.JPopupMenu();
        listar = new javax.swing.JMenuItem();
        tabla = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        agregarE = new javax.swing.JMenuItem();
        agregarP = new javax.swing.JMenuItem();
        equipo = new javax.swing.JPopupMenu();
        agregarT = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        binario = new javax.swing.JMenuItem();
        jd_barra = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jd_tabla = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_posiciones = new javax.swing.JTable();
        bt_cerrar = new javax.swing.JButton();
        deporte = new javax.swing.JPopupMenu();
        agregarD = new javax.swing.JMenuItem();
        jd_partidos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bt_cerrar2 = new javax.swing.JButton();
        pn_fondo = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_torneos = new javax.swing.JTree();
        pn_listar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_equipos = new javax.swing.JList<>();
        bt_Mpartidos = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        pn_partido = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cb_equipo2 = new javax.swing.JComboBox<>();
        cb_equipo3 = new javax.swing.JComboBox<>();
        sp_e2 = new javax.swing.JSpinner();
        sp_e1 = new javax.swing.JSpinner();

        listar.setText("Listar Equipos");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        torneo.add(listar);

        tabla.setText("Mostrar Tabla de Posiciones");
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        torneo.add(tabla);
        torneo.add(jSeparator1);

        agregarE.setText("Agregar Equipo");
        agregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEActionPerformed(evt);
            }
        });
        torneo.add(agregarE);

        agregarP.setText("Agregar Partidos");
        agregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPActionPerformed(evt);
            }
        });
        torneo.add(agregarP);

        agregarT.setText("Agregar Torneo");
        agregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTActionPerformed(evt);
            }
        });
        equipo.add(agregarT);
        equipo.add(jSeparator2);

        binario.setText("Guardar en Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });
        equipo.add(binario);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_barraLayout = new javax.swing.GroupLayout(jd_barra.getContentPane());
        jd_barra.getContentPane().setLayout(jd_barraLayout);
        jd_barraLayout.setHorizontalGroup(
            jd_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_barraLayout.setVerticalGroup(
            jd_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tb_posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Posición", "Equipo", "Puntos"
            }
        ));
        jScrollPane3.setViewportView(tb_posiciones);

        bt_cerrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_cerrar.setText("Cerrar");
        bt_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(bt_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(bt_cerrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_tablaLayout = new javax.swing.GroupLayout(jd_tabla.getContentPane());
        jd_tabla.getContentPane().setLayout(jd_tablaLayout);
        jd_tablaLayout.setHorizontalGroup(
            jd_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_tablaLayout.setVerticalGroup(
            jd_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        agregarD.setText("Agregar Deporte");
        agregarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDActionPerformed(evt);
            }
        });
        deporte.add(agregarD);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 410));

        bt_cerrar2.setText("Cerrar");
        bt_cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrar2MouseClicked(evt);
            }
        });
        jPanel3.add(bt_cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        javax.swing.GroupLayout jd_partidosLayout = new javax.swing.GroupLayout(jd_partidos.getContentPane());
        jd_partidos.getContentPane().setLayout(jd_partidosLayout);
        jd_partidosLayout.setHorizontalGroup(
            jd_partidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_partidosLayout.setVerticalGroup(
            jd_partidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_fondo.setBackground(new java.awt.Color(255, 255, 255));
        pn_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menu.setBackground(new java.awt.Color(102, 0, 153));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        jt_torneos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_torneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_torneosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_torneos);

        pn_menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 460));

        pn_fondo.add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        pn_listar.setBackground(new java.awt.Color(255, 255, 255));

        jl_equipos.setModel(new DefaultListModel ());
        jl_equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_equiposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_equipos);

        bt_Mpartidos.setText("Mostrar Partidos");
        bt_Mpartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_MpartidosMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Equipos");

        javax.swing.GroupLayout pn_listarLayout = new javax.swing.GroupLayout(pn_listar);
        pn_listar.setLayout(pn_listarLayout);
        pn_listarLayout.setHorizontalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_listarLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(bt_Mpartidos)
                .addGap(34, 34, 34))
        );
        pn_listarLayout.setVerticalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listarLayout.createSequentialGroup()
                .addGroup(pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_listarLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(bt_Mpartidos))
                    .addGroup(pn_listarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pn_fondo.add(pn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 470, -1));

        pn_partido.setBackground(new java.awt.Color(255, 255, 255));
        pn_partido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Partido");
        pn_partido.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Puntos");
        pn_partido.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 160, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Equipo 2:");
        pn_partido.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButton11.setText("Agregar Partido");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        pn_partido.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Equipo 1:");
        pn_partido.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        pn_partido.add(cb_equipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, -1));

        pn_partido.add(cb_equipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, -1));

        sp_e2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        pn_partido.add(sp_e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, 30));

        sp_e1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        pn_partido.add(sp_e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, 30));

        pn_fondo.add(pn_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        try {
            for (Deporte d : deportes) {
                for (Torneo t : d.getTorneos()) {
                    if (t.getNombre().equals(nodo_seleccionado.getUserObject().toString())) {
                        t.getPartidos().add(new Partido(cb_equipo2.getSelectedItem().toString(), cb_equipo3.getSelectedItem().toString(), Integer.parseInt(sp_e1.getValue().toString()),
                    Integer.parseInt(sp_e2.getValue().toString())));
                        
                        JOptionPane.showMessageDialog(this, "Partido agregado con éxito");
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jt_torneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_torneosMouseClicked
        if (evt.isMetaDown()) {
            int row = jt_torneos.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_torneos.setSelectionRow(row);
            Object v1 = jt_torneos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            DefaultTreeModel modelo = (DefaultTreeModel) jt_torneos.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

            if (nodo_seleccionado.getUserObject() instanceof Torneo) {
                torneo.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                equipo.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (!nodo_seleccionado.getUserObject().equals(raiz)) {
                deporte.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_torneosMouseClicked

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        ListarE();
        pn_listar.setVisible(true);
        pn_partido.setVisible(false);
    }//GEN-LAST:event_listarActionPerformed

    private void jl_equiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_equiposMouseClicked
        ListarE();
    }//GEN-LAST:event_jl_equiposMouseClicked

    private void agregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTActionPerformed
        try {
            for (Deporte d : deportes) {
                if (d.getNombre().equals(nodo_seleccionado.getUserObject().toString())) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del torneo");
                    d.getTorneos().add(new Torneo(nombre, nodo_seleccionado.getParent().toString()));
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }

        LlenarArbol();
    }//GEN-LAST:event_agregarTActionPerformed

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int seleccion = jfc.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File archivo = jfc.getSelectedFile();
                if (!archivo.exists()) {
                    archivo = new File(archivo.getPath() + ".ajor");
                } else {
                    String[] ruta = archivo.getPath().split("\\.");
                    if (ruta[ruta.length - 1].equals("ajor")) {
                        FileOutputStream fos = new FileOutputStream(archivo);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
//                        oos.writeObject((Deporte));
                        fos.close();
                        oos.close();

                        Abrir_barra();
                    } else {
                        JOptionPane.showMessageDialog(this, "No fue posible guardar");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_binarioActionPerformed

    private void agregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEActionPerformed
        try {
            for (Deporte d : deportes) {
                for (Torneo t : d.getTorneos()) {
                    if (t.getNombre().equals(nodo_seleccionado.getUserObject().toString())) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo");
                        t.getEquipos().add(new Equipo(nombre, 0));
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_agregarEActionPerformed

    private void bt_MpartidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_MpartidosMouseClicked

    }//GEN-LAST:event_bt_MpartidosMouseClicked

    private void bt_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarMouseClicked
        jd_tabla.setVisible(false);
    }//GEN-LAST:event_bt_cerrarMouseClicked

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        Abrir_tabla();
    }//GEN-LAST:event_tablaActionPerformed

    private void agregarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDActionPerformed
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del deporte");
            deportes.add(new Deporte(nombre));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }

        LlenarArbol();
    }//GEN-LAST:event_agregarDActionPerformed

    private void agregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPActionPerformed
        Equipo(cb_equipo2);
        Equipo(cb_equipo3);
        pn_partido.setVisible(true);
        pn_listar.setVisible(false);
    }//GEN-LAST:event_agregarPActionPerformed

    private void bt_cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrar2MouseClicked
        jd_partidos.setVisible(false);
    }//GEN-LAST:event_bt_cerrar2MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    private void LlenarArbol() {
        DefaultTreeModel modelo = (DefaultTreeModel) jt_torneos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode periodo = (DefaultMutableTreeNode) raiz.getChildAt(i);

            periodo.removeAllChildren();
            for (Deporte d : deportes) {
                DefaultMutableTreeNode deporte = new DefaultMutableTreeNode(d);

                periodo.add(deporte);

                for (Torneo t : d.getTorneos()) {
                    if (t.getPeriodo().equals(periodo.getUserObject())) {
                        deporte.add(new DefaultMutableTreeNode(t));
                    }
                }
            }
        }

        modelo.reload();
    }

//    private void Torneo() {
//        cb_torneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
//        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_torneo.getModel();
//
//        for (Torneo t : torneos) {
//            modelo.addElement(t);
//        }
//
//        cb_torneo.setModel(modelo);
//    }
//
    private void Equipo(JComboBox temp) {
        temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) temp.getModel();

        for (Deporte d : deportes) {
            if (d.getNombre().equals(nodo_seleccionado.getParent().toString())) {
                for (Torneo t : d.getTorneos()) {
                    for (Equipo e : t.getEquipos()) {
                        modelo.addElement(e);
                    }
                }
            }
        }
        temp.setModel(modelo);
    }
//
//    private void Partido() {
//        cb_partido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
//        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_partido.getModel();
//
//        for (Equipo e : equipos) {
//            modelo.addElement(e);
//        }
//        cb_partido.setModel(modelo);
//    }
//
//    private void Deporte() {
//        cb_deporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
//        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_deporte.getModel();
//
//        for (Deporte d : deportes) {
//            modelo.addElement(d);
//        }
//        cb_deporte.setModel(modelo);
//    }

    private void ListarE() {
        DefaultListModel modelo = (DefaultListModel) jl_equipos.getModel();
        modelo.removeAllElements();
        for (Deporte d : deportes) {
            for (Torneo t : d.getTorneos()) {
                if (t.getNombre().equals(nodo_seleccionado.getUserObject().toString())) {
                    for (Equipo e : t.getEquipos()) {
                        modelo.addElement(e);
                    }
                }
            }
        }
        jl_equipos.setModel(modelo);
    }

    private void Abrir_barra() {
        jd_barra.pack();
        jd_barra.setLocationRelativeTo(this);
        jd_barra.setResizable(false);
        jd_barra.setVisible(true);
    }

    private void Abrir_tabla() {
        jd_tabla.pack();
        jd_tabla.setLocationRelativeTo(this);
        jd_tabla.setResizable(false);
        jd_tabla.setVisible(true);
    }
    
    private void Abrir_partidos() {
        jd_partidos.pack();
        jd_partidos.setLocationRelativeTo(this);
        jd_partidos.setResizable(false);
        jd_partidos.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarD;
    private javax.swing.JMenuItem agregarE;
    private javax.swing.JMenuItem agregarP;
    private javax.swing.JMenuItem agregarT;
    private javax.swing.JMenuItem binario;
    private javax.swing.JButton bt_Mpartidos;
    private javax.swing.JButton bt_cerrar;
    private javax.swing.JButton bt_cerrar2;
    private javax.swing.JComboBox<String> cb_equipo2;
    private javax.swing.JComboBox<String> cb_equipo3;
    private javax.swing.JPopupMenu deporte;
    private javax.swing.JPopupMenu equipo;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDialog jd_barra;
    private javax.swing.JDialog jd_partidos;
    private javax.swing.JDialog jd_tabla;
    private javax.swing.JList<String> jl_equipos;
    private javax.swing.JTree jt_torneos;
    private javax.swing.JMenuItem listar;
    private javax.swing.JPanel pn_fondo;
    private javax.swing.JPanel pn_listar;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_partido;
    private javax.swing.JSpinner sp_e1;
    private javax.swing.JSpinner sp_e2;
    private javax.swing.JMenuItem tabla;
    private javax.swing.JTable tb_posiciones;
    private javax.swing.JPopupMenu torneo;
    // End of variables declaration//GEN-END:variables
}
