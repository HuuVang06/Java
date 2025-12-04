/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nono;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVat {
    private static int dem;
    private int id=++dem;
    private String name;
    private List<VatPham> ds = new ArrayList<>();
    public NhanVat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void themVatPham(VatPham...a){
        
    }
    public void hienThi(){
        System.out.printf("ID: %d\nTen: %s\nVat pham hien co: %s\n", 
                          this.getId(), 
                          this.getName(), 
                          this.getDs());
    }
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ds
     */
    public List<VatPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<VatPham> ds) {
        this.ds = ds;
    }
    
    
}
