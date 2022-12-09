package com.example.springbootdocker.controller;

import com.example.springbootdocker.dto.RankedDDBTableDto;
import com.example.springbootdocker.model.RankedDDBTable;
import com.example.springbootdocker.service.impl.RankedDDBServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    //RankedDDBServiceImpl rankedDDBService;
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

/*    @PostMapping("/add")
    public void addRanked(@RequestBody RankedDDBTableDto rankedDDBTableDto) {
        rankedDDBService.addRaked(rankedDDBTableDto);
    }

    @RequestMapping("/viewall")
    public @ResponseBody List<RankedDDBTable> view(){
        List<RankedDDBTable> rankedDDBTables = rankedDDBService.viewAllRating();
        return rankedDDBTables;
    }*/
}
