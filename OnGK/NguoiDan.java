/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

/**
 *
 * @author Phuong Uyen
 */
public abstract class NguoiDan {
    private String hoTen;
    private String gioiTinh;

    public NguoiDan(String hoTen, String gioiTinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString(){
        return String.format("Ho Ten: %s\nGioi tinh: %s\n", this.hoTen,this.gioiTinh);
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
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
