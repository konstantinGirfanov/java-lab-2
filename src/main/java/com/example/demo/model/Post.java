package com.example.demo.model;

public class Post {
    private String text;
    public String getText(){
        return text;
    }
    private Integer likes;
    public Integer getLikes(){
        return likes;
    }
    public Post(String postText, Integer likes){
        text = postText;
        this.likes = likes;
    }
}
