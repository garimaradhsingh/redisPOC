package com.example.demo1.springdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.springdemo1.entity.Movie;
import com.example.demo1.springdemo1.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping("/movie")
	public void setMovie(@RequestBody Movie movie) throws JsonProcessingException{
		final ObjectMapper objectMapper = new ObjectMapper();
		movieService.setMovie(String.valueOf(movie.getId()), objectMapper.writeValueAsString(movie));
	}

	@GetMapping("/movie/{id}")
	public String getMovie(@PathVariable("id") String id) {
		return movieService.getMovie(id);
	}

}
