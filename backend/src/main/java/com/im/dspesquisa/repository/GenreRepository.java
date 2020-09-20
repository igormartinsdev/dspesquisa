package com.im.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.dspesquisa.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
