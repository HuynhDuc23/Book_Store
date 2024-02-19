package vn.bookstore.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh ;
    @Column(name = "ten_hinh_anh",length = 256)
    private String tenHinhAnh ;
    @Column(name = "la_icon")
    private boolean laIcon ;
    @Column(name = "duong_dan")
    private String duongDan ;
    @Column(name = "du_lieu_anh")
    @Lob
    private String duLieuAnh ;

    @ManyToOne(
            fetch = FetchType.LAZY , cascade =  {
                    CascadeType.DETACH,
            CascadeType.MERGE ,
            CascadeType.PERSIST ,
            CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "ma_sach", nullable = false
            // Bắt buộc ảnh này thuộc về một quyển sách nào đó ,không được null
    )
    private Sach sach ;
}
