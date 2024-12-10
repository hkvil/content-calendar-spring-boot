package com.example.content_calendar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.content_calendar.repository.ContentCollectionRepository;
import com.example.content_calendar.model.Content;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;
    
    public ContentController(ContentCollectionRepository repository){
        this.repository = repository;
    }


    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }


}
