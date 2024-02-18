package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    public String getText(){
        return text;
    }
    private Integer likes = 0;
    public Integer getLikes(){
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    private Date creationDate;
    public Date getCreationDate() {
        return creationDate;
    }

    private Long id;
    public Long getId() {
        return id;
    }

    public Post(String postText, Date date,Integer likes){
        text = postText;
        this.likes = likes;
        creationDate = date;
    }
    public Post(Long id, String text, Date date)
    {
        this.id = id;
        this.text = text;
        creationDate = date;
    }
}