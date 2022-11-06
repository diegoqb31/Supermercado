
package supermarket.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import supermarket.entity.Usuario;

/**
 *
 * @author Diego Quiros
 */
public class Conexion {
    
    private static Connection conn = null;
    
    public static Usuario usuarioSystem = new Usuario(0, 0, "SYSTEM", "system", "system@gmail.com");
    public static Usuario usuarioLogeado = usuarioSystem;
    
    //private static String login = "SYSTEM";
    //private static String clave = "system";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(Usuario logeado){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,logeado.getNombre(),logeado.getClave());
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexion Exitosa con el usuario: " + logeado.getNombre());
            }else{
                System.out.println("ERROR");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea " + e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
    
}
