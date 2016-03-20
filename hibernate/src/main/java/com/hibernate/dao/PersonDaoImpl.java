package com.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.Person;
 
public class PersonDaoImpl implements PersonDao {
 
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    public void save(Person p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    public List<Person> list() {
        Session session = this.sessionFactory.openSession();
        List<Person> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }
    
    @SuppressWarnings("unchecked")
    public List<Person> findPerson(Person person) {
        Session session = this.sessionFactory.openSession();
        List<Person>  personList = session.createCriteria(Person.class).add(Restrictions.eq("name", person.getName())).list();
        session.close();
        return personList;
    }
    
}