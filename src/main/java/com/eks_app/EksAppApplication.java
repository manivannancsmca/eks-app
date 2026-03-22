package com.eks_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EksAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EksAppApplication.class, args);
	}

	@GetMapping("/")
	public String entryPage() {
		return "this is a spring boot application with eks";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot application with eks";
	}

}
