package com.docker.restapp.dockerrestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping
	public String greetController() {
		return "Hello World!!";
	}
}
