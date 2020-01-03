package com.Music.Music;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface MusicDAO extends JpaRepository<Music, Integer> {

}

