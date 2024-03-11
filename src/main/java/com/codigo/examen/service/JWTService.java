package com.codigo.examen.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

    public String generateToken(UserDetails userDetails);
    public String extractUserName(String token);
    public boolean vlidateToken(String token, UserDetails userDetails);
}
