package supermarket.test;

import java.util.List;
import supermarket.bo.*;
import supermarket.entity.*;

/**
 *
 * @author Diego Quiros
 */
public class Test {
    UsuarioBO ubo = new UsuarioBO();
    Usuario usu = new Usuario();
    
    ProductoBO pbo = new ProductoBO();
    Producto pro = new Producto();
    
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
    
    public void listar(){
        ubo.listarTodo();
    }
    
    public void cargarData(){
        usu.setId(101);
        usu.setRol(1);
        usu.setNombre("Cajero-1");
        usu.setCorreo("cajero1@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(102);
        usu.setRol(1);
        usu.setNombre("Cajero-2");
        usu.setCorreo("cajero2@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        
        usu = new Usuario();
        usu.setId(103);
        usu.setRol(1);
        usu.setNombre("Cajero-3");
        usu.setCorreo("cajero3@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(201);
        usu.setRol(2);
        usu.setNombre("Gerente-1");
        usu.setCorreo("gerente1@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(202);
        usu.setRol(2);
        usu.setNombre("Gerente-2");
        usu.setCorreo("gerente2@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        
        usu = new Usuario();
        usu.setId(203);
        usu.setRol(2);
        usu.setNombre("Gerente-3");
        usu.setCorreo("gerente3@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(204);
        usu.setRol(2);
        usu.setNombre("Gerente-4");
        usu.setCorreo("gerente4@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(205);
        usu.setRol(2);
        usu.setNombre("Gerente-5");
        usu.setCorreo("gerente5@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(206);
        usu.setRol(2);
        usu.setNombre("Gerente-6");
        usu.setCorreo("gerente6@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(301);
        usu.setRol(3);
        usu.setNombre("Sistemas-1");
        usu.setCorreo("Sistemas1@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(302);
        usu.setRol(3);
        usu.setNombre("Sistemas-2");
        usu.setCorreo("Sistemas2@hotmail.com");
        usu.setClave("1234");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        pro.setPLU(1234);
        pro.setTipo("Abarrotes");
        pro.setDescripcion("Atun Calvo");
        pro.setPeso(0.5f);
        pro.setPrecio(2500);
        pro.setCantidad(50);
        pro.setEAN("1234567891012");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
    }
    
    
    public static void main(String[] args) {
        Test test = new Test();
        
        test.cargarData();
        
    }
}
