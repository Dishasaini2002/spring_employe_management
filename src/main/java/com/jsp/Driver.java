package com.jsp;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		 Students s1 = new Students();
		 
			s1.setId(1);
			s1.setName("Disha");
			s1.setAge(23);
			
			Subjects sub1 = new Subjects();
			sub1.setSuid(101);
			sub1.setSubname("Java");
			sub1.setSubdays(90);
			
			
			Subjects sub2 = new Subjects();
			sub2.setSuid(102);
			sub2.setSubname("Sql");
			sub2.setSubdays(30);
			
			
			
			List<Subjects> subjects = new ArrayList<Subjects>();
			subjects.add(sub1);
			subjects.add(sub2);
			
			List<Students> students = new ArrayList<Students>();
			students.add(s1);
			
			s1.setSubjects(subjects);
			sub1.setStudents(students);
			
			sub2.setStudents(students);
			
			et.begin();
			em.persist(s1);
			em.persist(sub1);
			em.persist(sub2);
			
			
			et.commit();
			
			
			
			

	}

}
