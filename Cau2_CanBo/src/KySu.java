/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Ngành Đào Tạo:"+nganhDaoTao);
    }
}
