package com.example.demo1.springdemo1.entity;

import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable{
	
	private int id;
	private String movieName;
	private String result;
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, movieName, result);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return id == other.id && Objects.equals(movieName, other.movieName) && Objects.equals(result, other.result);
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
