/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_module4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author user
 */
public class SanPhamTable extends AbstractTableModel{
    private String name[]={"Mã sản phẩm", "Tên sản phẩm","Nhà sản xuất","Mã loại sản phẩm"};
    private Class classes[]={String.class, String.class, String.class, String.class};
    
    ArrayList<SanPham> ds=new ArrayList<SanPham>();

    public SanPhamTable(ArrayList<SanPham> ds)
   {
       this.ds=ds;
   }
    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount()
    {
        return ds.size();
    }
    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
       
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMaSp();
            case 1: return ds.get(rowIndex).getTenSp();
            case 2: return ds.get(rowIndex).getNhaSX();
            case 3: return ds.get(rowIndex).getMaLoaiSP(); 
            
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
    
}
