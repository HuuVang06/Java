/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pu.sanpham;

/**
 *
 * @author Phuong Uyen
 */
public class SanPham {

    private static int dem;
    private int id = ++dem;
    private String sp;
    private double gia;

    public SanPham(String sp, double gia) {
        this.sp = sp;
        this.gia = gia;
    }

    
    @Override
    public String toString(){
        return String.format("%d + %s + %.1f\n", this.id,this.sp,this.gia);
        
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sp
     */
    public String getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(String sp) {
        this.sp = sp;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }
}
