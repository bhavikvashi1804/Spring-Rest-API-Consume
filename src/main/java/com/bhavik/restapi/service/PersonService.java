package com.bhavik.restapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhavik.restapi.model.Person;

@Service
public class PersonService {

	public Person getPerson(int id) {
		RestTemplate template = new RestTemplate();
		Person p = template.getForObject("http://localhost:8080/jtPersonApi/" + id, Person.class);
		return p;
	}

}
