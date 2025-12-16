/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HI
 */
public class SinhVien implements Comparable<SinhVien> {

    private String mssv;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private List<DanhGia> danhSachDone = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVien(String mssv, String hoTen, String gioiTinh, String strNgaySinh) throws ParseException {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = sdf.parse(strNgaySinh);
    }

    public void themDanhGia(DanhGia dg) {
        dg.setSinhVien(this);
        this.danhSachDone.add(dg);
    }

    public int getSoLuongDanhGia() {
        return danhSachDone.size();
    }

    /**
     * @return the mssv
     */
    public String getMssv() {
        return mssv;
    }

    /**
     * @param mssv the mssv to set
     */
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the danhSachDone
     */
    public List<DanhGia> getDanhSachDone() {
        return danhSachDone;
    }

    /**
     * @param danhSachDone the danhSachDone to set
     */
    public void setDanhSachDone(List<DanhGia> danhSachDone) {
        this.danhSachDone = danhSachDone;
    }

    /**
     * @return the sdf
     */
    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    /**
     * @param aSdf the sdf to set
     */
    public static void setSdf(SimpleDateFormat aSdf) {
        sdf = aSdf;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | Ngay sinh: %s | Da danh gia: %d",
                mssv, hoTen, sdf.format(ngaySinh), getSoLuongDanhGia());
    }

    public void thucHienDanhGia(DanhGia dg) {
        dg.setSinhVien(this);
        this.danhSachDone.add(dg);
    }

    @Override
    public int compareTo(SinhVien sv) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(this.ngaySinh);
        c2.setTime(sv.ngaySinh);

        int y1 = c1.get(Calendar.YEAR);
        int y2 = c2.get(Calendar.YEAR);
        
        if (y1 != y2) {
            return y2 - y1;
        }
        return this.getSoLuongDanhGia() - sv.getSoLuongDanhGia();
    }
}
