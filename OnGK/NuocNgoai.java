/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnGK;

/**
 *
 * @author Phuong Uyen
 */
public class NuocNgoai extends NguoiDan{
    private long soHoCHieu;
    private String quocTich;

    public NuocNgoai( String hoTen, String gioiTinh,long soHoCHieu, String quocTich) {
        super(hoTen, gioiTinh);
        this.soHoCHieu = soHoCHieu;
        this.quocTich = quocTich;
    }

    @Override
    public String toString(){
        return String.format("%sSo ho chieu: %d\nQuoc tich: %s\n", super.toString(),this.soHoCHieu,this.quocTich);
    }
    /**
     * @return the soHoCHieu
     */
    public long getSoHoCHieu() {
        return soHoCHieu;
    }

    /**
     * @param soHoCHieu the soHoCHieu to set
     */
    public void setSoHoCHieu(long soHoCHieu) {
        this.soHoCHieu = soHoCHieu;
    }

    /**
     * @return the quocTich
     */
    public String getQuocTich() {
        return quocTich;
    }

    /**
     * @param quocTich the quocTich to set
     */
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    
}
