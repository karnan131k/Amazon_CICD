package com.amazon.cicd.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DockerEcsApplication {

	@GetMapping
	public String welcome() {
		return "Hi welcome to docker ecs";
	}
	
}
