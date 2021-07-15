/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_module4;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Database;
/**
 *
 * @author user
 */
public class LoaiSanPhamDB extends Database{
    public ArrayList<LoaiSanPham> getLoaiSanPham() {
        ArrayList<LoaiSanPham> dsKct = new ArrayList<LoaiSanPham>();
        String getAllSQL = "SELECT * FROM LoaiSanPham";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                dsKct.add(new LoaiSanPham(rs.getString("MaLoaiSP"), rs.getString("TenLoaiSP")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsKct;
    }
}
