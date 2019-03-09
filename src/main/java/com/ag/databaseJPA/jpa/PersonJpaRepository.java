package com.ag.databaseJPA.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ag.databaseJPA.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	//connect to database
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery=  entityManager.createNamedQuery("find_all_person" , Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
	
	public Person updateOrInsert(Person person){
		return entityManager.merge(person);
	}
}
