/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;

/**
 *
 * @author HI
 */
public class DanhGiaGiangVien extends DanhGia {

    private GiangVien giangVien;
    private int diem;

    public DanhGiaGiangVien(GiangVien giangVien, int diem, String noiDung, String strNgayDG, String hocKy, String namHoc) throws ParseException {
        super(noiDung, strNgayDG, hocKy, namHoc);
        this.giangVien = giangVien;
        this.diem =  diem;
    }

    /**
     * @return the giangVien
     */
    public GiangVien getGiangVien() {
        return giangVien;
    }

    /**
     * @param giangVien the giangVien to set
     */
    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    /**
     * @return the diem
     */
    public int getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(int diem) {
        this.diem = diem;
    }

    public static void guiDanhGiaGV(SinhVien sv, GiangVien gv, String noiDung, String ngay, String hk, String nam, int diem) throws ParseException {
        DanhGiaGiangVien dg = new DanhGiaGiangVien(gv, diem, noiDung, ngay, hk, nam);
        
        sv.thucHienDanhGia(dg);
        
        gv.themDanhGiaTuSV(dg);
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("| [DG GV]: GV: %s | Diem: %d/4",
                giangVien.getHoTen(), diem);
    }
}
