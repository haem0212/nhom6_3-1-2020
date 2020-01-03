package com.nhanvien.nhanvien;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface NhanVienDAO extends JpaRepository<NhanVien, Integer> {

}