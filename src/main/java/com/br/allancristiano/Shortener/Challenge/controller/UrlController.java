package com.br.allancristiano.Shortener.Challenge.controller;

import org.springframework.web.bind.annotation.RestController;

import com.br.allancristiano.Shortener.Challenge.dto.ShortenUrlRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UrlController {

    @PostMapping(value = "shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest urlRequest) {
        
        return ResponseEntity.ok().build();
        
    }
    
    
}
