package supermarket;

import supermarket.db.Conexion;

/**
 *
 * @author Diego Quiros
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        supermarket.views.Login aplicacion_View;
    
        aplicacion_View = new supermarket.views.Login();
        
        aplicacion_View.setVisible(true);
        
        //Conexion c = new Conexion();
        //c.getConnection();
        
    }
    
}
