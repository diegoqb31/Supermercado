/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.bo;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
import supermarket.dao.ProductoDAO;
import supermarket.db.Conexion;

/**
 *
 * @author categ
 */
public class ProductoBO {
    
    private String mensaje = "";
    private ProductoDAO udao = new ProductoDAO();
    
        public void listarProducto(JTable tabla){
        Connection conn = Conexion.getConnection();
        udao.listarProducto(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
