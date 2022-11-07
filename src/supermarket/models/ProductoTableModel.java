/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.models;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import supermarket.entity.Producto;
/**
 *
 * @author XPC
 */
public class ProductoTableModel extends AbstractTableModel implements TableModel{
    
    String[] col = {"PLU", "TIPO", "DESCRIPCION", "PESO", "PRECIO", "CANTIDAD", "EAN"};
    List<Producto> fil;
    
    public ProductoTableModel(List<Producto> rows){
        this.fil=rows;
    } 
    
    @Override
    public int getRowCount() {
       return fil.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int cols) {
        return col[cols];
    }

    @Override
    public Object getValueAt(int fi, int co) {
        Producto p = fil.get(fi);
        switch (co){
            case 0: return p.getPLU();
            case 1:return p.getTipo();
            case 2:return p.getDescripcion();
            case 3:return p.getPeso();
            case 4:return p.getPrecio();
            case 5:return p.getCantidad();
            case 6:return p.getEAN();
            default: return "";
        }
    }
    
    public Producto getbyRow(int fi) {
        Producto p = fil.get(fi);
        return p;
    }
    
}
