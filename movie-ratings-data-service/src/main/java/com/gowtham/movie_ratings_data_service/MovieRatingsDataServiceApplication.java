package com.gowtham.movie_ratings_data_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRatingsDataServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieRatingsDataServiceApplication.class, args);
		System.out.println("This IS WORKING");
	}

}
