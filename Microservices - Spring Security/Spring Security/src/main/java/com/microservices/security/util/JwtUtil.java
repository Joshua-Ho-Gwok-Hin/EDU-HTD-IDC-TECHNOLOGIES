package com.microservices.security.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtUtil {

    private final String SECRET_KEY = "Secret Key";

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts.builder().setClaims(claims).setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*10)) //10 hours
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
    }

//    public String generateToken(String username) {
//        Map<String, Object> claims = new HashMap<>();
//        return createToken(claims, username);
//    }
//
//    public String createToken(Map<String, Object> claims, String subject) {
//        return Jwts.builder().setClaims(claims).setSubject(subject)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*10)) //10 hours
//                .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
//    }

    public boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
//        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
        return username.equals(userDetails.getUsername());
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

//    private boolean isTokenExpired(String token) {
//        return extractExpiration(token).before(new Date());
//    }


}
