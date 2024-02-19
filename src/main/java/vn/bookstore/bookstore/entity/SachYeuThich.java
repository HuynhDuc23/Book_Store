package vn.bookstore.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="sach_yeu_thich")
public class SachYeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach_yeu_thich", length = 256)
    private int maSachYeuThich ;


    @ManyToOne(
            fetch = FetchType.LAZY ,
            cascade = {
                    CascadeType.PERSIST ,
                    CascadeType.MERGE,
                    CascadeType.REFRESH ,
                    CascadeType.DETACH
            }
    )
    @JoinColumn(name = "ma_nguoi_dung",nullable = false)
    private NguoiDung nguoiDung ;

    @ManyToOne(
            fetch = FetchType.LAZY , cascade = {
                    CascadeType.PERSIST ,
                    CascadeType.DETACH ,
                    CascadeType.MERGE ,
                    CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "ma_sach")
    private Sach sach ;
}
