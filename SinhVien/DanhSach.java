/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Phuong Uyen
 */
public class DanhSach {

    private List<ThongTin> ds = new ArrayList<>();

    public void nhapDiem() {
        this.ds.forEach(h -> h.nhapDiem());
    }

    public void themSV(ThongTin... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themSV(String file) throws FileNotFoundException {
        File f = new File(file);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new ThongTin(sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }

    public ThongTin timKiem(int id) {
        return this.ds.stream().filter(h -> h.getMssv() == id).findFirst().get();
    }

//    public List<ThongTin> timKiem(String ten){
//        return this.ds.stream().filter(h->h.getHoTen().contains(ten)).collect(toList());
//    }
    public List<ThongTin> timKiem(String ten) {
        try {
            Class c = Class.forName(ten);
            return this.ds.stream().filter(h -> c.isInstance(h)).collect(toList());
        } catch (ClassNotFoundException e) {
            return this.ds.stream().filter(h -> h.getHoTen().contains(ten)).collect(toList());
        }
    }

    public List<ThongTin> timKiem() {
        return this.ds.stream().filter(h -> h.isHocBong()).collect(toList());
    }
    
    public void sapXep() {
        this.ds.sort((h1, h2) -> {
            double t1 = h1.diemTB();
            double t2 = h2.diemTB();
            if (t1 < t2) {
                return 1;
            } else if (t1 > t2) {
                return -1;
            }
            return 0;
        });
    }

    public void xuatHB(String duongDan) throws FileNotFoundException{
        File f = new File(duongDan);
        
        try(PrintWriter w = new PrintWriter(f)){
            List<ThongTin> hv = this.timKiem();
            for(var x: hv){
                w.printf("%d - %s - %.1f\n",
                        x.getMssv(), x.getHoTen(),x.diemTB());
            }
        }
    }
    /**
     * @return the ds
     */
    public List<ThongTin> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<ThongTin> ds) {
        this.ds = ds;
    }
}
