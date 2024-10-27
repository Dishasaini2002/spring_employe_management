package com.jsp;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_1 {

public static void main(String[] args) {
		
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		 Students s2 = new Students();
		 
		 s2.setId(2);
		 s2.setName("Lui");
		 s2.setAge(34);
		 
        Students s3 = new Students();
		 
		 s3.setId(3);
		 s3.setName("Arpan");
		 s3.setAge(4);
		 
		 
 Students s4 = new Students();
		 
		 s4.setId(4);
		 s4.setName("Kajal");
		 s4.setAge(34);
		 
		 
		 
		 Subjects sub3 = new Subjects ();
		 sub3.setSuid(103);
		 sub3.setSubname("web");
		 sub3.setSubdays(50);
		 
		 
		 
		 List<Subjects> subjects = new ArrayList<Subjects>();
			subjects.add(sub3);
			
			
			List<Students> students = new ArrayList<Students>();
			students.add(s2);
			students.add(s3);
			students.add(s4);
			
			s2.setSubjects(subjects);
			s3.setSubjects(subjects);
			s4.setSubjects(subjects);
			sub3.setStudents(students);
			
			sub3.setStudents(students);
			
			et.begin();
			em.persist(s2);
			em.persist(sub3);
			em.persist(s3);
			em.persist(s4);
			
			
			et.commit();
		 
		 

	}

}
