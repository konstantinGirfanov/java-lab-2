package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;


@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    public Long getId() {
        return id;
    }

    private String text;
    public String getText() {
        return text;
    }

    private Integer likes = 0;
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    private Date creationDate;
    public Date getcreationDate() {
        return creationDate;
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
    public Post() {
    }
}