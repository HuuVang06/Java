/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.pu.sanpham;

/**
 *
 * @author Phuong Uyen
 */
public class Tester {

    public static void main(String[] args) {
        SanPham sp1 = new BangDia("OU", 24, 57);
        SanPham sp2 = new Sach("OOP", 54, 6);
        SanPham sp3 = new Sach("MMT", 50, 75);
        QuanLy ql = new QuanLy();
        ql.themSP(sp1, sp2,sp3);
        //ql.hienThi();
        System.out.println(ql.timKiem("OU"));
        System.out.println(ql.timKiem("OOP"));
        //System.out.println(ql.timKiem(2));
        //System.out.println(ql.timKiem(10, 60));
        //ql.timKiem("com.pu.sanpham.BangDia").forEach(s->System.out.println(s));
    }
}
