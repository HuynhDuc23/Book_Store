package vn.bookstore.bookstore.entity;

import lombok.Data;

@Data
public class SuDanhGia {
    private int maDanhGia ;
    private int hang ;
    private String nhanXet ;

    private NguoiDung nguoiDung ;
    private Sach sach ;
}
