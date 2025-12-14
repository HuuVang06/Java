/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Phuong Uyen
 */
public class QuanLy {
    private List<NoiDung> ds = new ArrayList<>();
    private List<EBook> eb = new ArrayList<>();

    public void nhap(String duongDan) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        Class c = Class.forName(duongDan);
        
        NoiDung nd = (NoiDung) c.getDeclaredConstructor().newInstance();
        nd.nhapND();
        this.ds.add(nd);
    }
    
    public void nhapND(NoiDung...a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void themNDYT(String id){
        for(NoiDung nd : ds){
            if(nd.getMaND().contains(id)){
                nd.yeuThich();
            }
        }
    }
    
    public List<NoiDung> get3LuotYT(){
        return this.ds.stream().filter(h->h.getYeuThich()>=3).collect(toList());
    }
    
    public void hienThi(){
        this.ds.forEach(h->System.out.println(h));
    }
    
    public void xoaID(String id){
        this.ds.removeIf(h->h.getMaND().contains(id));
    }
    
    public void xoaND(NoiDung nd){
        this.xoaID(nd.getMaND());
    }
    
    public void xapXep(){
        this.ds.sort((h1 ,h2) -> {
            if(h1.getNamPH()>h2.getNamPH())return -1;
            else if(h1.getNamPH()<h2.getNamPH()) return 1;
            else{
                return -h1.getMaND().compareTo(h2.getMaND());
            }
        });
    }
    
    public void eBook(){
        for(NoiDung nd : ds){
            if(nd instanceof EBook){
                this.eb.add((EBook)nd);
            }
        }
        this.eb.sort((h1,h2)->{
            if(h1.getYeuThich()>h2.getYeuThich())return -1;
            else if(h1.getYeuThich()<h2.getYeuThich())return 1;
            else{
                return h1.getMaND().compareTo(h2.getMaND());
            }
        });
    }
    
    public void hienThiEB(){
        this.eb.forEach(h->System.out.println(h));
    }
    /**
     * @return the ds
     */
    public List<NoiDung> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NoiDung> ds) {
        this.ds = ds;
    }

    /**
     * @return the eb
     */
    public List<EBook> getEb() {
        return eb;
    }

    /**
     * @param eb the eb to set
     */
    public void setEb(List<EBook> eb) {
        this.eb = eb;
    }
    
}
