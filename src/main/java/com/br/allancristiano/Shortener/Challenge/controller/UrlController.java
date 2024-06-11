package com.br.allancristiano.Shortener.Challenge.controller;

import org.springframework.web.bind.annotation.RestController;

import com.br.allancristiano.Shortener.Challenge.dto.ShortenUrlRequest;
import com.br.allancristiano.Shortener.Challenge.dto.ShortenUrlResponse;
import com.br.allancristiano.Shortener.Challenge.entity.Url;
import com.br.allancristiano.Shortener.Challenge.repository.UrlRepository;

import jakarta.servlet.http.HttpServletRequest;

import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UrlController {

    private final UrlRepository urlRepository;    

    public UrlController(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }


    @PostMapping(value = "shorten-url")
    public ResponseEntity<ShortenUrlResponse> shortenUrl(@RequestBody ShortenUrlRequest urlRequest, HttpServletRequest servletRequest) {
        String id;

        do{
            id = RandomStringUtils.randomAlphanumeric(5, 10);
        }while(urlRepository.existsById(id));

        urlRepository.save(new Url(id, urlRequest.url(), LocalDateTime.now().plusMinutes(1)));

        var redirectUrl = servletRequest.getRequestURL().toString().replace("shorten-url", id);

        return ResponseEntity.ok(new ShortenUrlResponse(redirectUrl));
        
    }
    
    
}
