/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeNhanVat;

/**
 *
 * @author HI
 */
public class Tester {
    public static void main(String[] args) {
        Tuong t1 = new Tuong("Yasuo");
        KyNang k1 = new KyNangTanCong(100, "Chemgio");
        KyNang k2 = new KyNangBoTro(50, "MauHeo");
        
        t1.themKyNang(k1);
        t1.themKyNang(k2);
        
        t1.hienThiTuong();
    }
}
