/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.io.FileNotFoundException;

/**
 *
 * @author Phuong Uyen
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        ThongTin sv = new ThongTin("TTPU", "15/02/2005");
        //ThongTin sv1 = new ThongTin("TTPU", "14/05/2005");
        DanhSach ds=new DanhSach();
        ds.themSV(sv);
        ds.themSV("src/main/resources/sanpham.txt");
        //ds.tieKiem(2).hienThi();
        //ds.timKiem("NTT").forEach(h->h.hienThi());
        //ds.timKiem("SinhVien.ThongTin").forEach(h->h.hienThi());
        //ds.themSV(sv,sv1);
        //ds.hienThi();
        ds.nhapDiem();
        ds.hienThi();
        ds.xuatHB("src/main/resources/hocbong.txt");
        //ds.sapXep();
        //ds.hienThi();
    }
}
