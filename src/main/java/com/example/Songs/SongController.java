package com.example.Songs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongRepository repository;

    @GetMapping("/api/songs")
    public ResponseEntity<List<Song>> getSongs(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
}
