package vn.bookstore.bookstore.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "su_danh_gia")
public class SuDanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia", length = 256)
    private int maDanhGia ;
    @Column(name = "hang")
    private int hang ;
    @Column(name = "nhan_xet")
    private String nhanXet ;


    @ManyToOne(
            fetch = FetchType.LAZY ,
            cascade = {
                    CascadeType.PERSIST ,
                    CascadeType.REFRESH ,
                    CascadeType.MERGE ,
                    CascadeType.DETACH
            }
    )
    @JoinColumn(name = "ma_nguoi_dung",nullable = false)
    private NguoiDung nguoiDung ;


    @ManyToOne(
            fetch = FetchType.LAZY , cascade = {
                    CascadeType.PERSIST ,
                    CascadeType.REFRESH ,
                    CascadeType.MERGE,
                    CascadeType.DETACH
    }
    )
    @JoinColumn(name = "ma_sach" , nullable = false)
    // đánh giá này bắt buộc phải thuộc một sách nào đó không cho phép được null
    private Sach sach ;
}
