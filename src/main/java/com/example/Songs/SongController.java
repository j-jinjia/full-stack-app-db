package com.example.Songs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;


@RestController
@CrossOrigin(origins = "*")
public class SongController {
    @Autowired
    SongRepository repository;
    @GetMapping("/api/songs")
    public ResponseEntity<List<Song>> getSongs(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
    @GetMapping("/song/{id}")
    public ResponseEntity<Song> getSongById(@PathVariable String id) {
        for (Song song : repository.findAll()) {
            if (song.getId() == parseInt(id)) {
                return ResponseEntity.status(HttpStatus.OK).body(song);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); //return 404 if the greeting wasn't found
    }
    @PostMapping("/song/add")
    public ResponseEntity<Song> createSong(@RequestBody Song song){
        repository.save(song);
        return ResponseEntity.status(HttpStatus.CREATED).body(song);
    }
    @DeleteMapping("/song/delete/{id}")
    public ResponseEntity<String> deleteSong(@PathVariable String id) {
        try {
            repository.deleteById(parseInt(id));
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Song with id of: " + id + " was deleted");
        } catch (EmptyResultDataAccessException exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Song with the id of :" + id + "doesn't exist, can't delete!");
        }
    }
}
