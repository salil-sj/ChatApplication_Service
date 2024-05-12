package com.org.ChatService.ChatService.model;

import lombok.Data;

@Data
public class AuthResponse {
    private String jwtToken;


    public AuthResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
