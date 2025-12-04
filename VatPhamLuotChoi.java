/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nono;

/**
 *
 * @author admin
 */
public class VatPhamLuotChoi extends VatPham{
    private static int dem;
    private int luotTang;
    public VatPhamLuotChoi(String idVP) {
        super(idVP);
    }
    @Override
    public String toString(){
        return String.format("B0%s", ++dem);
    }
    
    @Override
    public void hienThi(){
        System.out.println("Ma vat pham: "+toString());
    }
    
}
