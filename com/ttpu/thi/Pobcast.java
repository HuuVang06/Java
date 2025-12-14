/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

/**
 *
 * @author Phuong Uyen
 */
public class Pobcast extends NoiDung{
   private int soTap;
   private int thoiLuongTB;

    public Pobcast() {
    }

   
    public Pobcast( String tieuDe, String tenTacGia, int namPH,int soTap, int thoiLuongTB) {
        super( tieuDe, tenTacGia, namPH);
        this.soTap = soTap;
        this.thoiLuongTB = thoiLuongTB;
    }

   @Override
    public void nhapND(){
        super.nhapND();
        System.out.println("So trang: ");
        this.soTap = CauHinh.SC.nextInt();
        System.out.println("Dinh dang: ");
        this.thoiLuongTB = CauHinh.SC.nextInt();
    }
   @Override
    public String toString(){
        return String.format("%s\nSo tap: %d\nThoi luong TB: %d\n", 
                super.toString(),this.soTap,this.thoiLuongTB);
    }
   
    /**
     * @return the soTap
     */
    public int getSoTap() {
        return soTap;
    }

    /**
     * @param soTap the soTap to set
     */
    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    /**
     * @return the thoiLuongTB
     */
    public int getThoiLuongTB() {
        return thoiLuongTB;
    }

    /**
     * @param thoiLuongTB the thoiLuongTB to set
     */
    public void setThoiLuongTB(int thoiLuongTB) {
        this.thoiLuongTB = thoiLuongTB;
    }
}
