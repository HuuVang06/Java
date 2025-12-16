/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HI
 */
public class Tester {

    public static void main(String[] args) throws ParseException {
        GiangVien gv1 = new GiangVien("GV01", "Nguyen Van A", "Nam", "19/07/1984");
        GiangVien gv2 = new GiangVien("GV02", "Tran Thi B", "Nu", "18/06/1997");

        SinhVien sv1 = new SinhVien("SV01", "Nguyen Nam C", "Nam", "19/05/2005");
        SinhVien sv2 = new SinhVien("SV02", "Tran Ngoc D", "Nu", "21/02/2006");
        SinhVien sv3 = new SinhVien("SV03", "Nguyen Tran E", "Nu", "19/02/2005");

        List<SinhVien> lop = new ArrayList<>();
        lop.add(sv1);
        lop.add(sv2);
        lop.add(sv3);

        DanhGiaGiangVien.guiDanhGiaGV(sv1, gv1, "Tot", "20/05/2025", "HK2", "2024-2025", 8);
        DanhGiaGiangVien.guiDanhGiaGV(sv2, gv2, "Te", "30/08/2025", "HK2", "2024-2025", 7);
        DanhGiaGiangVien.guiDanhGiaGV(sv3, gv1, "Tot", "17/05/2025", "HK2", "2024-2025", 10);
        DanhGiaGiangVien.guiDanhGiaGV(sv3, gv2, "Tot", "20/05/2025", "HK2", "2024-2025", 8);

        System.out.printf("GV %s | DTB: %.1f \n", gv1.getHoTen(), gv1.tinhDiemTrungBinh("HK2", "2024-2025"));
        System.out.printf("GV %s | DTB: %.1f \n", gv2.getHoTen(), gv2.tinhDiemTrungBinh("HK2", "2024-2025"));

        System.out.println("Danh Sach SV (truoc khi sep)");
        for (SinhVien sv : lop) {
            System.out.println(sv);
        }

        Collections.sort(lop);

        System.out.println("Danh sach sv sau khi sort:");
        for (SinhVien sv : lop) {
            System.out.println(sv);
        }

    }
}