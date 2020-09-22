package com.im.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.im.dspesquisa.domain.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
