package com.hibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.hibernate.dao.PersonDao;
import com.hibernate.model.Person;
 
public class SpringHibernateMain {
 
    public static void main(String[] args) {
 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         
        PersonDao personDAO = context.getBean(PersonDao.class);
         
        Person person = new Person();
        person.setName("Naveen");
        person.setCountry("USA");
         
        personDAO.save(person);
         
        System.out.println("Person::"+person);
         
        List<Person> list = personDAO.list();
       
        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();    
    }
}