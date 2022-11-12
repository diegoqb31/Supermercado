/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import supermarket.dao.ProductoDAO;
import supermarket.db.Conexion;
import supermarket.entity.Producto;

/**
 *
 * @author categ
 */
public class ProductoBO {

    private String mensaje = "";
    private ProductoDAO pdao = new ProductoDAO();

    public void listarProducto(JTable tabla) {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        pdao.listarProducto(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String agregarProducto(Producto pro) {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        try {
            mensaje = pdao.agregarProducto(conn, pro);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public String modificarProducto(Producto pro) {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        try {
            mensaje = pdao.modificarProducto(conn, pro);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarProducto(Producto pro) {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        try {
            mensaje = pdao.eliminarProducto(conn, pro);
            //conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }

    public List<Producto> listarTodo() {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<Producto> lista = new ArrayList<>();
        lista = pdao.listarTodos(conn);
        /*for(Usuario u: lista){
            System.out.println("Usuario: " + u.getNombre() + "\n");
        }*/
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

    public Producto getByPLU(int plu) {
        List<Producto> lista = this.listarTodo();
        for (Producto p : lista) {
            if (p.getPLU() == plu) {
                return p;
            }
        }
        return null;
    }

}
