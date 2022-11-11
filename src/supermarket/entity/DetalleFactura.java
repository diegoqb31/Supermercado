package supermarket.entity;

/**
 *
 * @author Diego Quiros
 */
public class DetalleFactura {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
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
    
    private int id;
    private Factura factura;
    private Producto producto;
    private int cantidad;
    private float precio;
    
    public DetalleFactura(){
        
    }
    
    public DetalleFactura(int id, Factura factura, Producto producto, int cantidad, int precio){
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
}
