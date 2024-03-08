package com.example.demo1.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringDemo1AppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1AppApplication.class, args);
	}

}
