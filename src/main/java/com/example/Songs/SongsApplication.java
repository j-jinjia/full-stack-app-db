package com.example.Songs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin

@SpringBootApplication

public class SongsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongsApplication.class, args);
	}

}
//	{
//			"song": "Beat it",
//			"genre": "Pop",
//			"artist": "Micheal Jackson",
//			"album": "Thriller",
//			"name": "Jiazheng",
//			"ytURL": "https://www.youtube.com/watch?v=oRdxUFDoQe0&ab_channel=michaeljacksonVEVO",
//			"imageURL": "https://images.genius.com/6b51f8b0e93e4c54cd16e3e8412d1d3b.1000x1000x1.png"
//
//	}
