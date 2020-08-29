package com.work.start.spring.springrestapi.dao;

import com.work.start.spring.springrestapi.entity.Person;

public class PersonDaoImpl implements PersonDao{

	@Override
	public Person getPerson() {
		return Person.builder().firstName("Keerrttana").id(123).build();
	}

}
