package com.example.filedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.example.filedemo.model.Orders;

@SpringBootApplication
public class FileDemoApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(FileDemoApplication.class, args);
	}
}
