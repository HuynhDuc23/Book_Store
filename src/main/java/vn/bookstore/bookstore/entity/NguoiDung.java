package vn.bookstore.bookstore.entity;

import lombok.Data;

import java.util.List;

@Data
public class NguoiDung {
    private int maNguoiDung ;
    private String hoDem ;
    private String ten ;
    private String tenDangNhap ;
    private String matKhau ;
    private char gioiTinh ;
    private String soDienThoai ;
    private String diaChiMuaHang ;
    private String diaChiGiaoHang ;
    private List<Quyen> danhSachQuyen ;
    private List<DonHang> danhSachDonHang ;
    private List<SachYeuThich> danhSachYeuThich ;
    private List<SuDanhGia> danhSachSuDanhGia ;

}
