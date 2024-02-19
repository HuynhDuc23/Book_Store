package vn.bookstore.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="sach")
public class Sach {
    @Id
    @Column(name = "ma_sach",length = 256)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSach ;
    @Column(name = "ten_sach",length = 256)
    private String tenSach ;

    @Column(name = "ten_tac_gia",length = 256)
    private String tenTacGia ;
    @Column(name = "isbn",length = 256)
    private String ISBN ;
    @Column(name = "mo_ta", columnDefinition = "text")
    private String moTa ;
    @Column(name = "gia_niem_yet")
    private double giaNiemYet ;
    @Column(name = "gia_ban")
    private double giaBan ;
    @Column(name = "so_luong")
    private int soLuong ;
    @Column(name="trung_binh_xep_hang")
    private double trungBinhXepHang ;

    @ManyToMany(
            fetch = FetchType.LAZY ,cascade = {
                    CascadeType.PERSIST , CascadeType.DETACH , CascadeType.MERGE , CascadeType.REFRESH }
    )
    @JoinTable(
            name = "sach_theloai",
            joinColumns = @JoinColumn(name = "ma_sach"),
            inverseJoinColumns = @JoinColumn(name = "ma_the_loai")
    )
    private List<TheLoai> danhSachTheLoai ;

    @OneToMany(
           mappedBy = "sach",fetch = FetchType.LAZY , cascade = CascadeType.ALL
    )
    private List<HinhAnh> danhSachHinhAnh ;

    @OneToMany(mappedBy = "sach" , fetch = FetchType.LAZY , cascade = {
            CascadeType.PERSIST , CascadeType.DETACH , CascadeType.MERGE , CascadeType.REFRESH
    })
    private List<SuDanhGia> danhSachDanhGia ;

    @OneToMany(mappedBy = "sach" , fetch = FetchType.LAZY , cascade ={
                 CascadeType.PERSIST ,
                  CascadeType.DETACH ,
                  CascadeType.MERGE ,
                  CascadeType.DETACH
            })
    private List<SachYeuThich> danhSachYeuThich ;

    @OneToMany(mappedBy = "sach",
             fetch = FetchType.LAZY,
             cascade = {
                  CascadeType.PERSIST,
                   CascadeType.MERGE,
                   CascadeType.DETACH,
                   CascadeType.REFRESH
             }
    )
    private List<ChiTietDonHang> danhSachChiTietDonhang ;
}
