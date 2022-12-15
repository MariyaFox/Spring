package com.geekbrains.project.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class JwtRequest {
    private String username;
    private String password;
}

