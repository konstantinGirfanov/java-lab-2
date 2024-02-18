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
        add(new Post("Шёл медведь в лес", new Date(), 0));
        add(new Post("Видит машина горит", new Date(), 0));
        add(new Post("сел внутрь и сгорел", new Date(), 0));
    }};

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        this.posts.add(new Post(text, new Date()));
    }
}
