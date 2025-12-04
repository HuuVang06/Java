/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyNhanVat {
    private List<NhanVat> ds = new ArrayList<>();
    
    public void themNhanVat(NhanVat... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    /**
     * @return the ds
     */
    public List<NhanVat> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVat> ds) {
        this.ds = ds;
    }
}
