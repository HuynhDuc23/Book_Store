package vn.bookstore.bookstore.entity;

import lombok.Data;

import java.util.List;

@Data
public class HinhThucThanhToan {
    private int maHinhThucThanhToan ;
    private String tenHinhThucThanhToan ;
    private String moTa ;
    private double chiPhiThanhToan ;
    private List<DonHang> danhSachDonHang ;
}
