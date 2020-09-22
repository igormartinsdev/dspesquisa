package com.im.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.im.dspesquisa.domain.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
