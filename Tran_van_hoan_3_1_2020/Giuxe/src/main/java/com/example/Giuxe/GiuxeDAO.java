package com.example.Giuxe;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface GiuxeDAO extends JpaRepository<Giuxe, Integer> {

}