package com.example.JWT.Utility;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;

public class JwtUtil {
    private static final Key SECRET;

    public static String generateToken(String username) {
        return Jwts.builder().setSubject(username).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() + 300000L)).signWith(SignatureAlgorithm.HS256, SECRET).compact();
    }

    public static String validateToken(String token) {
        return ((Claims)Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody()).getSubject();
    }

    static {
        SECRET = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }
}