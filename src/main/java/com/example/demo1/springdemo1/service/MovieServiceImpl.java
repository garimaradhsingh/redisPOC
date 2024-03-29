package com.example.demo1.springdemo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.springdemo1.dao.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public void setMovie(String id, String movie) {
		movieRepository.setMovie(id, movie);
	}
	
	@Override
	public String getMovie(String id) {
		return movieRepository.getMovie(id);
	}

}
