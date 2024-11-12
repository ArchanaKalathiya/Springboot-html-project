package com.example.spring_html_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringHtmlDemoApplication {
	
	@GetMapping("/greeting")
	public String redirectToNewFile() {
		return "greeting:/index.html";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHtmlDemoApplication.class, args);
	}

}
