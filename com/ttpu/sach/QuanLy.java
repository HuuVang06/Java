/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.sach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Phuong Uyen
 */
public class QuanLy {
    private List<SanPham> ds = new ArrayList<>();

    public void themSP(SanPham...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void themSP(String file) throws FileNotFoundException{
        File f = new File(file);
        try(Scanner sc = new Scanner(f))
        {
            while(sc.hasNext())
                this.ds.add(new SanPham(sc.nextInt(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLong()));

        }
    }
    
    public void xoaMaSP(int id){
        this.ds.removeIf(h->h.getMaSP()==id);
    }
    
    public void xoaSanPham(SanPham sp){
        this.ds.remove(sp);
    }
    
    public void hienThi(){
        this.ds.forEach(h->System.out.println(h));
    }
    
    public SanPham timKiem(int id){
        return this.ds.stream().filter(h->h.getMaSP()==id).findFirst().get();
    }
    
    public List<SanPham> timKiem(String ten){
        try {
            Class c = Class.forName(ten);
            return this.ds.stream().filter(h->c.isInstance(h)).collect(toList());
        } catch (ClassNotFoundException e) {
            return this.ds.stream().filter(h->h.getTenSp().contains(ten)).collect(toList());
        }
    }
    
    public List<SanPham> timKiem(long min,long max){
        return this.ds.stream().filter(h->h.getGiaBan()>=min && h.getGiaBan()<=max).collect(toList());
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
}
