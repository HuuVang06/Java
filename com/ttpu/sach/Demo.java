/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.sach;

import java.io.FileNotFoundException;

/**
 *
 * @author Phuong Uyen
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        //SanPham sp1 = new Sach(2, "OOP", "Khong co", "NHT", 400000, 212);
        //SanPham sp2 = new BangDia(3, "MMT", "Hiem", "Thien", 210000, 60);

        QuanLy ql = new QuanLy();
        //ql.themSP(sp1,sp2);
        //ql.hienThi();
        //System.out.println("-------");
        //System.out.println(ql.timKiem(2));
        //System.out.println(ql.timKiem("OOP"));
        //ql.timKiem("com.ttpu.sach.BangDia").forEach(h->System.out.println(h));
        //ql.timKiem(210000, 300000).forEach(h->System.out.println(h));
        //ql.xoaMaSP(3);
        ql.themSP("src/main/resources/sanpham.txt");
        ql.hienThi();
    }
    
}
