package supermarket.entity;

import java.util.Date;

public class Factura {

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the cajero
     */
    public Usuario getCajero() {
        return cajero;
    }

    /**
     * @param cajero the cajero to set
     */
    public void setCajero(Usuario cajero) {
        this.cajero = cajero;
    }
    
    private int numero;
    private float subtotal;
    private float total;
    private Date fecha;
    private int cantidad;
    private Usuario cajero;
    
    public Factura(){
        
    }
    
    public Factura(int n, float sub, float tot, Date fec, int cant, Usuario caj){
        this.numero = n;
        this.subtotal= sub;
        this.total = tot;
        this.fecha = fec;
        this.cantidad = cant;
        this.cajero = caj;
    }
}
