package com.im.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.dspesquisa.domain.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
