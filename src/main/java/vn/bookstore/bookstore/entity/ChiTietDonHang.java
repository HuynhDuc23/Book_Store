package vn.bookstore.bookstore.entity;

import lombok.Data;

import java.util.List;
@Data
public class ChiTietDonHang {
    private int maChiTietDonHang ;
    private int soLuong ;
    private double giaBan ;

    private Sach sach ;
    private List<DonHang> donHang ;
}
