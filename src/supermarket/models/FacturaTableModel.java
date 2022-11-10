
package supermarket.models;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import supermarket.entity.Factura;

public class FacturaTableModel extends AbstractTableModel implements TableModel{
    
    String[] col = {"NUMERO", "SUBTOTAL", "TOTAL", "FECHA", "CANTIDAD", "ID_CAJERO"};
    List<Factura> fil;
    
    public FacturaTableModel(List<Factura> rows){
        this.fil=rows;
    } 
    
    @Override
    public int getRowCount() {
       return fil.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int cols) {
        return col[cols];
    }

    @Override
    public Object getValueAt(int fi, int co) {
        Factura p = fil.get(fi);
        switch (co){
            case 0: return p.getNumero();
            case 1:return p.getSubtotal();
            case 2:return p.getTotal();
            case 3:return new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha());
            case 4:return p.getCantidad();
            case 5:return p.getCajero().getId();
            default: return "";
        }
    }
}
