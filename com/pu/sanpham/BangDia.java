/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pu.sanpham;

/**
 *
 * @author Phuong Uyen
 */
public class BangDia extends SanPham{
    private int doDai;

    public BangDia( String sp, double gia, int doDai) {
        super(sp, gia);
        this.doDai = doDai;
    }
    
    @Override
    public String toString(){
        return String.format("%sDo Dai : %d phut", super.toString(),this.doDai);
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
