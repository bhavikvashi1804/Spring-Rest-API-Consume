package com.bhavik.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.bhavik.restapi.model.Person;
import com.bhavik.restapi.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService service;

	@GetMapping("/register")
	public String showRegistrationPage(@ModelAttribute("person") Person person) {
		return "registerPerson";
	}

	@GetMapping("/register/{id}")
	public String showRegPage(@PathVariable int id, @ModelAttribute("person") Person p, ModelMap map) {

		Person p1 = service.getPerson(id);
		System.out.println(p1.getName() +":"+ p1.getAge());
		map.put("myObj", p1);
		return "registerPerson";
	}
}
