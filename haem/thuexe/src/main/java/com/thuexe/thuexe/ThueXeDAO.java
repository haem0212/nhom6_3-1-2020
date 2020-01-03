package com.thuexe.thuexe;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ThueXeDAO extends JpaRepository<ThueXe, Integer> {

}