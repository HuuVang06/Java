/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Phuong Uyen
 */
public class NguoiDung {
    private List<NoiDung> ndYT = new ArrayList<>();
    private String hoTen;
    private String soDT;
    private String eMail;

    public NguoiDung(String hoTen, String soDT, String eMail) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.eMail = eMail;
    }
    
    public void hienThi(){
        this.ndYT.forEach(h->System.out.println(h));
    }
    
    public void  timKiem(String id){
        NoiDung nd = this.ndYT.stream().filter(h->h.getMaND().contains(id)).findFirst().orElse(null);
        if(nd != null){
            System.out.println(nd);
        }
        else {
            System.out.println("Khong co. ");
        }
    }
    
    @Override
    public String toString(){
        return String.format("Ho ten: %s\nSo dien thoai: %s\nEmail: %s\n", this.hoTen,this.soDT,this.eMail);
    }
    /**
     * @return the ndYT
     */
    public List<NoiDung> getNdYT() {
        return ndYT;
    }

    /**
     * @param ndYT the ndYT to set
     */
    public void setNdYT(List<NoiDung> ndYT) {
        this.ndYT = ndYT;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the soDT
     */
    public String getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    
}
