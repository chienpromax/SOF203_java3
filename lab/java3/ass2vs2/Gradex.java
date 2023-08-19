/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ass2vs2;

/**
 *
 * @author DELL
 */
public class Gradex {
    public String masv,hoten;
    public int tiengAnh,tinHoc,GDTC;
    double DTB;

    public Gradex() {
    }

    public Gradex(String masv, String hoten, int tiengAnh, int tinHoc, int GDTC, double DTB) {
        this.masv = masv;
        this.hoten = hoten;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
        this.DTB = DTB;
    }
    
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(int tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public int getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(int tinHoc) {
        this.tinHoc = tinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }
    public double getDTB(){
        return (getTiengAnh()+getGDTC()+getTinHoc())/3;
    }
     public void setDTB(double DTB) {
        this.DTB = DTB;
    } 
    public String getXepLoai(){
        String xl = "";
        double dtb = getDTB();
        if (dtb>8) {
            xl = "gioi";
        }else if (dtb>=7){
            xl = "kha";
        }else if (dtb>=5){
            xl = "trung binh";
        }else{
            xl = "kem";
        }
        return xl;
    }
}
