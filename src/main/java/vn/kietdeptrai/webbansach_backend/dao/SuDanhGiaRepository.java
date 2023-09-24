package vn.kietdeptrai.webbansach_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.kietdeptrai.webbansach_backend.entity.Sach;
import vn.kietdeptrai.webbansach_backend.entity.SuDanhGia;

@Repository
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia, Long> {
}
