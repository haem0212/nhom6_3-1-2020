package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface VeXemPhimDAO extends JpaRepository<VeXemPhim, Integer> {

}