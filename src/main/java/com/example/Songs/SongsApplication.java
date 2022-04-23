package com.example.Songs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@CrossOrigin

@SpringBootApplication

public class SongsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongsApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/songs").allowedOrigins("http://localhost:8080");
			}
		};
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
