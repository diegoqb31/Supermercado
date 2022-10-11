package supermarket.test;

import supermarket.bo.UsuarioBO;
import supermarket.entity.Usuario;

/**
 *
 * @author Diego Quiros
 */
public class Test {
    UsuarioBO ubo = new UsuarioBO();
    Usuario usu = new Usuario();
    String mensaje = "";
    
    public void insertar(){
        usu.setId(222);
        usu.setRol(1);
        usu.setNombre("Kevin Ulloa");
        usu.setCorreo("ko@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
    }
    
    public void modificar(){
        usu.setId(222);
        usu.setRol(2);
        usu.setNombre("Kevin Brenes");
        usu.setCorreo("kevin@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.modificarUsuario(usu);
        System.out.println(mensaje);
    }
    
    public void eliminar(){
        mensaje = ubo.eliminarUsuario(222);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.insertar();
        //test.modificar();
        //test.eliminar();
    }
}
