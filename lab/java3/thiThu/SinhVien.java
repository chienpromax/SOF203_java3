/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thiThu;

/**
 *
 * @author DELL
 */
public class SinhVien {
    String MaSV,HoTen,Lop;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String HoTen, String Lop) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.Lop = Lop;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
}
