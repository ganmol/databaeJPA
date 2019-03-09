package com.ag.databaseJPA;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ag.databaseJPA.jpa.PersonJpaRepository;

@SpringBootApplication
public class DatabaseJpaApplication implements CommandLineRunner{

	Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info(" fetching person by id ",repository.findById(10001));
		
	}
	
	
	
	
}
