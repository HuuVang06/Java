/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.sach;

/**
 *
 * @author Phuong Uyen
 */
public class BangDia extends SanPham{
    private int doDai;

    public BangDia( int maSP, String tenSp, String moTa, String nhaSX, long giaBan,int doDai) {
        super(maSP, tenSp, moTa, nhaSX, giaBan);
        this.doDai = doDai;
    }

    public String toString(){
        return String.format("%s\nDo dai: %d\n", super.toString(),this.doDai);
    }
    /**
     * @return the doDai
     */
    public int getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }
}
