/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiJava;

/**
 *
 * @author DELL
 */
public class SanPham {
    String MSP,TenSP;
    int soLuong;

    public SanPham() {
    }

    public SanPham(String MSP, String TenSP, int soLuong) {
        this.MSP = MSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
    }

    public String getMSP() {
        return MSP;
    }

    public void setMSP(String MSP) {
        this.MSP = MSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
