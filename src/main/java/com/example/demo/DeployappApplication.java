package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployappApplication {
@GetMapping("/")
public String getMessage()
{
	return "Hello Guys!! How are you?How well you are doing";
}
@PostMapping("/{name}")
public String getMessage(@RequestBody String name)
{
	return "I am "+name;
}
	public static void main(String[] args) {
		SpringApplication.run(DeployappApplication.class, args);
	}

}
