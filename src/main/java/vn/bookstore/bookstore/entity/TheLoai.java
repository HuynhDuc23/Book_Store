package vn.bookstore.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "the_loai")
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_the_loai",length=256)
    private int maTheLoai ;
    @Column(name = "ten_the_loai",length = 256)
    private String tenTheLoai ;

    @ManyToMany(
            fetch = FetchType.LAZY , cascade = {
                    CascadeType.PERSIST , CascadeType.DETACH , CascadeType.MERGE , CascadeType.REFRESH
    }
    )
    @JoinTable(name="sach_theloai",
            joinColumns = @JoinColumn(name="ma_the_loai"),
            inverseJoinColumns = @JoinColumn(name="ma_sach")
    )
    List<Sach> danhSachQuyenSach ;
}
