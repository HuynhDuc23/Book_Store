package vn.bookstore.bookstore.entity;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class DonHang {
    private int maDonHang ;
    private Date ngayTaoj ;
    private String diaChiMuaHang ;
    private String diaChiNhanHang ;
    private double tongTien ;
    private String trangThaiThanhToan ;
    private String trangThaiGiaoHang ;

    private NguoiDung nguoiDung;
    private List<ChiTietDonHang> danhSachChiTietDonHang ;
    private HinhThucThanhToan hinhThucThanhToan ;
    private HinhThucGiaoHang hinhThucGiaoHang ;



}
