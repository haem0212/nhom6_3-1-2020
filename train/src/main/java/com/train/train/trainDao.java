package com.train.train;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface trainDao extends JpaRepository<train, Integer> {

}