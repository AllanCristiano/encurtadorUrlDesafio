package com.br.allancristiano.Shortener.Challenge.entity;


import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "urls")
public class Url {

    @Id
    private String id;

    private String fullUrl;

    @Indexed(expireAfterSeconds = 0)
    private LocalDateTime exDateTime;

    public Url(String id, String fullUrl, LocalDateTime exDateTime) {
        this.id = id;
        this.fullUrl = fullUrl;
        this.exDateTime = exDateTime;
    }

    public Url() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public LocalDateTime getExDateTime() {
        return exDateTime;
    }

    public void setExDateTime(LocalDateTime exDateTime) {
        this.exDateTime = exDateTime;
    }

    

    

    

}
