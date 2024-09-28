package com.api.payload;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class RegistrationDto {


    private String name;
    private String email;
    private String mobile;

}