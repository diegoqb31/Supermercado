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
public class BitacoraFactura extends Bitacora{

    private String ARTICULO;
    private int CANTIDAD;
    private float SUBTOTAL;
    private float TOTAL;
    private int ID_CAJERO;
    private Date FECHA;
    private String HORA;

    public BitacoraFactura(String ARTICULO, int CANTIDAD, float SUBTOTAL, float TOTAL, int ID_CAJERO, Date FECHA, String HORA) {
        this.ARTICULO = ARTICULO;
        this.CANTIDAD = CANTIDAD;
        this.SUBTOTAL = SUBTOTAL;
        this.TOTAL = TOTAL;
        this.ID_CAJERO = ID_CAJERO;
        this.FECHA = FECHA;
        this.HORA = HORA;
    }

    public BitacoraFactura() {
    }

    public String getARTICULO() {
        return ARTICULO;
    }

    public void setARTICULO(String ARTICULO) {
        this.ARTICULO = ARTICULO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public float getSUBTOTAL() {
        return SUBTOTAL;
    }

    public void setSUBTOTAL(float SUBTOTAL) {
        this.SUBTOTAL = SUBTOTAL;
    }

    public float getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(float TOTAL) {
        this.TOTAL = TOTAL;
    }

    public int getID_CAJERO() {
        return ID_CAJERO;
    }

    public void setID_CAJERO(int ID_CAJERO) {
        this.ID_CAJERO = ID_CAJERO;
    }

    public Date getFECHA() {
        return FECHA;
    }

    public void setFECHA(Date FECHA) {
        this.FECHA = FECHA;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }
    
    public Object getBy(int col){
        switch (col){
            case 0:return getID();
            case 1:return getARTICULO();
            case 2:return getCANTIDAD();
            case 3:return getSUBTOTAL();
            case 4:return getTOTAL();
            case 5:return getID_CAJERO();
            case 6:return getFECHA();
            case 7:return getHORA();
            default:return "";
        }
    }
    
}
