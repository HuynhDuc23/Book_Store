package vn.bookstore.bookstore.entity;

import lombok.Data;

import java.util.List;
@Data
public class TheLoai {
    private int maTheLoai ;
    private String tenTheLoai ;
    List<Sach> danhSachQuyenSach ;
}
