/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttpu.thi;

/**
 *
 * @author Phuong Uyen
 */
public class Video extends NoiDung{
    private String chatLuong;
    private int thoiLuong;

    public Video( String tieuDe, String tenTacGia, int namPH,String chatLuong, int thoiLuong) {
        super( tieuDe, tenTacGia, namPH);
        this.chatLuong = chatLuong;
        this.thoiLuong = thoiLuong;
    }

    public Video() {
    }

    @Override
    public void nhapND(){
        super.nhapND();
        CauHinh.SC.nextLine();
        System.out.println("Chat luong: ");
        this.chatLuong = CauHinh.SC.nextLine();
        System.out.println("Thoi luong: ");
        this.thoiLuong = CauHinh.SC.nextInt();
    }
    
    @Override
    public String toString(){
        return String.format("%s\nChat luong: %s\nThoi luong: %d\n", 
                super.toString(),this.chatLuong,this.thoiLuong);
    }
    /**
     * @return the chatLuong
     */
    public String getChatLuong() {
        return chatLuong;
    }

    /**
     * @param chatLuong the chatLuong to set
     */
    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    /**
     * @return the thoiLuong
     */
    public int getThoiLuong() {
        return thoiLuong;
    }

    /**
     * @param thoiLuong the thoiLuong to set
     */
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    
}
