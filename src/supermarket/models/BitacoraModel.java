package supermarket.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import supermarket.entity.Bitacora;
import supermarket.entity.Producto;

/**
 *
 * @author XPC
 */
public class BitacoraModel extends AbstractTableModel implements TableModel {

    String[] col = {};
    List<Bitacora> fil;
    int type;

    public BitacoraModel(List<Bitacora> rows, int Type) {
        this.fil = rows;
        type = Type;
        switch (type) {
            case 1:
                col = new String[]{"ID", "ARTICULO", "CANTIDAD", "SUBTOTAL", "TOTAL", "ID_CAJERO", "FECHA", "HORA"};
            case 2:
                col = new String[]{"ID", "USUARIO", "NUMERO_CAJA", "FECHA_VENTA", "HORA_VENTA"};
            case 3:
                col = new String[]{"ID", "OPERACION", "USUARIO", "FECHA", "HORA", "TABLA"};
        }
    }

    @Override
    public int getRowCount() {
        return fil.size();
    }

    @Override
    public int getColumnCount() {
        switch (type) {
            case 1:
                return 8;
            case 2:
                return 5;
            case 3:
                return 6;
        }
        return 0;
    }

    @Override
    public String getColumnName(int cols) {
        switch (type) {
            case 1:
                return (getColumnCount() > cols) ? col[cols] : "";
            case 2:
                return (getColumnCount() > cols) ? col[cols] : "";
            case 3:
                return (getColumnCount() > cols) ? col[cols] : "";
        }
        return "";
    }

    @Override
    public Object getValueAt(int fi, int co) {
        Bitacora p = fil.get(fi);
        return p.getBy(co);
    }

    public Bitacora getbyRow(int fi) {
        Bitacora p = fil.get(fi);
        return p;
    }

    public int getType() {
        return type;
    }

}
