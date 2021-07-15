/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_module4;

/**
 *
 * @author user
 */
public class SanPham {
    private String maSp, tenSp, nhaSX, maLoaiSP;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String nhaSX, String maLoaiSP) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.nhaSX = nhaSX;
        this.maLoaiSP = maLoaiSP;
    }

    public String getMaSp() {
        return maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", nhaSX=" + nhaSX + ", maLoaiSP=" + maLoaiSP + '}';
    }
    
    
}
