package com.microservices.security;

import com.microservices.security.entity.User;
import com.microservices.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SpringSecurityApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@PostConstruct
	public void initUser() {
		userRepository.save(new User(101, "James","Bond"));
	}
}
