package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	// simple-test
	@RequestMapping(value = "/user")
	public String helloUser() {
		return "user";
	}
}
