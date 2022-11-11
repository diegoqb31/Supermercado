/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.views;

import supermarket.db.Conexion;

/**
 *
 * @author Diego Quiros
 */
public class MenuPrincipalCajero extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalCajero
     */
    public MenuPrincipalCajero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pruebas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        listadoUsuarios = new javax.swing.JMenu();
        facturar = new javax.swing.JMenu();
        inventario = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 78, 119));
        jLabel3.setText(" ¡Bienvenido!");

        pruebas.setText("borrar luego");
        pruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(pruebas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel3)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(pruebas)
                .addGap(55, 55, 55))
        );

        jMenuBar1.setBackground(new java.awt.Color(24, 78, 119));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        listadoUsuarios.setBackground(new java.awt.Color(24, 78, 119));
        listadoUsuarios.setForeground(new java.awt.Color(245, 249, 250));
        listadoUsuarios.setText("Listado Ejemplo");
        listadoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listadoUsuarios.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        listadoUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoUsuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(listadoUsuarios);

        facturar.setBackground(new java.awt.Color(24, 78, 119));
        facturar.setForeground(new java.awt.Color(245, 249, 250));
        facturar.setText("Ventas");
        facturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        facturar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        facturar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturarMouseClicked(evt);
            }
        });
        jMenuBar1.add(facturar);

        inventario.setBackground(new java.awt.Color(24, 78, 119));
        inventario.setForeground(new java.awt.Color(245, 249, 250));
        inventario.setText("Inventario");
        inventario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(inventario);

        cerrarSesion.setBackground(new java.awt.Color(24, 78, 119));
        cerrarSesion.setForeground(new java.awt.Color(245, 249, 250));
        cerrarSesion.setText("Cerrar Cesión");
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoUsuariosMouseClicked
        supermarket.views.ListadoEjemplo ejemploTabla = new supermarket.views.ListadoEjemplo();
        ejemploTabla.setVisible(true);
    }//GEN-LAST:event_listadoUsuariosMouseClicked

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        Conexion.usuarioLogeado = Conexion.usuarioSystem;
        supermarket.views.Login login = new supermarket.views.Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void pruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebasActionPerformed
        // TODO add your handling code here:
        
        supermarket.views.DetalleFacturas detalleFacturas = new supermarket.views.DetalleFacturas();
        detalleFacturas.setVisible(true);
    }//GEN-LAST:event_pruebasActionPerformed

    private void facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturarMouseClicked
        // TODO add your handling code here:supermarket.views.BuscarProducto buscarProducto = new supermarket.views.BuscarProducto();
        supermarket.views.FacturarMenu facturar = new supermarket.views.FacturarMenu();
        facturar.setVisible(true);
    }//GEN-LAST:event_facturarMouseClicked

    private void inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseClicked
        supermarket.views.InventarioMenu inventario = new supermarket.views.InventarioMenu();
        inventario.setVisible(true);
    }//GEN-LAST:event_inventarioMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cerrarSesion;
    private javax.swing.JMenu facturar;
    private javax.swing.JMenu inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu listadoUsuarios;
    private javax.swing.JButton pruebas;
    // End of variables declaration//GEN-END:variables
}
