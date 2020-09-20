package com.im.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.im.dspesquisa.domain.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
