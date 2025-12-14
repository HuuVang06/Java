/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

import java.time.LocalDate;

/**
 *
 * @author Phuong Uyen
 */
public class VietNam extends NguoiDan{
    private long cccd;
    private long soDT;
    private LocalDate ngaySinh;

    public VietNam( String hoTen, String gioiTinh,long cccd, long soDT, String ngaySinh) {
        super(hoTen, gioiTinh);
        this.cccd = cccd;
        this.soDT = soDT;
        this.ngaySinh = LocalDate.parse(ngaySinh,CauHinh.FORRMAT);
    }

    

    @Override
    public String toString(){
        return String.format("%sCCCD: %d\nSo dien thoai: %d\nNgay sinh: %s\n", super.toString(),this.cccd,this.soDT,this.ngaySinh.format(CauHinh.FORRMAT));
    }

    

    

    
    /**
     * @return the cccd
     */
    public long getCccd() {
        return cccd;
    }

    /**
     * @param cccd the cccd to set
     */
    public void setCccd(long cccd) {
        this.cccd = cccd;
    }

    /**
     * @return the soDT
     */
    public long getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(long soDT) {
        this.soDT = soDT;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
