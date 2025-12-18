/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeNhanVat;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author HI
 */
public class Tuong {

    private static int dem = 0;
    private int maTuong;
    private String tenTuong;
    private List<KyNang> dsKyNang;

    public Tuong(String tenTuong) {
        this.maTuong = dem++;
        this.tenTuong = tenTuong;
        this.dsKyNang = new ArrayList<>();
    }

    public void themKyNang(KyNang... a) {
        dsKyNang.addAll(Arrays.asList(a));
    }

    public double tinhTongSatThuong() {
        double tong = 0;
        for (KyNang k : dsKyNang) {
            if (k instanceof KyNangTanCong) {
                tong += ((KyNangTanCong) k).getSatThuongGayRa();
            }
        }
        return tong;
    }

    public void hienThiTuong(){
        System.out.println("Tuong: "+tenTuong+"[Ma"+maTuong+"]");
        System.out.println("Tong sat thuong gay ra: "+tinhTongSatThuong());
        System.out.println("Danh sach ky nang");
        for(KyNang k : dsKyNang){
            k.hienThi();
        }
    }
    /**
     * @return the maTuong
     */
    public int getMaTuong() {
        return maTuong;
    }

    /**
     * @param maTuong the maTuong to set
     */
    public void setMaTuong(int maTuong) {
        this.maTuong = maTuong;
    }

    /**
     * @return the tenTuong
     */
    public String getTenTuong() {
        return tenTuong;
    }

    /**
     * @param tenTuong the tenTuong to set
     */
    public void setTenTuong(String tenTuong) {
        this.tenTuong = tenTuong;
    }

    /**
     * @return the dsKyNang
     */
    public List<KyNang> getDsKyNang() {
        return dsKyNang;
    }

    /**
     * @param dsKyNang the dsKyNang to set
     */
    public void setDsKyNang(List<KyNang> dsKyNang) {
        this.dsKyNang = dsKyNang;
    }

}
