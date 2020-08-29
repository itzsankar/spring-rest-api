package com.work.start.spring.springrestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.work.start.spring.springrestapi.dao.PersonDao;
import com.work.start.spring.springrestapi.dao.PersonDaoImpl;

@Configuration
public class DaoConfig {

	@Bean
	public PersonDao personDao() {
		return new PersonDaoImpl();
	}
}
