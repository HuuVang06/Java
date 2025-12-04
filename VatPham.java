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
public abstract class VatPham {

    private String idVP;

    public VatPham(String idVP) {
        this.idVP = idVP;
    }

    public abstract void hienThi();
    
        /**
     * @return the idVP
     */
    public String getIdVP() {
        return idVP;
    }

    /**
     * @param idVP the idVP to set
     */
    public void setIdVP(String idVP) {
        this.idVP = idVP;
    }

}
