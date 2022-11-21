/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.entity;

import java.util.Date;

/**
 *
 * @author categ
 */
public class BitacoraTablaCajero extends Bitacora{

    private int USUARIO;
    private int NUMERO_CAJA;
    private Date FECHA_VENTA;
    private String HORA_VENTA;

    public BitacoraTablaCajero() {
    }

    public BitacoraTablaCajero(int USUARIO, int NUMERO_CAJA, Date FECHA_VENTA, String HORA_VENTA) {
        this.USUARIO = USUARIO;
        this.NUMERO_CAJA = NUMERO_CAJA;
        this.FECHA_VENTA = FECHA_VENTA;
        this.HORA_VENTA = HORA_VENTA;
    }

    public int getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(int USUARIO) {
        this.USUARIO = USUARIO;
    }

    public int getNUMERO_CAJA() {
        return NUMERO_CAJA;
    }

    public void setNUMERO_CAJA(int NUMERO_CAJA) {
        this.NUMERO_CAJA = NUMERO_CAJA;
    }

    public Date getFECHA_VENTA() {
        return FECHA_VENTA;
    }

    public void setFECHA_VENTA(Date FECHA_VENTA) {
        this.FECHA_VENTA = FECHA_VENTA;
    }

    public String getHORA_VENTA() {
        return HORA_VENTA;
    }

    public void setHORA_VENTA(String HORA_VENTA) {
        this.HORA_VENTA = HORA_VENTA;
    }

    @Override
    public Object getBy(int col){
        switch (col){
            //case 0:return getID();
            case 0:return getUSUARIO();
            case 1:return getNUMERO_CAJA();
            case 2:return getFECHA_VENTA();
            case 3:return getHORA_VENTA();
            default:return "";
        }
    }
}