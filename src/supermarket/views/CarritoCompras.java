/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.views;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import supermarket.bo.DetalleFacturaBO;
import supermarket.bo.FacturaBO;
import supermarket.db.Conexion;
import supermarket.entity.DetalleFactura;
import supermarket.entity.Factura;
import supermarket.entity.Producto;
import supermarket.models.DetalleFacturaTableModel;

/**
 *
 * @author categ
 */
public class CarritoCompras extends javax.swing.JFrame {

    String[] columnas = {"PLU", "TIPO", "DESCRIPCION", "PESO", "PRECIO", "CANTIDAD", "EAN"};
    DefaultTableModel model = new DefaultTableModel(null, columnas);
    List<DetalleFactura> lineasFactura = new ArrayList<>();
    private DetalleFacturaBO dfbo = new DetalleFacturaBO();
    private FacturaBO fbo = new FacturaBO();
    Factura factura = new Factura();
    supermarket.views.BuscarProducto buscarproducto;

    /**
     * Creates new form CarritoCompras
     */
    public CarritoCompras() {
        this.setLocation(1000,225);
        initComponents();
        factura.setNumero(fbo.listarTodo().size() + 1);
        factura.setSubtotal(0);
        factura.setTotal(0);
        factura.setFecha(new Date());
        factura.setCantidad(0);
        factura.setCajero(Conexion.usuarioLogeado);
        loadLineasFactura();
    }
    
    public CarritoCompras(supermarket.views.BuscarProducto buscarproducto) {
        this.setLocation(1000,225);
        initComponents();
        this.buscarproducto = buscarproducto;
        factura.setNumero(fbo.listarTodo().size() + 1);
        factura.setSubtotal(0);
        factura.setTotal(0);
        factura.setFecha(new Date());
        factura.setCantidad(0);
        factura.setCajero(Conexion.usuarioLogeado);
        loadLineasFactura();
    }

    public void startProducto() {
        model = new DefaultTableModel(null, columnas);
        carritoCompras.setModel(model);
    }

    public void addProducto(Producto p) {
        carritoCompras.setModel(new DetalleFacturaTableModel(lineasFactura));
        if(verificarProducto(p) != null){
            for(DetalleFactura df: lineasFactura){
                if(df.getProducto().getPLU() == p.getPLU()){
                    df.setCantidad(df.getCantidad() + 1);
                    df.setPrecio(df.getPrecio() + p.getPrecio());
                    Total.setText(String.valueOf(getTotal()));
                    factura.setTotal(getTotal());
                }
            }
        }else{
            DetalleFactura df = new DetalleFactura();
        df.setId(lineasFactura.size() + 1);
        df.setFactura(factura);
        df.setProducto(p);
        df.setCantidad(1);
        df.setPrecio(p.getPrecio());
        lineasFactura.add(df);
        factura.setTotal(getTotal());
        factura.setCantidad(lineasFactura.size());
        Total.setText(String.valueOf(getTotal()));
        /*for(DetalleFactura d: lineasFactura){
            System.out.println(d.getId() + " - " + d.getProducto().getDescripcion() );
        }*/
        }
        
    }
    
    public void setIdDb(){
        int i = 1;
        for(DetalleFactura df: lineasFactura){
            df.setId(dfbo.listarTodo().size() + i);
            i++;
        }
    }
    
    public float getTotal(){
        float total = 0;
        for(DetalleFactura df: lineasFactura){
            total = total + df.getPrecio();
        }
        return total;
    }
    
    public DetalleFactura verificarProducto(Producto p){
        for(DetalleFactura df: lineasFactura){
            if(df.getProducto().getPLU() == p.getPLU()){
                return df;
            }
        }
        return null;
    }
    
    public void loadLineasFactura(){
        carritoCompras.setModel(new DetalleFacturaTableModel(lineasFactura));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        carritoCompras = new javax.swing.JTable();
        Facturar = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        carritoCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(carritoCompras);

        Facturar.setText("Facturar");
        Facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturarMouseClicked(evt);
            }
        });

        jLabel2.setText("Total:");

        jLabel3.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 78, 119));
        jLabel3.setText("Carrito de compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(Facturar)
                .addGap(285, 285, 285))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(Total)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(Facturar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturarMouseClicked
        setIdDb();
        String mensaje = fbo.agregarFactura(factura);
        System.out.println(mensaje);
        for(DetalleFactura df: lineasFactura){
            mensaje = dfbo.agregarFactura(df);
            System.out.println(mensaje);
        }
        JOptionPane.showMessageDialog(null, "¡Factura realizada!");
        buscarproducto.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_FacturarMouseClicked

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
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarritoCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Facturar;
    private javax.swing.JLabel Total;
    private javax.swing.JTable carritoCompras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
