/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import supermarket.entity.Producto;

/**
 *
 * @author categ
 */
public class ProductoDAO {
    
    private String mensaje = "";

    public void listarProducto(Connection con, JTable tabla) {
        DefaultTableModel model;
        String[] columnas = {"PLU", "TIPO", "DESCRIPCION", "PESO", "PRECIO", "CANTIDAD", "EAN"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM system.PRODUCTO ORDER BY PLU";

        String[] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
    
    public Producto from (ResultSet rs){
        try {
            Producto r = new Producto();
            r.setPLU(Integer.parseInt(rs.getString("PLU")));
            r.setTipo(rs.getString("tipo"));
            r.setDescripcion(rs.getString("descripcion"));
            r.setPeso(Float.parseFloat(rs.getString("peso")));
            r.setPrecio(Float.parseFloat(rs.getString("precio")));
            r.setCantidad(Integer.parseInt(rs.getString("cantidad")));
            r.setEAN(rs.getString("EAN"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Producto> listarTodos(Connection con) {
        String sql = "SELECT * FROM system.PRODUCTO ORDER BY PLU";
        List<Producto> r= new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
        return r;
    }
    
     public String agregarProducto(Connection con, Producto pro){
        PreparedStatement pst = null;
        String sql = "Insert into system.PRODUCTO (PLU,Tipo,Descripcion,Peso,Precio,Cantidad,EAN) "
                + "values (?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, pro.getPLU());
            pst.setString(2, pro.getTipo());
            pst.setString(3, pro.getDescripcion());
            pst.setFloat(4, pro.getPeso());
            pst.setFloat(5, pro.getPrecio());
            pst.setInt(6, pro.getCantidad());
            pst.setString(7, pro.getEAN());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
}
