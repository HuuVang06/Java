/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HI
 */
public class GiangVien {

    private String maGV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private List<DanhGiaGiangVien> danhSachDone = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public GiangVien(String maGV, String hoTen, String gioiTinh, String strNgaySinh) throws ParseException {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = sdf.parse(strNgaySinh);
    }

    /**
     * @return the maGV
     */
    public String getMaGV() {
        return maGV;
    }

    /**
     * @param maGV the maGV to set
     */
    public void setMaGV(String maGV) {
        this.maGV = maGV;
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

    @Override
    public String toString() {
        return String.format("GV: %s (%s) - %s ", maGV, hoTen, sdf.format(ngaySinh));
    }

    public void themDanhGiaTuSV(DanhGiaGiangVien dg){
        this.danhSachDone.add(dg);
    }
    
    
    
    public double tinhDiemTrungBinh(String hk, String namHoc) {
        double tongDiem = 0;
        int soLuong = 0;

        for (DanhGiaGiangVien dg : danhSachDone) {

            if (dg.getHocKy().equalsIgnoreCase(hk) && dg.getNamHoc().equals(namHoc)) {
                tongDiem += dg.getDiem();
                soLuong++;
            }
        }

        return (soLuong == 0) ? 0 : (tongDiem / soLuong);
    }
}
