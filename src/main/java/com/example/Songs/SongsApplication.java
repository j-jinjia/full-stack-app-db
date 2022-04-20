package com.example.Songs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class SongsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongsApplication.class, args);
	}

}
