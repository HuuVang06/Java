/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pu.sanpham;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Phuong Uyen
 */
public class QuanLy {


    private List<SanPham> ds = new ArrayList<>();
    
    public void themSP(SanPham... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(s -> System.out.println(s));
    }

    public void xoaSanPham(){
        
    }
    
    public SanPham timKiem(int id) {
        return this.ds.stream().filter(s -> s.getId() == id).findFirst().get();
    }

    
    
    public List<SanPham> timKiem(String str) {
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(s -> c.isInstance(s)).collect(toList());
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(s -> s.getSp().contains(str)).collect(toList());
        }
    }

    public List<SanPham> timKiem(double min, double max) {
        return this.ds.stream().filter(s -> s.getGia() >= min && s.getGia() <= max).collect(toList());
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

    boolean tiemKiem(String ou) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
