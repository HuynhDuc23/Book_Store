package vn.bookstore.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.bookstore.bookstore.entity.TheLoai;

@RepositoryRestResource(path = "the-loai")
// cung cấp một số endpoint cơ bản , get put path delete khi dùng spring data rest
public interface TheLoaiRepository extends JpaRepository<TheLoai,Integer> {

}
