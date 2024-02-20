package vn.bookstore.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.bookstore.bookstore.entity.HinhThucGiaoHang;

@RepositoryRestResource(path = "hinh-thuc-giao-hang")
public interface HinhThucGiaoangRepository extends JpaRepository<HinhThucGiaoHang,Integer> {
}
