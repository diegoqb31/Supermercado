package supermarket.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import supermarket.dao.DetalleFacturaDAO;
import supermarket.db.Conexion;
import supermarket.entity.DetalleFactura;

/**
 *
 * @author Diego Quiros
 */
public class DetalleFacturaBO {
    
    private String mensaje = "";
    private DetalleFacturaDAO dfdao = new DetalleFacturaDAO();
    
    public String agregarFactura(DetalleFactura dFac){
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        try {
            mensaje = dfdao.agregarDetalleFactrua(conn, dFac);
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
    
    public List<DetalleFactura> listarTodo(){
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<DetalleFactura> lista = new ArrayList<>();
        lista = dfdao.listarTodos(conn);
        /*for(DetalleFactura df: lista){
            System.out.println("DetalleFactura: " + df.getId() + "\n");
        }*/
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
