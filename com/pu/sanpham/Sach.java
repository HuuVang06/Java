/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pu.sanpham;

/**
 *
 * @author Phuong Uyen
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach( String sp, double gia,int soTrang) {
        super(sp, gia);
        this.soTrang = soTrang;
    }
    
    
    @Override
    public String toString(){
        return String.format("%sSo Trang : %d", super.toString(),this.soTrang);
    }

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
