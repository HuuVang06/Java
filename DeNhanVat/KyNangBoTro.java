/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeNhanVat;

/**
 *
 * @author HI
 */
public class KyNangBoTro extends KyNang {

    private static int dem=0;
    private double luongMauHoiPhuc;

    public KyNangBoTro(double luongMauHoiPhuc, String tenKyNang) {
        super(taoMaBoTro(), tenKyNang);
        this.luongMauHoiPhuc = luongMauHoiPhuc;
    }

    public static String taoMaBoTro() {
        dem++;
        return String.format("BF%02d", dem);
    }

    /**
     * @return the luongMauHoiPhuc
     */
    public double getLuongMauHoiPhuc() {
        return luongMauHoiPhuc;
    }

    /**
     * @param luongMauHoiPhuc the luongMauHoiPhuc to set
     */
    public void setLuongMauHoiPhuc(double luongMauHoiPhuc) {
        this.luongMauHoiPhuc = luongMauHoiPhuc;
    }

    @Override
    public void hienThi() {
        System.out.println("Ma ky nang: " + this.getMaKyNang());
        System.out.println("Ten ky nang: " + this.getTenKyNang());
        System.out.println("Hoi phuc: " + this.luongMauHoiPhuc);
    }
}
