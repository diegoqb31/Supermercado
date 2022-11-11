package supermarket.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import supermarket.db.Conexion;
import supermarket.entity.Factura;
import supermarket.dao.FacturaDAO;


public class FacturaBO {
    
    private String mensaje = "";
    private FacturaDAO fdao = new FacturaDAO();
    
    public String agregarFactura(Factura fac){
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        try {
            mensaje = fdao.agregarFactrua(conn, fac);
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
    
    
    public List<Factura> listarTodo(){
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<Factura> lista = new ArrayList<>();
        lista = fdao.listarTodos(conn);
        /*for(Factura u: lista){
            System.out.println("Factura: " + u.getNumero() + "\n");
        }*/
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public Factura getByNumero(int numero){
        List<Factura> lista = this.listarTodo();
        for(Factura f: lista){
            if(f.getNumero() == numero){
                return f;
            }
        }
        return null;
    }
    
}
