
package supermarket.models;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import supermarket.entity.DetalleFactura;
/**
 *
 * @author XPC
 */
public class DetalleFacturaTableModel extends AbstractTableModel implements TableModel{
    String[] col = {"LINEA", "FACTURA", "PRODUCTO", "CANTIDAD", "PRECIO"};
    List<DetalleFactura> fil;
    
    public DetalleFacturaTableModel(List<DetalleFactura> rows){
        this.fil=rows;
    } 
    
    @Override
    public int getRowCount() {
       return fil.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int cols) {
        return col[cols];
    }

    @Override
    public Object getValueAt(int fi, int co) {
        DetalleFactura df = fil.get(fi);
        switch (co){
            case 0: return df.getId();
            case 1:return df.getFactura().getNumero();
            case 2:return df.getProducto().getDescripcion();
            case 3:return df.getCantidad();
            case 4:return df.getPrecio();
            default: return "";
        }
        
    }
    
    public DetalleFactura getbyRow(int fi) {
        DetalleFactura df = fil.get(fi);
        return df;
    }
}
