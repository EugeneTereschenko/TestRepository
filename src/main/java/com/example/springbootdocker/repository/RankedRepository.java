package com.example.springbootdocker.repository;

import com.example.springbootdocker.model.RankedDDBTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankedRepository extends CrudRepository<RankedDDBTable, Long> {
}
