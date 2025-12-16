/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HI
 */
public abstract class DanhGia {

    protected int dem = 0;
    protected int maDG;
    protected String noiDung;
    protected Date ngayDG;
    protected String hocKy;
    protected String namHoc;
    protected SinhVien sinhVien;
    protected static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public DanhGia(String noiDung, String strNgayDG, String hocKy, String namHoc) throws ParseException {
        this.maDG = ++dem;
        this.noiDung = noiDung;
        this.ngayDG = sdf.parse(strNgayDG);
        this.hocKy = hocKy;
        this.namHoc = namHoc;
    }

    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }

    /**
     * @return the maDG
     */
    public int getMaDG() {
        return maDG;
    }

    /**
     * @param maDG the maDG to set
     */
    public void setMaDG(int maDG) {
        this.maDG = maDG;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the ngayDG
     */
    public Date getNgayDG() {
        return ngayDG;
    }

    /**
     * @param ngayDG the ngayDG to set
     */
    public void setNgayDG(Date ngayDG) {
        this.ngayDG = ngayDG;
    }

    /**
     * @return the hocKy
     */
    public String getHocKy() {
        return hocKy;
    }

    /**
     * @param hocKy the hocKy to set
     */
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    /**
     * @return the namHoc
     */
    public String getNamHoc() {
        return namHoc;
    }

    /**
     * @param namHoc the namHoc to set
     */
    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    /**
     * @return the sinhVien
     */
    public SinhVien getSinhVien() {
        return sinhVien;
    }

    /**
     * @param sinhVien the sinhVien to set
     */
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
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
        String tenSV = (sinhVien != null) ? sinhVien.getHoTen() : "An danh";
        return String.format("MSSV: %d | Ngay: %s | HK: %s - %s | SV: %s "
                + "| ND: %s", maDG, sdf.format(ngayDG), hocKy, namHoc, tenSV, noiDung);
    }

}
