package com.vulab.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vulab.domain.Student;
import com.vulab.utils.SimpleDBEntityManagerFactory;

/* **************************************************************************
 * Author: Srinivas Nelakuditi 
 * Company: VU Lab Inc.
 * URL: http://vulab.com
 * Core Competency: IT Training, Management Training & Career Mentoring
 * Blog URL: http://vulab.com/blog
 * forum URL:http://vulab.com/community
 * Date: March 5th 2009
 * 
 * 
 * Please modify the code as you wish and use it in any
 * commercial or free software and distribute it.
 * please keep the above author information intact.
 * 
 *****************************************************************************/
public class StudentDAOImpl implements StudentDAO {

	public static final String domain = "student";

	public Student createStudent(Student student) throws Exception {

		Random randomGenerator = new Random();
		int id = randomGenerator.nextInt(100000);

		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		student.setId(String.valueOf(id));
		em.persist(student);
		em.close();

		return student;
	}

	public void updateStudent(Student student) throws Exception {

		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		em.persist(student);
		em.close();

	}

	public Student getStudentById(int studentId) throws Exception {
		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		Query q = em.createQuery("select o from Student o where o.id= :studentid");
		q.setParameter("studentid", studentId);
		List<Student> obs = q.getResultList();
		Student student = (Student) obs.get(0);
		em.close();
		return student;
	}

	public void deleteStudentById(int studentId) throws Exception {
		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		Query q = em.createQuery("select o from Student o where o.id= :studentid");
		q.setParameter("studentid", studentId);
		List<Student> obs = q.getResultList();
		Student student = (Student) obs.get(0);
		em.remove(student);
		em.close();
	}

	public void deleteStudent(Student student) throws Exception {
		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		em.remove(student);
		em.close();
	}

	public List<Student> getAllStudents() throws Exception {
		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		Query q = em.createQuery("select o from Student o");
		List<Student> obs = q.getResultList();
		em.close();
		return obs;
	}

	public int getTotalCountOfStudents() throws Exception {
		EntityManager em = SimpleDBEntityManagerFactory.getEntityManager();
		Query q = em.createQuery("select o from Student o");
		List<Student> obs = q.getResultList();
		em.close();
		return obs.size();
	}

}