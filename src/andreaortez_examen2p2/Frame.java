package andreaortez_examen2p2;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        LlenarArbol();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_fondo = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_torneos = new javax.swing.JTree();
        pn_partido = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cb_equipo2 = new javax.swing.JComboBox<>();
        cb_equipo3 = new javax.swing.JComboBox<>();
        pn_equipo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        pn_deporte = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_equipo1 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        pn_torneo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cb_equipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_fondo.setBackground(new java.awt.Color(255, 255, 255));
        pn_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menu.setBackground(new java.awt.Color(102, 0, 153));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Deporte");
        pn_menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jButton2.setText("Equipo");
        pn_menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton3.setText("Partido");
        pn_menu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jButton4.setText("Torneo");
        pn_menu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

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
        jScrollPane1.setViewportView(jt_torneos);

        pn_fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 460));

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
        pn_partido.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 40, 160, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Equipo 2:");
        pn_partido.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButton11.setText("Agregar Partido");
        pn_partido.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_partido.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 160, -1));

        jTextField8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_partido.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 160, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Equipo 1:");
        pn_partido.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        pn_partido.add(cb_equipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, -1));

        pn_partido.add(cb_equipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, -1));

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

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_equipo.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Puntos:");
        pn_equipo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_equipo.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));

        jButton9.setText("Agregar Equipo");
        pn_equipo.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

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

        pn_deporte.add(cb_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, -1));

        jButton8.setText("Agregar Torneo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pn_deporte.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jButton10.setText("Agregar Deporte");
        pn_deporte.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");
        pn_deporte.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_deporte.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

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

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pn_torneo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 160, -1));

        pn_torneo.add(cb_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Equipo:");
        pn_torneo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jButton5.setText("Agregar Equipo");
        pn_torneo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Partido:");
        pn_torneo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        pn_torneo.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, -1));

        jButton6.setText("Agregar Partido");
        pn_torneo.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jButton7.setText("Agregar Torneo");
        pn_torneo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Periodo:");
        pn_torneo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q4", "Q5" }));
        pn_torneo.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 160, -1));

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
        DefaultTreeModel modeloARBOL = (DefaultTreeModel) jt_torneos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_equipo;
    private javax.swing.JComboBox<String> cb_equipo1;
    private javax.swing.JComboBox<String> cb_equipo2;
    private javax.swing.JComboBox<String> cb_equipo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTree jt_torneos;
    private javax.swing.JPanel pn_deporte;
    private javax.swing.JPanel pn_equipo;
    private javax.swing.JPanel pn_fondo;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_partido;
    private javax.swing.JPanel pn_torneo;
    // End of variables declaration//GEN-END:variables
}
