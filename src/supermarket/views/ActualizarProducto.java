/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.views;

import supermarket.bo.ProductoBO;
import supermarket.entity.Producto;
import static supermarket.views.ModificarProducto.isFloat;
import static supermarket.views.ModificarProducto.isInteger;

/**
 *
 * @author Kevin
 */
public class ActualizarProducto extends javax.swing.JFrame {


    private ProductoBO pbo = new ProductoBO();
    /**
     * Creates new form ActualizarProducto
     */
    public ActualizarProducto() {
        initComponents();
        validateProd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPLU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTIPO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDESCRIPCION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPESO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPRECIO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCANTIDAD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEAN = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Modifique descripción y cantidad de un producto");

        jLabel2.setText("PLU");

        txtPLU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPLUKeyReleased(evt);
            }
        });

        jLabel3.setText("Escriba el PLU del producto que desea modificar");
        jLabel3.setToolTipText("");

        jLabel4.setText("TIPO");

        jLabel5.setText("DESCRIPCIÓN");

        txtDESCRIPCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESCRIPCIONActionPerformed(evt);
            }
        });

        jLabel6.setText("PESO");

        jLabel7.setText("PRECIO");

        jLabel8.setText("CANTIDAD");

        jLabel9.setText("EAN");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEAN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addComponent(txtCANTIDAD, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPRECIO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPESO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTIPO, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtPLU, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtPLU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDESCRIPCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESCRIPCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESCRIPCIONActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPLUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPLUKeyReleased
        validateProd();
    }//GEN-LAST:event_txtPLUKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (checker()) {
            Producto p = new Producto();
            p.setCantidad(Integer.parseInt(txtCANTIDAD.getText()));
            p.setDescripcion(txtDESCRIPCION.getText());
            p.setEAN(txtEAN.getText());
            p.setPeso(Float.parseFloat(txtPESO.getText()));
            p.setPLU(Integer.parseInt(txtPLU.getText()));
            p.setPrecio(Float.parseFloat(txtPRECIO.getText()));
            p.setTipo(txtTIPO.getText());
            pbo.modificarProducto(p);
            clear();
        } else {
            System.out.println("Fail");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    private void validateProd() {
        Producto p = null;
        try {
            p = pbo.getByPLU(Integer.parseInt(txtPLU.getText()));
            txtCANTIDAD.setText(Integer.toString(p.getCantidad()));
            txtDESCRIPCION.setText(p.getDescripcion());
            txtEAN.setText(p.getEAN());
            txtPESO.setText(Float.toString(p.getPeso()));
            txtPRECIO.setText(Float.toString(p.getPrecio()));
            txtTIPO.setText(p.getTipo());
        } catch (Exception e) {
        }
        boolean rest = p != null;
        txtCANTIDAD.setEditable(rest);
        txtDESCRIPCION.setEditable(rest);
        txtEAN.setEditable(false);
        txtPESO.setEditable(false);
        txtPRECIO.setEditable(false);
        txtTIPO.setEditable(false);
        clearNonPLU(!rest);
    }


    private void clearNonPLU(Boolean needed) {
        if(needed){
        txtCANTIDAD.setText("");
        txtDESCRIPCION.setText("");
        txtEAN.setText("");
        txtPESO.setText("");
        txtPRECIO.setText("");
        txtTIPO.setText("");
        }
    }

    private void clear() {
        clearNonPLU(true);
        txtPLU.setText("");
        validateProd();
    }


    private boolean checker() {
        boolean check = true;
        check = check && (!txtCANTIDAD.getText().isBlank() && isInteger(txtCANTIDAD.getText()));
        check = check && (!txtDESCRIPCION.getText().isBlank());
        check = check && (!txtEAN.getText().isBlank());
        check = check && (!txtPESO.getText().isBlank() && isFloat(txtPESO.getText()));
        check = check && (!txtPLU.getText().isBlank() && isInteger(txtPLU.getText()));
        check = check && (!txtPRECIO.getText().isBlank() && isFloat(txtPRECIO.getText()));
        check = check && (!txtTIPO.getText().isBlank());
        return check;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        // only got here if we didn't return falsereturn true;
        return true;
    }
    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        // only got here if we didn't return falsereturn true;
        return true;
    }
    

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
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCANTIDAD;
    private javax.swing.JTextField txtDESCRIPCION;
    private javax.swing.JTextField txtEAN;
    private javax.swing.JTextField txtPESO;
    private javax.swing.JTextField txtPLU;
    private javax.swing.JTextField txtPRECIO;
    private javax.swing.JTextField txtTIPO;
    // End of variables declaration//GEN-END:variables

    

  
}