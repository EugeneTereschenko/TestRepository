package com.example.springbootdocker.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RankedDDBTableDto {

    String nickName;

    String email;

    String LogoOriginFileName;

    @Override
    public String toString() {
        return "RankedDDBTableDto{" +
                "nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", LogoOriginFileName='" + LogoOriginFileName + '\'' +
                '}';
    }
}
