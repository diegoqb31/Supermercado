package supermarket.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import supermarket.entity.Usuario;
/**
 *
 * @author Diego Quiros
 */
public class UsuarioDAO {
    
    private String mensaje = "";
    
    public String agregarUsuario(Connection con, Usuario usu){
        PreparedStatement pst = null;
        String sql = "Insert into USUARIO (ID,ROL,NOMBRE,CLAVE,CORREO) "
                + "values (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, usu.getId());
            pst.setInt(2, usu.getRol());
            pst.setString(3, usu.getNombre());
            pst.setString(4, usu.getClave());
            pst.setString(5, usu.getCorreo());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
    public String modificarUsuario(Connection con, Usuario usu){
        PreparedStatement pst = null;
        String sql = "Update USUARIOS set ID = ?, ROL = ?, NOMBRE = ?, CLAVE = ?, CORREO = ? "
                + "where id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, usu.getId());
            pst.setInt(2, usu.getRol());
            pst.setString(3, usu.getNombre());
            pst.setString(4, usu.getClave());
            pst.setString(5, usu.getCorreo());
            pst.setInt(6, usu.getId());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo modificar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
    public String eliminarUsuario(Connection con, int id){
        PreparedStatement pst = null;
        String sql = "delete from usuarios where id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "Eliminado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo eliminar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
    public void listarUsuario(Connection con, JTable tabla){
        
        DefaultTableModel model;
        String [] columnas = {"ID","ROL","NOMBRE","CLAVE","CORREO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM usuario ORDER BY id";
        
        String [] filas = new String[7];
        Statement st = null; 
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }   
    }
    
    public Usuario from (ResultSet rs){
        try {
            Usuario r= new Usuario();
            r.setId(Integer.parseInt(rs.getString("id")));
            r.setRol(Integer.parseInt(rs.getString("rol")));
            r.setNombre(rs.getString("nombre"));
            r.setClave(rs.getString("clave"));
            r.setCorreo(rs.getString("correo"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Usuario> listarTodos(Connection con){
       
        String sql = "SELECT * FROM usuario ORDER BY id";
        List<Usuario> r= new ArrayList<>();
        String [] filas = new String[7];
        Statement st = null; 
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                r.add(from(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }   
        return r;
    }
    
    
}
