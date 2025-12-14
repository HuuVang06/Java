/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

import java.time.LocalDate;

/**
 *
 * @author Phuong Uyen
 */
public class TiemChung {
    private Vacxin vacxin;
    private LocalDate ngayTiem;
    private String diaDiem;

    public TiemChung(Vacxin vacxin, String ngayTiem, String diaDiem) {
        this.vacxin = vacxin;
        LocalDate.parse(ngayTiem,CauHinh.FORRMAT);
        this.diaDiem = diaDiem;
    }

    @Override
    public String toString(){
        return String.format("Loai Vacxin: %s\nNgay tiem: %s\nDia diem: %s", this.vacxin.getTen(),this.ngayTiem,this.diaDiem);
    }
    /**
     * @return the vacxin
     */
    public Vacxin getVacxin() {
        return vacxin;
    }

    /**
     * @param vacxin the vacxin to set
     */
    public void setVacxin(Vacxin vacxin) {
        this.vacxin = vacxin;
    }

    /**
     * @return the ngayTiem
     */
    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    /**
     * @param ngayTiem the ngayTiem to set
     */
    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    /**
     * @return the diaDiem
     */
    public String getDiaDiem() {
        return diaDiem;
    }

    /**
     * @param diaDiem the diaDiem to set
     */
    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
}
