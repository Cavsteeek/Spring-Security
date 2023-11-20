package com.cavsteek.security.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtService {
    private static final String SECRET_KEY = "404E635266556A5E3272358782F4428472B4B6250645367566B5970";
    public String extractUsername(String jwt) {
        return null;
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();

    }
}
