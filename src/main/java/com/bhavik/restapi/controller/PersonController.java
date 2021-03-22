package com.bhavik.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/register")
	public String  showRegistrationPage() {
		return "registerPerson";
	}
}
