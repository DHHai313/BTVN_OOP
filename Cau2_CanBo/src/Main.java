/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
//        CongNhan congNhan = new CongNhan("Nguyen Van A", 1985, "Nam", "Hà Nội", "3/7");
//        KySu kySu = new KySu("Tran Thi B", 1990, "Nữ", "Đà Nẵng", "Công nghệ thông tin");
//        NhanVien nhanVien = new NhanVien("Le Van C", 1992, "Nam", "TP HCM", "Kế toán");
        CongNhan congNhan = new CongNhan("3/7", "nguyen van a", 2004, "nam", "ha nam");
        KySu kySu = new KySu("CNTT", "dinh hong hai", 2004, "nam", "ha nam");
        NhanVien nhanVien = new  NhanVien("Tro Ly", "chu hang", 2004, "nu", "ha nam");
        congNhan.hienThiThongTin();
        System.out.println();
        kySu.hienThiThongTin();
        System.out.println();
        nhanVien.hienThiThongTin();
    }
}
