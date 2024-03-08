package com.example.demo1.springdemo1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class MovieRepositoryImpl implements MovieRepository {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Override
	public void setMovie(String id, String movie) {
		redisTemplate.opsForValue().set(id, movie);

	}

	@Override
	public String getMovie(String id) {
		return (String) redisTemplate.opsForValue().get(id);
	}

}
