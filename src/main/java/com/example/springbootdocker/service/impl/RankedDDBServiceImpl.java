package com.example.springbootdocker.service.impl;

import com.example.springbootdocker.dto.RankedDDBTableDto;
import com.example.springbootdocker.model.RankedDDBTable;
import com.example.springbootdocker.repository.RankedRepository;
import com.example.springbootdocker.service.RankedDDBService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RankedDDBServiceImpl implements RankedDDBService {

    private RankedRepository rankedRepository;

    @Override
    public void addRaked(RankedDDBTableDto rankedDDBTableDto) {
        RankedDDBTable rankedDDBTable = new RankedDDBTable();
        rankedDDBTable.setEmail(rankedDDBTableDto.getEmail());
        rankedDDBTable.setNickName(rankedDDBTableDto.getNickName());
        rankedDDBTable.setLogoOriginFileName(rankedDDBTableDto.getLogoOriginFileName());
        rankedRepository.save(rankedDDBTable);
    }

    @Override
    public List<RankedDDBTable> viewAllRating() {;
        return rankedRepository.findAll();
    }
}
