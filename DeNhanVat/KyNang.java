/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeNhanVat;

/**
 *
 * @author HI
 */
public abstract class KyNang {

    private String maKyNang;
    private String tenKyNang;

    public KyNang(String maKyNang, String tenKyNang) {
        this.maKyNang = maKyNang;
        this.tenKyNang = tenKyNang;
    }

    public abstract void hienThi();

    /**
     * @return the maKyNang
     */
    public String getMaKyNang() {
        return maKyNang;
    }

    /**
     * @param maKyNang the maKyNang to set
     */
    public void setMaKyNang(String maKyNang) {
        this.maKyNang = maKyNang;
    }

    /**
     * @return the tenKyNang
     */
    public String getTenKyNang() {
        return tenKyNang;
    }

    /**
     * @param tenKyNang the tenKyNang to set
     */
    public void setTenKyNang(String tenKyNang) {
        this.tenKyNang = tenKyNang;
    }

}
