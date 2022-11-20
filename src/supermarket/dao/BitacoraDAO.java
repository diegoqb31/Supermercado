/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import supermarket.db.Conexion;
import supermarket.entity.Bitacora;
import supermarket.entity.BitacoraFactura;
import supermarket.entity.BitacoraTablaCajero;
import supermarket.entity.BitacoraTablasMaestras;
import supermarket.entity.Factura;

/**
 *
 * @author categ
 */
public class BitacoraDAO {

    private String mensaje = "";

    public List<Bitacora> listarBitacoraFactura(Connection con) {
        String sql = "SELECT * FROM system.BitacoraFactura ORDER BY NUMERO";
        List<Bitacora> r = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r.add(fromfactura(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla factura");
        }
        return r;
    }

    public List<Bitacora> listarBitacoraTablaCajero(Connection con) {
        String sql = "SELECT * FROM system.BitacoraTablaCajero ORDER BY NUMERO";
        List<Bitacora> r = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r.add(fromCajero(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla factura");
        }
        return r;
    }

    public List<Bitacora> listarBitacoraTablaMaestra(Connection con) {
        String sql = "SELECT * FROM system.BitacoraTablasMaestras ORDER BY NUMERO";
        List<Bitacora> r = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                r.add(fromTbMaestra(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla factura");
        }
        return r;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////    
    
    private BitacoraFactura fromfactura(ResultSet rs) throws ParseException {        
        try {
            BitacoraFactura r = new BitacoraFactura();
            r.setID(rs.getInt("ID"));
            r.setARTICULO(rs.getString("ARTICULO"));
            r.setCANTIDAD(Integer.parseInt(rs.getString("CANTIDAD")));
            r.setSUBTOTAL(Float.parseFloat(rs.getString("SUBTOTAL")));
            r.setTOTAL(Float.parseFloat(rs.getString("TOTAL")));
            r.setID_CAJERO(Integer.parseInt(rs.getString("ID_CAJERO")));
            r.setFECHA(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(rs.getString("FECHA")));;
            r.setHORA(rs.getString("HORA"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }

    private BitacoraTablaCajero fromCajero(ResultSet rs) throws ParseException {
        try {            
            BitacoraTablaCajero r = new BitacoraTablaCajero();            
            r.setID(rs.getInt("ID"));
            r.setUSUARIO(Integer.parseInt(rs.getString("USUARIO")));
            r.setNUMERO_CAJA(Integer.parseInt(rs.getString("NUMERO_CAJA")));
            r.setFECHA_VENTA(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(rs.getString("FECHA_VENTA")));;
            r.setHORA_VENTA(rs.getString("HORA_VENTA"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }

    private BitacoraTablasMaestras fromTbMaestra(ResultSet rs) throws ParseException {
        try {
            BitacoraTablasMaestras r = new BitacoraTablasMaestras();
            r.setID(rs.getInt("ID"));
            r.setOPERACION(rs.getString("OPERACION"));
            r.setUSUARIO(rs.getString("USUARIO"));
            r.setFECHA(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(rs.getString("FECHA")));;
            r.setHORA(rs.getString("HORA"));
            r.setTABLA(rs.getString("TABLA"));
            return r;
        } catch (SQLException ex) {
            return null;
        }
    }
}
