package com.work.start.spring.springrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.start.spring.springrestapi.entity.Person;
import com.work.start.spring.springrestapi.service.RestService;

@RestController
@RequestMapping("test/data")
public class PersonController {

	@Autowired
	public RestService restService;

	@RequestMapping(path = "/person", method = RequestMethod.POST)
	@ResponseBody
	public Person person(@RequestBody Person person) {
		System.out.println(person.getFirstName());
		System.out.println(person.getId());
		return person;
	}
	@RequestMapping(path = "/print", method = RequestMethod.GET)
	public Person print(@RequestParam String name) {
		return restService.getPersons();
	}
}