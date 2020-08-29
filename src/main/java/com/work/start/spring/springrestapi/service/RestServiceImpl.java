package com.work.start.spring.springrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.work.start.spring.springrestapi.dao.PersonDao;
import com.work.start.spring.springrestapi.entity.Person;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RestServiceImpl implements RestService{

	@Autowired
	public PersonDao personDao;
	
	@Override
	public Person getPersons() {
		return personDao.getPerson();
	}

}
