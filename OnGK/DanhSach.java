/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Phuong Uyen
 */
public class DanhSach {
    private List<Vacxin> ds = new ArrayList<>();
    private List<NguoiDan> ds1 = new ArrayList<>();

    public void themVacxin(Vacxin...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThiVacxin(){
        this.ds.forEach(s->System.out.println(s));
    }
    
    public void themNguoiDan(NguoiDan...a){
        this.ds1.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds1.forEach(h->System.out.println(h));
    }
    
    public void hienThiNguoiNuocNgoai(){
        for(NguoiDan nguoi : ds1){
            if(nguoi instanceof NuocNgoai){
                System.out.println(nguoi);
            }
        }
    }
    
    
    /**
     * @return the ds
     */
    public List<Vacxin> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Vacxin> ds) {
        this.ds = ds;
    }
    
}
