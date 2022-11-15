package supermarket.dao;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import supermarket.bo.FacturaBO;
import supermarket.bo.ProductoBO;
import supermarket.entity.DetalleFactura;

/**
 *
 * @author Diego Quiros
 */
public class DetalleFacturaDAO {
    private String mensaje = "";
    
    public String agregarDetalleFactrua(Connection con, DetalleFactura dFac){
        PreparedStatement pst = null;
        String sql = "Insert into system.DETALLE_FACTURA (ID,NUMERO,PLU,CANTIDAD,PRECIO_PRODUCTOS) "
                + "values (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, dFac.getId());
            pst.setInt(2, dFac.getFactura().getNumero());
            pst.setInt(3, dFac.getProducto().getPLU());
            pst.setInt(4, dFac.getCantidad());
            pst.setFloat(5, dFac.getPrecio());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
        } catch (SQLException e) 
        {
            mensaje = "No se pudo guardar correctamente \n " + e.getMessage();   
        }
        return mensaje;
    }
    
    public DetalleFactura from (ResultSet rs){
        ProductoBO pbo = new ProductoBO();
        FacturaBO fbo = new FacturaBO();
        try {
            DetalleFactura r = new DetalleFactura();
            r.setId(Integer.parseInt(rs.getString("id")));
            r.setFactura(fbo.getByNumero(Integer.valueOf(rs.getString("numero"))));
            r.setProducto(pbo.getByPLU(Integer.valueOf(rs.getString("PLU"))));
            r.setCantidad(Integer.parseInt(rs.getString("cantidad")));
            r.setPrecio(Float.valueOf(rs.getString("precio_productos")));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public List<DetalleFactura> listarTodos(Connection con) {
        String sql = "SELECT * FROM system.DETALLE_FACTURA ORDER BY ID";
        List<DetalleFactura> r= new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r.add(from(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla detalle - facturas");
        }
        return r;
    }
}
