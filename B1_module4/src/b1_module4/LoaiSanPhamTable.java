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
public class LoaiSanPhamTable extends AbstractTableModel{
    private String name[]={"Mã loại sản phẩm", "Tên loại sản phẩm"};
    private Class classes[]={String.class, String.class};
    
    ArrayList<LoaiSanPham> ds=new ArrayList<LoaiSanPham>();

    public LoaiSanPhamTable(ArrayList<LoaiSanPham> ds)
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
            case 0: return ds.get(rowIndex).getMaLoaiSp();
            case 1: return ds.get(rowIndex).getTenLoaiSp();
            
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
