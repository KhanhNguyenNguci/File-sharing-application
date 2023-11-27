/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import data.DataReader;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class CellEditor extends DefaultCellEditor{
    public CellEditor(){
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1) {
        Object data = jtable.getValueAt(i, 0);
                    if(data instanceof DataReader){
                       DataReader reader = (DataReader) data;
                       return reader.getStatus();
                   }else{
                       return super.getTableCellEditorComponent(jtable, o, bln, i, i1);
                   }
        
    }
    
}
