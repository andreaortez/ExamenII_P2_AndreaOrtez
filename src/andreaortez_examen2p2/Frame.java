package andreaortez_examen2p2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Frame extends javax.swing.JFrame {

    ArrayList<Deporte> deportes = new ArrayList();
    ArrayList<Partido> partidos = new ArrayList();
    ArrayList<Equipo> equipos = new ArrayList();
    ArrayList<Torneo> torneos = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;

    public Frame() {
        initComponents();
        LlenarArbol();
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(false);
        pn_partido.setVisible(false);
        pn_deporte.setVisible(false);
        pn_listar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenu = new javax.swing.JPopupMenu();
        listar = new javax.swing.JMenuItem();
        tabla = new javax.swing.JMenuItem();
        torneo = new javax.swing.JPopupMenu();
        agregarT = new javax.swing.JMenuItem();
        binario = new javax.swing.JMenuItem();
        pn_fondo = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        bt_deporte = new javax.swing.JButton();
        bt_equipo = new javax.swing.JButton();
        bt_partido = new javax.swing.JButton();
        bt_torneo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_torneos = new javax.swing.JTree();
        pn_listar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_equipos = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
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
        pn_equipo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombreE = new javax.swing.JTextField();
        bt_agregarE = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cb_torneo1 = new javax.swing.JComboBox<>();
        pn_deporte = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_torneo = new javax.swing.JComboBox<>();
        bt_agregarD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_nombreD = new javax.swing.JTextField();
        pn_torneo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreT = new javax.swing.JTextField();
        cb_equipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bt_agregarE2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_partido = new javax.swing.JComboBox<>();
        bt_agregarP2 = new javax.swing.JButton();
        bt_agregarT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_periodo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cb_deporte = new javax.swing.JComboBox<>();

        listar.setText("Listar Equipos");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        popmenu.add(listar);

        tabla.setText("Mostrar Tabla de Posiciones");
        popmenu.add(tabla);

        agregarT.setText("Agregar Torneo");
        agregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTActionPerformed(evt);
            }
        });
        torneo.add(agregarT);

        binario.setText("Guardar en Binario");
        binario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarioActionPerformed(evt);
            }
        });
        torneo.add(binario);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_fondo.setBackground(new java.awt.Color(255, 255, 255));
        pn_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menu.setBackground(new java.awt.Color(102, 0, 153));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_deporte.setText("Deporte");
        bt_deporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deporteMouseClicked(evt);
            }
        });
        bt_deporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deporteActionPerformed(evt);
            }
        });
        pn_menu.add(bt_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        bt_equipo.setText("Equipo");
        bt_equipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_equipoMouseClicked(evt);
            }
        });
        pn_menu.add(bt_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        bt_partido.setText("Partido");
        bt_partido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_partidoMouseClicked(evt);
            }
        });
        pn_menu.add(bt_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        bt_torneo.setText("Torneo");
        bt_torneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_torneoMouseClicked(evt);
            }
        });
        pn_menu.add(bt_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");
        pn_menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, -1));

        pn_fondo.add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

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

        pn_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 460));

        pn_listar.setBackground(new java.awt.Color(255, 255, 255));

        jl_equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_equiposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_equipos);

        jButton1.setText("Mostrar Partidos");

        javax.swing.GroupLayout pn_listarLayout = new javax.swing.GroupLayout(pn_listar);
        pn_listar.setLayout(pn_listarLayout);
        pn_listarLayout.setHorizontalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listarLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );
        pn_listarLayout.setVerticalGroup(
            pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_listarLayout.createSequentialGroup()
                .addGroup(pn_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_listarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_listarLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pn_fondo.add(pn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 500));

        pn_partido.setBackground(new java.awt.Color(255, 255, 255));
        pn_partido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Partido");
        pn_partido.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Puntaje");
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
        pn_partido.add(sp_e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, 20));
        pn_partido.add(sp_e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, 20));

        pn_fondo.add(pn_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 500));

        pn_equipo.setBackground(new java.awt.Color(255, 255, 255));
        pn_equipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Equipo");
        pn_equipo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre:");
        pn_equipo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tf_nombreE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_equipo.add(tf_nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

        bt_agregarE.setText("Agregar Equipo");
        bt_agregarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarEMouseClicked(evt);
            }
        });
        pn_equipo.add(bt_agregarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Torneo:");
        pn_equipo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        pn_equipo.add(cb_torneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));

        pn_fondo.add(pn_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 500));

        pn_deporte.setBackground(new java.awt.Color(255, 255, 255));
        pn_deporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Deporte");
        pn_deporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Torneo:");
        pn_deporte.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        pn_deporte.add(cb_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));

        bt_agregarD.setText("Agregar Deporte");
        bt_agregarD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarDMouseClicked(evt);
            }
        });
        pn_deporte.add(bt_agregarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");
        pn_deporte.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tf_nombreD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_deporte.add(tf_nombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

        pn_fondo.add(pn_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 500));

        pn_torneo.setBackground(new java.awt.Color(255, 255, 255));
        pn_torneo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Torneo");
        pn_torneo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        pn_torneo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tf_nombreT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_torneo.add(tf_nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

        pn_torneo.add(cb_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Equipo:");
        pn_torneo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        bt_agregarE2.setText("Agregar Equipo");
        bt_agregarE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarE2MouseClicked(evt);
            }
        });
        pn_torneo.add(bt_agregarE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Partido:");
        pn_torneo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        pn_torneo.add(cb_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 160, -1));

        bt_agregarP2.setText("Agregar Partido");
        pn_torneo.add(bt_agregarP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        bt_agregarT.setText("Agregar Torneo");
        bt_agregarT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarTMouseClicked(evt);
            }
        });
        pn_torneo.add(bt_agregarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Periodo:");
        pn_torneo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        cb_periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q4", "Q5" }));
        pn_torneo.add(cb_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 160, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Deporte:");
        pn_torneo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        pn_torneo.add(cb_deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, -1));

        pn_fondo.add(pn_torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_torneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_torneoMouseClicked
        Equipo(cb_equipo);
        Partido();
        Deporte();
        pn_torneo.setVisible(true);
        pn_equipo.setVisible(false);
        pn_partido.setVisible(false);
        pn_deporte.setVisible(false);
        pn_listar.setVisible(false);
    }//GEN-LAST:event_bt_torneoMouseClicked

    private void bt_deporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deporteMouseClicked
        Torneo();
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(false);
        pn_partido.setVisible(false);
        pn_deporte.setVisible(true);
        pn_listar.setVisible(false);
    }//GEN-LAST:event_bt_deporteMouseClicked

    private void bt_equipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_equipoMouseClicked
        Torneo();
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(true);
        pn_partido.setVisible(false);
        pn_deporte.setVisible(false);
        pn_listar.setVisible(false);
    }//GEN-LAST:event_bt_equipoMouseClicked

    private void bt_partidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_partidoMouseClicked
        Equipo(cb_equipo2);
        Equipo(cb_equipo3);
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(false);
        pn_partido.setVisible(true);
        pn_deporte.setVisible(false);
        pn_listar.setVisible(false);
    }//GEN-LAST:event_bt_partidoMouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        try {
            partidos.add(new Partido(cb_equipo2.getSelectedItem().toString(), cb_equipo3.getSelectedItem().toString(), Integer.parseInt(sp_e1.getValue().toString()),
                    Integer.parseInt(sp_e2.getValue().toString())));

            JOptionPane.showMessageDialog(this, "Partido guardado con éxito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void bt_agregarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarEMouseClicked
        try {
            equipos.add(new Equipo(tf_nombreE.getText(), 0));

            JOptionPane.showMessageDialog(this, "Equipo guardado con éxito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarEMouseClicked

    private void bt_agregarDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarDMouseClicked
        try {
            deportes.add(new Deporte(tf_nombreD.getText()));

            JOptionPane.showMessageDialog(this, "Deporte guardado con éxito");

            LlenarArbol();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarDMouseClicked

    private void bt_agregarTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarTMouseClicked
        try {
            for (Deporte d : deportes) {
                if (d.getNombre().equals(cb_deporte.getSelectedItem().toString())) {
                    d.getTorneos().add(new Torneo(tf_nombreT.getText(), cb_periodo.getSelectedItem().toString()));
                }
            }

            JOptionPane.showMessageDialog(this, "Torneo guardado con éxito");
            LlenarArbol();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarTMouseClicked

    private void bt_agregarE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarE2MouseClicked
        try {
            torneos.add(new Torneo());
            for (Equipo e : equipos) {
                if (e.getNombre().equals(cb_equipo.getSelectedItem().toString())) {
                    torneos.get(torneos.size() - 1).getEquipos().add(e);
                }
            }

            JOptionPane.showMessageDialog(this, "Torneo guardado con éxito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se guardaron los datos");
        }
    }//GEN-LAST:event_bt_agregarE2MouseClicked

    private void jt_torneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_torneosMouseClicked
        if (evt.isMetaDown()) {
            int row = jt_torneos.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_torneos.setSelectionRow(row);
            Object v1 = jt_torneos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;

            if (nodo_seleccionado.getUserObject() instanceof Torneo) {
                popmenu.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                torneo.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_torneosMouseClicked

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        ListarE();
        pn_listar.setVisible(true);
        pn_torneo.setVisible(false);
        pn_equipo.setVisible(false);
        pn_partido.setVisible(false);
        pn_deporte.setVisible(false);
    }//GEN-LAST:event_listarActionPerformed

    private void bt_deporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_deporteActionPerformed

    private void jl_equiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_equiposMouseClicked
        ListarE();
    }//GEN-LAST:event_jl_equiposMouseClicked

    private void agregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTActionPerformed
        try {
            for (Deporte d : deportes) {
                if (d.equals(nodo_seleccionado)) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del torneo");
                    d.getTorneos().add(new Torneo(nombre, nodo_seleccionado.getParent().toString()));
                }
            }
        } catch (Exception ex) {

        }

        LlenarArbol();
    }//GEN-LAST:event_agregarTActionPerformed

    private void binarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarioActionPerformed
        
    }//GEN-LAST:event_binarioActionPerformed

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

    private void Torneo() {
        cb_torneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_torneo.getModel();

        for (Torneo t : torneos) {
            modelo.addElement(t);
        }

        cb_torneo.setModel(modelo);
    }

    private void Equipo(JComboBox temp) {
        temp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) temp.getModel();

        for (Equipo e : equipos) {
            modelo.addElement(e);
        }
        temp.setModel(modelo);
    }

    private void Partido() {
        cb_partido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_partido.getModel();

        for (Equipo e : equipos) {
            modelo.addElement(e);
        }
        cb_partido.setModel(modelo);
    }

    private void Deporte() {
        cb_deporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_deporte.getModel();

        for (Deporte d : deportes) {
            modelo.addElement(d);
        }
        cb_deporte.setModel(modelo);
    }

    private void ListarE() {
        DefaultListModel modelo = (DefaultListModel) jl_equipos.getModel();
        for (Deporte d : deportes) {
            for (Torneo t : d.getTorneos()) {
                if (t.equals(nodo_seleccionado)) {
                    for (Equipo e : t.getEquipos()) {
                        modelo.addElement(e);
                    }
                }
            }
        }
        jl_equipos.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarT;
    private javax.swing.JMenuItem binario;
    private javax.swing.JButton bt_agregarD;
    private javax.swing.JButton bt_agregarE;
    private javax.swing.JButton bt_agregarE2;
    private javax.swing.JButton bt_agregarP2;
    private javax.swing.JButton bt_agregarT;
    private javax.swing.JButton bt_deporte;
    private javax.swing.JButton bt_equipo;
    private javax.swing.JButton bt_partido;
    private javax.swing.JButton bt_torneo;
    private javax.swing.JComboBox<String> cb_deporte;
    private javax.swing.JComboBox<String> cb_equipo;
    private javax.swing.JComboBox<String> cb_equipo2;
    private javax.swing.JComboBox<String> cb_equipo3;
    private javax.swing.JComboBox<String> cb_partido;
    private javax.swing.JComboBox<String> cb_periodo;
    private javax.swing.JComboBox<String> cb_torneo;
    private javax.swing.JComboBox<String> cb_torneo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jl_equipos;
    private javax.swing.JTree jt_torneos;
    private javax.swing.JMenuItem listar;
    private javax.swing.JPanel pn_deporte;
    private javax.swing.JPanel pn_equipo;
    private javax.swing.JPanel pn_fondo;
    private javax.swing.JPanel pn_listar;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_partido;
    private javax.swing.JPanel pn_torneo;
    private javax.swing.JPopupMenu popmenu;
    private javax.swing.JSpinner sp_e1;
    private javax.swing.JSpinner sp_e2;
    private javax.swing.JMenuItem tabla;
    private javax.swing.JTextField tf_nombreD;
    private javax.swing.JTextField tf_nombreE;
    private javax.swing.JTextField tf_nombreT;
    private javax.swing.JPopupMenu torneo;
    // End of variables declaration//GEN-END:variables
}
