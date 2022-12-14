package com.example.springbootdocker.controller;

import com.example.springbootdocker.dto.RankedDDBTableDto;
import com.example.springbootdocker.model.RankedDDBTable;
import com.example.springbootdocker.repository.RankedRepository;
import com.example.springbootdocker.service.impl.RankedDDBServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api", produces = "application/json" )
public class MainController {

    @Autowired
    private RankedDDBServiceImpl rankedDDBService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/test")
    String one() {
        return "success";
    }

    @GetMapping("/InitResetPassword/{emailId}")
    public void getEmail(@PathVariable("emailId") String emailId){

        System.out.println(emailId);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @PostMapping("/SignUp")
    public void addRanked(@RequestBody RankedDDBTableDto rankedDDBTableDto) {
        RankedDDBTable rankedDDBTable = new RankedDDBTable();
        rankedDDBTable.setEmail(rankedDDBTableDto.getEmail());
        rankedDDBTable.setNickName(rankedDDBTableDto.getNickName());
        rankedDDBTable.setLogoOriginFileName(rankedDDBTableDto.getLogoOriginFileName());
        rankedDDBService.addRaked(rankedDDBTableDto);
    }

    @PostMapping("/SignIn")
    public void signIn(){
        System.out.println("check endpoint");
    }

    @PostMapping("/RefreshToken")
    public ResponseEntity<?> refreshtoken(HttpServletRequest request){
        System.out.println("test");
        Enumeration enumeration = request.getParameterNames();
        Map<String, Object> modelMap = new HashMap<>();
        while(enumeration.hasMoreElements()){
            String parameterName = enumeration.nextElement().toString();
            System.out.println(parameterName + "=" + request.getParameter(parameterName));
        }
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @RequestMapping("/viewall")
    public @ResponseBody List<RankedDDBTable> view(){
        List<RankedDDBTable> rankedDDBTables = rankedDDBService.viewAllRating();
        return rankedDDBTables;
    }
}
