/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.bo;

import supermarket.dao.BitacoraDAO;
import supermarket.entity.BitacoraFactura;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import supermarket.db.Conexion;
import supermarket.entity.BitacoraTablaCajero;
import java.sql.Connection;
import supermarket.entity.Bitacora;
import supermarket.entity.BitacoraTablasMaestras;
/**
 *
 * @author categ
 */
public class BitacoraBO {
     private String mensaje = "";
    private BitacoraDAO fdao = new BitacoraDAO();

    public List<Bitacora> listarBitacoraFactura() {
        java.sql.Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<Bitacora> lista = new ArrayList<>();
        lista = fdao.listarBitacoraFactura(conn);

        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public List<Bitacora> listarBitacoraTablaCajero() {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<Bitacora> lista = new ArrayList<>();
        lista = fdao.listarBitacoraTablaCajero(conn);

        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public List<Bitacora> listarBitacoraTablaMaestra() {
        Connection conn = Conexion.getConnection(Conexion.usuarioLogeado);
        List<Bitacora> lista = new ArrayList<>();
        lista = fdao.listarBitacoraTablaMaestra(conn);

        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
}
