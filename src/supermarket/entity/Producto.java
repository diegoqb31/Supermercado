/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.entity;

/**
 *
 * @author Diego Quiros
 */
public class Producto {

    /**
     * @return the PLU
     */
    public int getPLU() {
        return PLU;
    }

    /**
     * @param PLU the PLU to set
     */
    public void setPLU(int PLU) {
        this.PLU = PLU;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
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
     * @return the EAN
     */
    public String getEAN() {
        return EAN;
    }

    /**
     * @param EAN the EAN to set
     */
    public void setEAN(String EAN) {
        this.EAN = EAN;
    }
    
    public Producto(){
        
    }
    
    public Producto(int PLU, String tipo, String descripcion, float peso, float precio, int cantidad, String EAN){
        this.PLU = PLU;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.cantidad = cantidad;
        this.EAN = EAN;
    }
    
    private int PLU;
    private String tipo;
    private String descripcion;
    private float peso;
    private float precio;
    private int cantidad;
    private String EAN;
}
