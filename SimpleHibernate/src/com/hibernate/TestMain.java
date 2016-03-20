package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class TestMain {
 
    public static void main(String[] args) {
 
    	
    	StudentService service = new StudentService();
    	
        Student student = new Student();
        student.setName("Kumar");
        student.setRoll("106");
        student.setPhone("123567891");
        student.setDegree("B.E");
 
       // service.addStudent(student);
        
        student.setPhone("9848098480");
        
        //service.updateUser(student);
        
       // service.deleteUser(5);
        
        //student.setDegree("MCA");
        //service.updateUser(student);
       List<Student> stud = service.getAllStudents();
       for(Student stu:stud){
       	  System.out.println("***********"+stu);
       }
        
//        service.deleteUser(2);
    }
}
