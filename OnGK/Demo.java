/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

/**
 *
 * @author Phuong Uyen
 */
public class Demo {
    public static void main(String[] args) {
        Vacxin vx = new Vacxin("Covid", "QN", 7);
        Vacxin vx1 = new Vacxin("Viem gan B", "My", 1);
        
        NguoiDan nd = new NuocNgoai("Mary", "Nu", 24, "My");
        NguoiDan nd1 = new VietNam("Thinh", "bede", 10, 123456, "04/02/2005");
        NguoiDan nd2 = new NuocNgoai("Peter", "Nam", 14, "Nga");
        
        
        
        //DanhSach ds = new DanhSach();
        //ds.themVacxin(vx,vx1);
        //.hienThiVacxin();
        
        DanhSach ds1 = new DanhSach();
        ds1.themNguoiDan(nd,nd1,nd2);
        //ds1.hienThiNguoiNuocNgoai();
        ds1.hienThi();
        
    }
}
