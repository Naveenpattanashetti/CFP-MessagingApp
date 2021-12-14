package com.example.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/hello")
	public String getMessage() {
		String msg = "Hello from bridgelabz";
		return msg;

	}
	
	@GetMapping("/hello/query")
	public String getMessageusingParam(@RequestParam String name) {
		String msg = "Hello "+name;
		return msg;

	}
	
	@GetMapping("/hello/param/{name}")
	public String getMessageUsingPathVariable(@PathVariable String name) {
		String msg = "Hello  "+name;
		return msg;

	}

	@PostMapping("/hello/post")
	public String postName(@RequestBody UserDto userDto) {
		String msg = "Hello  "+userDto.getFirstname()  +" "+  userDto.getLastname();
		return msg;

	}
	@PutMapping("/hello/put/{firstname}")
	public String update(@PathVariable String firstname,@RequestParam String lastname) {
		String msg = "Hello  "+firstname  +" "+ lastname;
		return msg;

	}
}
