/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agile;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class SinhVien implements Serializable{
    private String maHS;
    private String tenHS;
    private String gioiTinh;
    private int namSinh;
    private String queQuan;
    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private String HinhAnh;

    public SinhVien() {
    }

    public SinhVien(String maHS, String tenHS, String gioiTinh, int namSinh, String queQuan, double diemToan, double diemVan, double diemAnh, String HinhAnh) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.HinhAnh = HinhAnh;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    

    
    
    

    
    
   
}
