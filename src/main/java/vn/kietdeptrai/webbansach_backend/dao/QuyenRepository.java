package vn.kietdeptrai.webbansach_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.kietdeptrai.webbansach_backend.entity.ChiTietDonHang;
import vn.kietdeptrai.webbansach_backend.entity.Quyen;

@Repository
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
}
