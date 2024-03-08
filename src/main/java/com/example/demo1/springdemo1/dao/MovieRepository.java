package com.example.demo1.springdemo1.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository {

	
	void setMovie(String id, String movie);
	String getMovie(String id);
}
