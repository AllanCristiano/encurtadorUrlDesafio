package com.br.allancristiano.Shortener.Challenge.controller;

import org.springframework.web.bind.annotation.RestController;

import com.br.allancristiano.Shortener.Challenge.dto.ShortenUrlRequest;
import com.br.allancristiano.Shortener.Challenge.dto.ShortenUrlResponse;
import com.br.allancristiano.Shortener.Challenge.entity.Url;
import com.br.allancristiano.Shortener.Challenge.repository.UrlRepository;

import jakarta.servlet.http.HttpServletRequest;

import java.net.URI;
import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



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
        
        // create url link convertion
        Url url = new Url(id, urlRequest.url(), LocalDateTime.now().plusMinutes(1));
        urlRepository.save(url);

        // construtor string return, url base + url acess
        var redirectUrl = servletRequest.getRequestURL().toString().replace("shorten-url", id);

        return ResponseEntity.ok(new ShortenUrlResponse(redirectUrl));
        
    }

    @GetMapping("{id}")
    public ResponseEntity<Void> redirectUrl(@PathVariable("id") String id) {
        var url = urlRepository.findById(id);
        // not found
        if (url.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(url.get().getFullUrl()));

        return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
    }
    
    
    
}
