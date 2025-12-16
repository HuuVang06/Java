/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhvang.de1lab;

import java.text.ParseException;

/**
 *
 * @author HI
 */
public class DanhGiaCoSoVatChat extends DanhGia {

    private String tenCoSo;

    public DanhGiaCoSoVatChat(String tenCoSo, String noiDung, String strNgayDG, String hocKy, String namHoc) throws ParseException {
        super(noiDung, strNgayDG, hocKy, namHoc);
        this.tenCoSo = tenCoSo;
    }

    /**
     * @return the tenCoSo
     */
    public String getTenCoSo() {
        return tenCoSo;
    }

    /**
     * @param tenCoSo the tenCoSo to set
     */
    public void setTenCoSo(String tenCoSo) {
        this.tenCoSo = tenCoSo;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | [DG CSVC]: CS: %s ", tenCoSo);
    }
}
