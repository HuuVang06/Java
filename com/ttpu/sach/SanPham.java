/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.sach;

/**
 *
 * @author Phuong Uyen
 */
public class SanPham {
    private int maSP;
    private String tenSp;
    private String moTa;
    private String nhaSX;
    private long giaBan;

    public SanPham(int maSP, String tenSp, String moTa, String nhaSX, long giaBan) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.nhaSX = nhaSX;
        this.giaBan = giaBan;
    }

    @Override
    public String toString(){
        return String.format("Ma: %d\nTen: %s\nMo ta: %s\nNha SX: %s\nGia: %d", this.maSP,this.tenSp,this.moTa,this.nhaSX,this.giaBan);
    }
    /**
     * @return the maSP
     */
    public int getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    /**
     * @return the giaBan
     */
    public long getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }
}
