package com.bangez.user.domain.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}