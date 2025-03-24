package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users {

	@GetMapping("/users")
	public String getUsers() {
		return "GET - users";
	}
}