/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeNhanVat;

/**
 *
 * @author HI
 */
public class KyNangTanCong extends KyNang {

    private static int dem=0;
    private double satThuongGayRa;

    public KyNangTanCong(double satThuongGayRa, String tenKyNang) {
        super(taoMaTanCong(), tenKyNang);
        this.satThuongGayRa = satThuongGayRa;
    }

    public static String taoMaTanCong() {
        dem++;
        return String.format("AT%02d", dem);
    }

    /**
     * @return the satThuongGayRa
     */
    public double getSatThuongGayRa() {
        return satThuongGayRa;
    }

    /**
     * @param satThuongGayRa the satThuongGayRa to set
     */
    public void setSatThuongGayRa(double satThuongGayRa) {
        this.satThuongGayRa = satThuongGayRa;
    }

    @Override
    public void hienThi() {
        System.out.println("Ma ky nang: " + this.getMaKyNang());
        System.out.println("Ten ky nang: " + this.getTenKyNang());
        System.out.println("Sat thuong gay ra: " + this.satThuongGayRa);
    }

}
