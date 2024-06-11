package com.br.allancristiano.Shortener.Challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.allancristiano.Shortener.Challenge.entity.Url;

public interface UrlRepository extends MongoRepository<Url, String>{
    
}
