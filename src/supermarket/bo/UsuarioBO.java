/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import supermarket.db.Conexion;
import supermarket.entity.Usuario;
import supermarket.dao.UsuarioDAO;

/**
 *
 * @author Diego Quiros
 */
public class UsuarioBO {
    
    private String mensaje = "";
    private UsuarioDAO udao = new UsuarioDAO();
    
    public String agregarUsuario(Usuario usu){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.agregarUsuario(conn, usu);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarUsuario(Usuario usu){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.modificarUsuario(conn, usu);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarUsuario(int id){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = udao.eliminarUsuario(conn, id);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(Exception e){
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarUsuario(JTable tabla){
        Connection conn = Conexion.getConnection();
        udao.listarUsuario(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
