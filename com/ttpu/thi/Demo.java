/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuong Uyen
 */
public class Demo {
    public static void main(String[] args) {
        //try {
                    NoiDung nd1 = new EBook("OOP", "TTPU", 2005, 12, "PDF");
                   NoiDung nd2 = new Pobcast("MMT", "NTT", 2004, 45, 16);
        NoiDung nd3 = new Video("CSDL", "NTAT", 2006, "4K", 45);
        NoiDung nd4 = new Video("DB", "TVT", 2004, "FULL HD", 50);
//        NoiDung nd5 = new EBook("TA", "ABC", 2004, 17, "WORD");
//        NoiDung nd6 = new EBook("BT", "XYZ", 2008, 11, "TXT");
//        
//        NguoiDung n1 = new NguoiDung("NTB", "0968621415", "phuonguyen6h@gmail.com");
//        NguoiDung n2 = new NguoiDung("TNDK", "0961171268", "phuonguyenbacham6h@gmail.com");
//
          QuanLy ql = new QuanLy();
          //ql.nhap("com.ttpu.thi.Video");
          
        ql.nhapND(nd1,nd2);
        ql.hienThi();
//        ql.themNDYT("CONTENT000001");
//        ql.themNDYT("CONTENT000005");
//        ql.themNDYT("CONTENT000006");
//        ql.themNDYT("CONTENT000001");
//        ql.themNDYT("CONTENT000006");
//        ql.themNDYT("CONTENT000006");
//        ql.themNDYT("CONTENT000005");
//System.out.println(ql.get3LuotYT());
//        ql.eBook();
//        ql.hienThiEB();
//n1.hienThi();
//n1.timKiem("CONTENT000002");
//n2.hienThi();

//ql.hienThi();
//System.out.println("--------------");
//ql.xoaID("CONTENT000002");
//ql.xoaND(nd2);
//ql.xapXep();
//ql.hienThi();
//        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
//            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        QuanLy ql = new QuanLy();
//        try {
//            ql.nhap("com.ttpu.EBook");
//        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
//            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
