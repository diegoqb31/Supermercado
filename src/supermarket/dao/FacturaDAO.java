package supermarket.dao;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import supermarket.bo.UsuarioBO;
import supermarket.entity.Factura;
import supermarket.entity.Usuario;
/**
 *
 * @author Diego Quiros
 */
public class FacturaDAO {
    
    private String mensaje = "";
    
    public String agregarFactrua(Connection con, Factura fac){
        PreparedStatement pst = null;
        String sql = "Insert into system.FACTURA (NUMERO,SUBTOTAL,TOTAL,FECHA,CANTIDAD,ID_CAJERO) "
                + "values (?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, fac.getNumero());
            pst.setFloat(2, fac.getSubtotal());
            pst.setFloat(3, fac.getTotal());
            pst.setDate(4, new java.sql.Date(fac.getFecha().getTime()));
            pst.setInt(5, fac.getCantidad());
            pst.setInt(6, fac.getCajero().getId());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
    public Factura from (ResultSet rs) throws ParseException{
        UsuarioBO ubo = new UsuarioBO();
        try {
            Factura r = new Factura();
            r.setNumero(Integer.parseInt(rs.getString("numero")));
            r.setSubtotal(Float.parseFloat(rs.getString("subtotal")));
            r.setTotal(Float.parseFloat(rs.getString("total")));
            
           /* String fechaPrueba = "09/11/22";
            String p2 = rs.getString("fecha");
            
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
            Date d = formatter.parse(p2);*/
            r.setFecha(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(rs.getString("fecha")));
            r.setCantidad(Integer.parseInt(rs.getString("cantidad")));
            
            /*/Usuario u = new Usuario();
            String csajero = rs.getString("id_cajero");
            u = ubo.getById(Integer.parseInt(rs.getString("id_cajero")));
            */
            r.setCajero(ubo.getById(Integer.parseInt(rs.getString("id_cajero"))));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<Factura> listarTodos(Connection con) {
        String sql = "SELECT * FROM system.FACTURA ORDER BY NUMERO";
        List<Factura> r= new ArrayList<>();
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
}
