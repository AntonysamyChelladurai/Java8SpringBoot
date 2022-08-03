package com.rest.webapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rest.webapp")
public class Java8App implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Java8App.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}
}
