package supermarket.test;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import supermarket.bo.*;
import supermarket.db.Conexion;
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
    
    FacturaBO fbo = new FacturaBO();
    Factura fac = new Factura();
    
    DetalleFacturaBO dfbo = new DetalleFacturaBO();
    DetalleFactura dFac = new DetalleFactura();
    
    
    String mensaje = "";
    
    public void cargarData(){
        
        //Usuarios
        
        usu.setId(101);
        usu.setRol(1);
        usu.setNombre("Cajero1");
        usu.setCorreo("cajero1@hotmail.com");
        usu.setClave("Cajero1");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(102);
        usu.setRol(1);
        usu.setNombre("Cajero2");
        usu.setCorreo("cajero2@hotmail.com");
        usu.setClave("Cajero2");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        
        usu = new Usuario();
        usu.setId(103);
        usu.setRol(1);
        usu.setNombre("Cajero3");
        usu.setCorreo("cajero3@hotmail.com");
        usu.setClave("Cajero3");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(201);
        usu.setRol(2);
        usu.setNombre("Gerente1");
        usu.setCorreo("gerente1@hotmail.com");
        usu.setClave("Gerente1");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(202);
        usu.setRol(2);
        usu.setNombre("Gerente2");
        usu.setCorreo("gerente2@hotmail.com");
        usu.setClave("Gerente2");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        
        usu = new Usuario();
        usu.setId(203);
        usu.setRol(2);
        usu.setNombre("Gerente3");
        usu.setCorreo("gerente3@hotmail.com");
        usu.setClave("Gerente3");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(204);
        usu.setRol(2);
        usu.setNombre("Gerente4");
        usu.setCorreo("gerente4@hotmail.com");
        usu.setClave("Gerente4");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(205);
        usu.setRol(2);
        usu.setNombre("Gerente5");
        usu.setCorreo("gerente5@hotmail.com");
        usu.setClave("Gerente5");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(206);
        usu.setRol(2);
        usu.setNombre("Gerente6");
        usu.setCorreo("gerente6@hotmail.com");
        usu.setClave("Gerente6");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(301);
        usu.setRol(3);
        usu.setNombre("Sistemas1");
        usu.setCorreo("Sistemas1@hotmail.com");
        usu.setClave("Sistemas1");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        usu = new Usuario();
        usu.setId(302);
        usu.setRol(3);
        usu.setNombre("Sistemas2");
        usu.setCorreo("Sistemas2@hotmail.com");
        usu.setClave("Sistemas2");
        mensaje = ubo.agregarUsuario(usu);
        System.out.println(mensaje);
        
        //Productos
        
        pro.setPLU(1234);
        pro.setTipo("Abarrotes");
        pro.setDescripcion("Atun Calvo");
        pro.setPeso(0.5f);
        pro.setPrecio(2500);
        pro.setCantidad(50);
        pro.setEAN("1234567891012");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
        pro = new Producto();
        pro.setPLU(1567);
        pro.setTipo("Abarrotes");
        pro.setDescripcion("Salsa de tomate Banquete");
        pro.setPeso(0.6f);
        pro.setPrecio(2300);
        pro.setCantidad(20);
        pro.setEAN("4596327846982");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
        pro = new Producto();
        pro.setPLU(2526);
        pro.setTipo("Cuidado Personal");
        pro.setDescripcion("Pasta dental colgate");
        pro.setPeso(0.3f);
        pro.setPrecio(1500);
        pro.setCantidad(30);
        pro.setEAN("8162875964721");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
        pro = new Producto();
        pro.setPLU(3821);
        pro.setTipo("Mercancias");
        pro.setDescripcion("Audifonos");
        pro.setPeso(0.4f);
        pro.setPrecio(6000);
        pro.setCantidad(10);
        pro.setEAN("6719258931257");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
        pro = new Producto();
        pro.setPLU(4537);
        pro.setTipo("Frescos");
        pro.setDescripcion("Manzanas Rojas");
        pro.setPeso(0.4f);
        pro.setPrecio(400);
        pro.setCantidad(60);
        pro.setEAN("7854126478293");
        mensaje = pbo.agregarProducto(pro);
        System.out.println(mensaje);
        
        //Facturas
        
        fac.setNumero(1);
        fac.setSubtotal(0);
        fac.setTotal(15000);
        fac.setFecha(new Date());
        fac.setCantidad(5);
        
        usu = new Usuario();
        usu.setId(103);
        usu.setRol(1);
        usu.setNombre("Cajero3");
        usu.setCorreo("cajero3@hotmail.com");
        usu.setClave("Cajero3");
        
        fac.setCajero(usu);
        mensaje = fbo.agregarFactura(fac);
        System.out.println(mensaje);
        
        
        //DetalleFactura
        
        dFac.setId(1);
        dFac.setFactura(fac);
        dFac.setProducto(pro);
        dFac.setCantidad(4);
        dFac.setPrecio(7500);
        mensaje = dfbo.agregarFactura(dFac);
        System.out.println(mensaje);
        
        
    }
    
    
    public void listarFacturas(){
        fbo.listarTodo();
    }
    
    public void listarDetalleFacturas(){
        dfbo.listarTodo();
    }
    
    public static void main(String[] args) {
        Test test = new Test();
        test.listarDetalleFacturas();
       // test.cargarData();
        
    }
}
