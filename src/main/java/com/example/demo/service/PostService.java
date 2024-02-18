package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> result = new ArrayList<Post>();
        result.add(new Post("Шёл медведь в лес", new Date(), 0));
        result.add(new Post("Видит машина горит", new Date(), 0));
        result.add(new Post("сел внутрь и сгорел", new Date(), 0));
        return result;
    }
}
