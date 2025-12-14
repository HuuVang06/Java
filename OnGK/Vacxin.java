/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

/**
 *
 * @author Phuong Uyen
 */
public class Vacxin {
    private static int dem;
    private int ma = ++dem;
    private String ten;
    private String xuatXu;
    private int sl;

    public Vacxin(String ten, String xuatXu, int sl) {
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.sl = sl;
    }

    @Override
    public String toString(){
        return String.format("Ten: %s\nXuat Xu: %s\nSo luong: %d\n", this.ten,this.xuatXu,this.sl);
    }
    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the xuatXu
     */
    public String getXuatXu() {
        return xuatXu;
    }

    /**
     * @param xuatXu the xuatXu to set
     */
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    /**
     * @return the sl
     */
    public int getSl() {
        return sl;
    }

    /**
     * @param sl the sl to set
     */
    public void setSl(int sl) {
        this.sl = sl;
    }
}
