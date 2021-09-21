package io.explore.spring.boot.starterapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class starterApiController {

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to Spring Boot project";
	}
}
