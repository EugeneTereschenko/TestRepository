package com.example.springbootdocker.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "RankedDDBTable")
public class RankedDDBTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nickName")
    String nickName;
    @Column(name = "email")
    String email;
    @Column(name = "LogoOriginFileName")
    String LogoOriginFileName;
    @Column(name = "accessTime")
    String accessTime;
    @Column(name = "rank")
    String rank;
}
