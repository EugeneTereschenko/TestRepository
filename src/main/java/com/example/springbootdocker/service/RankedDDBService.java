package com.example.springbootdocker.service;

import com.example.springbootdocker.dto.RankedDDBTableDto;
import com.example.springbootdocker.model.RankedDDBTable;

import java.util.List;

public interface RankedDDBService {

    void addRaked(RankedDDBTableDto rankedDDBTableDto);

    List<RankedDDBTable> viewAllRating();
}
