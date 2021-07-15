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
public class LoaiSanPham {
    private String maLoaiSp,tenLoaiSp;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoaiSp, String tenLoaiSp) {
        this.maLoaiSp = maLoaiSp;
        this.tenLoaiSp = tenLoaiSp;
    }

    public String getMaLoaiSp() {
        return maLoaiSp;
    }

    public String getTenLoaiSp() {
        return tenLoaiSp;
    }

    public void setMaLoaiSp(String maLoaiSp) {
        this.maLoaiSp = maLoaiSp;
    }

    public void setTenLoaiSp(String tenLoaiSp) {
        this.tenLoaiSp = tenLoaiSp;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "maLoaiSp=" + maLoaiSp + ", tenLoaiSp=" + tenLoaiSp + '}';
    }

}
