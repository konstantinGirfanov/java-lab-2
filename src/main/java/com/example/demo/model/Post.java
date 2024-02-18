package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    public String getText(){
        return text;
    }
    private Integer likes;
    public Integer getLikes(){
        return likes;
    }
    private Date creationDate;
    public Date getCreationDate()
    {
        return creationDate;
    }
    public Post(String postText, Date date,Integer likes){
        text = postText;
        this.likes = likes;
        creationDate = date;
    }
    public Post(String text, Date date)
    {
        this.text = text;
        creationDate = date;
    }
}
