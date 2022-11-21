/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.entity;

/**
 *
 * @author categ
 */

import java.util.Date;

public class BitacoraTablasMaestras extends Bitacora{

    private String OPERACION;
    private String USUARIO;
    private Date FECHA;
    private String HORA;
    private String TABLA;

    public BitacoraTablasMaestras() {
    }

    public BitacoraTablasMaestras(String OPERACION, String USUARIO, Date FECHA, String HORA, String TABLA) {
        this.OPERACION = OPERACION;
        this.USUARIO = USUARIO;
        this.FECHA = FECHA;
        this.HORA = HORA;
        this.TABLA = TABLA;
    }

    public String getOPERACION() {
        return OPERACION;
    }

    public void setOPERACION(String OPERACION) {
        this.OPERACION = OPERACION;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
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

    public String getTABLA() {
        return TABLA;
    }

    public void setTABLA(String TABLA) {
        this.TABLA = TABLA;
    }

   public Object getBy(int col){
        switch (col){
            //case 0:return getID();
            case 0:return getOPERACION();
            case 1:return getUSUARIO();
            case 2:return getFECHA();
            case 3:return getHORA();
            case 4:return getTABLA();
            default:return "";
        }
    }      
}
