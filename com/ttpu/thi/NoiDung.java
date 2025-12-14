/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

/**
 *
 * @author Phuong Uyen
 */
public class NoiDung {
    private static int dem;
    private String maND;
    private String tieuDe;
    private String tenTacGia;
    private int namPH;
    private int yeuThich;

    public NoiDung() {
    }
    
    {
        this.setMaND(String.format("CONTENT%06d", ++dem));
    }

    public void yeuThich(){
        yeuThich++;
    }
    public NoiDung( String tieuDe, String tenTacGia, int namPH) {
        this.tieuDe = tieuDe;
        this.tenTacGia = tenTacGia;
        this.namPH = namPH;
    }

    public void nhapND(){
        System.out.println("Tieu de: ");
        this.tieuDe = CauHinh.SC.nextLine();
        System.out.println("Ten tac gia: ");
        this.tenTacGia = CauHinh.SC.nextLine();
        System.out.println("Nam phat hanh: ");
        this.namPH = CauHinh.SC.nextInt();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("Ma ND: %s\nTieu de: %s\nTen tac gia: %s\nNam: %d", 
                this.maND,this.tieuDe,this.tenTacGia,this.namPH);
    }
    
    /**
     * @return the maND
     */
    public String getMaND() {
        return maND;
    }

    /**
     * @param maND the maND to set
     */
    public void setMaND(String maND) {
        this.maND = maND;
    }

    /**
     * @return the tieuDe
     */
    public String getTieuDe() {
        return tieuDe;
    }

    /**
     * @param tieuDe the tieuDe to set
     */
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    /**
     * @return the tenTacGia
     */
    public String getTenTacGia() {
        return tenTacGia;
    }

    /**
     * @param tenTacGia the tenTacGia to set
     */
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    /**
     * @return the namPH
     */
    public int getNamPH() {
        return namPH;
    }

    /**
     * @param namPH the namPH to set
     */
    public void setNamPH(int namPH) {
        this.namPH = namPH;
    }

    /**
     * @return the yeuThich
     */
    public int getYeuThich() {
        return yeuThich;
    }

    /**
     * @param yeuThich the yeuThich to set
     */
    public void setYeuThich(int yeuThich) {
        this.yeuThich = yeuThich;
    }

    
}
