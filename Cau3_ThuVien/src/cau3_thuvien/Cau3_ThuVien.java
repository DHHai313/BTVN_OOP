/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau3_thuvien;

/**
 *
 * @author USER
 */
public class Cau3_ThuVien {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Sach sach = new Sach("NXB Kim Dong", 10000, "T002", "Nguyen Nhat Anh", 20);
        TapChi tapChi = new TapChi(2, 4, "T01", "NXB Hello", 2);
        Bao bao = new Bao("B001", "NXB Tre", 2000, "2024-11-10");

        sach.hienThiThongTin();
        System.out.println();
        tapChi.hienThiThongTin();
        System.out.println();
        bao.hienThiThongTin();
    }
    
}
