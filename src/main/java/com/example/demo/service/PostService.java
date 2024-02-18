package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<Post>()
    {{
        add(new Post(0L, "Шёл медведь в лес", new Date()));
        add(new Post(1L, "Видит машина горит", new Date()));
        add(new Post(2L, "сел внутрь и сгорел", new Date()));
    }};

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        this.posts.add(new Post((long)posts.size(), text, new Date()));
    }
}