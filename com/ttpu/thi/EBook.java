/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

/**
 *
 * @author Phuong Uyen
 */
public class EBook extends NoiDung{
    private int soTrang;
    private String dinhDang;

    public EBook() {
    }

    
    public EBook( String tieuDe, String tenTacGia, int namPH,int soTrang, String dinhDang) {
        super(tieuDe, tenTacGia, namPH);
        this.soTrang = soTrang;
        this.dinhDang = dinhDang;
    }

    @Override
    public void nhapND(){
        super.nhapND();
        System.out.println("So trang: ");
        this.soTrang = CauHinh.SC.nextInt();
        System.out.println("Dinh dang: ");
        this.dinhDang = CauHinh.SC.nextLine();
    }
    @Override
    public String toString(){
        return String.format("%s\nSo trang: %d\nDinh dang: %s\n", 
                super.toString(),this.soTrang,this.dinhDang);
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

    /**
     * @return the dinhDang
     */
    public String getDinhDang() {
        return dinhDang;
    }

    /**
     * @param dinhDang the dinhDang to set
     */
    public void setDinhDang(String dinhDang) {
        this.dinhDang = dinhDang;
    }
    
}
