package com.example.demo1.springdemo1.service;

import org.springframework.stereotype.Service;

@Service("MovieService")
public interface MovieService {
	
	void setMovie(String id, String movie);
	
	String getMovie(String id);

}
