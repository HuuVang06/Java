/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.sach;

/**
 *
 * @author Phuong Uyen
 */
public class Sach extends SanPham{
    private long soTrang;

    public Sach( int maSP, String tenSp, String moTa, String nhaSX, long giaBan,long soTrang) {
        super(maSP, tenSp, moTa, nhaSX, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString(){
        return String.format("%s\nSo trang: %d\n", super.toString(),this.soTrang);
    }
    /**
     * @return the soTrang
     */
    public long getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(long soTrang) {
        this.soTrang = soTrang;
    }
    
}
