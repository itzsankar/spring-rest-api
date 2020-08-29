package com.work.start.spring.springrestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.work.start.spring.springrestapi.dao.PersonDao;
import com.work.start.spring.springrestapi.service.RestService;
import com.work.start.spring.springrestapi.service.RestServiceImpl;

@Configuration
@Import(DaoConfig.class)
public class RestApiConfig {

	@Bean
	public RestService restService(PersonDao personDao) {
		return new RestServiceImpl(personDao);
	}
}
