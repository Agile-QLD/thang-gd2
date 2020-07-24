/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMDI;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class TTLopSV implements Serializable{
    public String nganh,lop,mon,maNganh,maLop,maMon;
    public String hoTen,maSv,gioiTinh,ngaySinh,sdt;
    public double diemQuiz,diemLab,diemAss,diemTB;
    public TTLopSV() {
    }

    public TTLopSV(String nganh, String lop, String mon, String maNganh, String maLop, String maMon, String hoTen, String maSv, String gioiTinh, String ngaySinh, String sdt, double diemQuiz, double diemLab, double diemAss, double diemTB) {
        this.nganh = nganh;
        this.lop = lop;
        this.mon = mon;
        this.maNganh = maNganh;
        this.maLop = maLop;
        this.maMon = maMon;
        this.hoTen = hoTen;
        this.maSv = maSv;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diemQuiz = diemQuiz;
        this.diemLab = diemLab;
        this.diemAss = diemAss;
        this.diemTB = diemTB;
    }

   
    
    
    
}
