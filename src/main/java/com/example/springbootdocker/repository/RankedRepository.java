package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.RankedDDBTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankedRepository extends JpaRepository<RankedDDBTable, Long> {
}
