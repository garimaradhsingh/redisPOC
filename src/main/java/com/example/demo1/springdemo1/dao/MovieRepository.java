package com.example.demo1.springdemo1.dao;

public interface MovieRepository {

	
	void setMovie(String id, String movie);
	String getMovie(String id);
}
