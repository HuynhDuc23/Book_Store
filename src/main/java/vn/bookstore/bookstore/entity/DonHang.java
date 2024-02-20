package vn.bookstore.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name = "don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_don_hang")
    private int maDonHang ;

    @Column(name = "ngay_tao")
    private Date ngayTao ;
    @Column(name = "dia_chi_mua_hang",length = 512)
    private String diaChiMuaHang ;
    @Column(name = "dia_chi_nhan_hang",length = 512)
    private String diaChiNhanHang ;
    @Column(name = "tong_tien_san_pham")
    private double tongTienSanPham ;
    @Column(name = "tong_tien")
    private double tongTien ;
    @Column(name = "chi_phi_giao_hang")
    private String chiPhiGiaoHang;
    @Column(name = "chi_phi_thanh_toan")
    private String chiPhiThanhToan ;
    @ManyToOne(
            fetch = FetchType.LAZY ,
            cascade =  {
                    CascadeType.PERSIST,
                    CascadeType.DETACH,
                    CascadeType.REFRESH,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "ma_nguoi_dung",nullable = false)
    // đơn hàng có được null hay không , không được null
    private NguoiDung nguoiDung;

    @OneToMany(mappedBy = "donHang",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
        private List<ChiTietDonHang> danhSachChiTietDonHang ;

    @ManyToOne(
            fetch = FetchType.LAZY, cascade = {
                  CascadeType.PERSIST,
                  CascadeType.REFRESH,
                  CascadeType.DETACH,
                   CascadeType.MERGE
    }
    )
    @JoinColumn(name="ma_hinh_thuc_thanh_toan",nullable = true)
    private HinhThucThanhToan hinhThucThanhToan ;


    @ManyToOne(
            fetch = FetchType.LAZY ,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.REFRESH,
                    CascadeType.DETACH,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(name = "ma_hinh_thuc_giao_hang",nullable = true)
    private HinhThucGiaoHang hinhThucGiaoHang ;



}
