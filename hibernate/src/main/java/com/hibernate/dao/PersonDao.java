package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Person;

public interface PersonDao {
 
    public void save(Person p);
    public List<Person> list();
    public List<Person> findPerson(Person person);
     
}