package com.example.demo1.springdemo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.springdemo1.entity.Movie;
import com.example.demo1.springdemo1.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@CrossOrigin
	@PostMapping(value = "/movie", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> setMovie(@RequestBody Movie movie) throws JsonProcessingException {

		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			movieService.setMovie(String.valueOf(movie.getId()), objectMapper.writeValueAsString(movie));
			return new ResponseEntity<>("ok", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/movie/{id}")
	public ResponseEntity<Object> getMovie(@PathVariable("id") String id) {
		try {
			String movieResult = movieService.getMovie(id);
			return new ResponseEntity<>(movieResult, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
