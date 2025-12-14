/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

/**
 *
 * @author Phuong Uyen
 */
public class ThongTin {

    private static int dem;
    private int mssv = ++dem;
    private String hoTen;
    private LocalDate ngaySinh;
    private double[] diem;

    public ThongTin(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.FORRMAT);
    }

    public void nhapDiem() {
        System.out.printf("Hoc Vien %s\n",this.hoTen);
        this.diem = new double[CauHinh.SO_MON];
        for (int i = 0; i < CauHinh.SO_MON; i++) {
            System.out.printf("Mon thu %d ", i + 1);
            this.diem[i] = CauHinh.SC.nextDouble();
        }
    }

    public double diemTB(){
        if(this.diem!=null){
            return DoubleStream.of(this.diem).average().getAsDouble();
        }
        return 0;
    }
    
    public boolean isHocBong(){
        if(this.diem == null){
            return false;
        }
        for(var x: this.diem){
            if(x<5)return false;
        }
        return this.diemTB() >=8;
    }
    public void hienThi() {
        System.out.printf("Ma: %d\nHo ten: %s\nNgay sinh: %s\n",
                this.mssv, this.hoTen,
                this.ngaySinh.format(CauHinh.FORRMAT));
        if(this.diem!=null){
            for(var x: this.diem){
                System.out.printf("%.1f\t",x);
            }
            System.out.println();
        }
    }

    /**
     * @return the mssv
     */
    public int getMssv() {
        return mssv;
    }

    /**
     * @param mssv the mssv to set
     */
    public void setMssv(int mssv) {
        this.mssv = mssv;
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

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
