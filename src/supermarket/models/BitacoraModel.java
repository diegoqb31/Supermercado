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
    String[] col2 = {};
    String[] col3 = {};
    List<Bitacora> fil;
    int type;

    public BitacoraModel(List<Bitacora> rows, int Type) {
        this.fil = rows;
        type = Type;
        switch (type) {
            case 1:
                col = new String[]{"ARTICULO", "CANTIDAD", "SUBTOTAL", "TOTAL", "ID_CAJERO", "FECHA", "HORA"};               
            case 2:
                col2 = new String[]{"USUARIO", "NUMERO_CAJA", "FECHA_VENTA", "HORA_VENTA"};
            case 3:
                col3 = new String[]{"OPERACION", "USUARIO", "FECHA", "HORA", "TABLA"};
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
                return 7;
            case 2:
                return 4;
            case 3:
                return 5;
        }
        return 0;
    }

    @Override
    public String getColumnName(int cols) {
        switch (type) {
            case 1:
                return (getColumnCount() > cols) ? col[cols] : "";
            case 2:
                return (getColumnCount() > cols) ? col2[cols] : "";
            case 3:
                return (getColumnCount() > cols) ? col3[cols] : "";
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