package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class StudentResultApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentResultApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "chenna";
		String encodepassword = encoder.encode(rawPassword);
		System.out.println(encodepassword);
	}

}
