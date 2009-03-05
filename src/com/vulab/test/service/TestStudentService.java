package com.vulab.test.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.vulab.domain.Student;
import com.vulab.service.StudentService;
import com.vulab.service.StudentServiceImpl;
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

/* What are we doing in this test case
 * we are creating a student in the domain student
 * we are updating the created students first name and last name
 * we are retrieving the updated object from database again and checking if the first name is updated
 * we are listing all the students in the database
 * we are printing the count of students in the database
 * we are deleting a student from the database
 * we are listing the students in the database after delete
 * we are printing the number of students in the database after delete.
 */
public class TestStudentService extends TestCase
{
	
	public void testCreate() throws Exception
	{
		Student student = new Student();
		student.setAddressLineOne("116 Franklin Lane");
		student.setAddressLineTwo("none");
		student.setCellPhone("5454666");
		student.setCity("Nainza");
		student.setCompany("alpha");
		student.setCountry("beta");
		student.setDateOfBirth("june 6th 4532");
		student.setDepartment("learn");
		student.setEmail("beta@alpha.com");
		student.setFax("2342342");
		student.setFirstName("John");
		student.setHomePhone("2342342342");
		student.setJobTitle("learner");
		student.setLastName("keller");
		student.setPassword("secret");
		student.setSalutation("Mr.");
		student.setState("NJ");
		student.setUserId("user32423");
		student.setWorkPhone("534534534");
		student.setZip("34345");
		
		StudentService studentService = new StudentServiceImpl();
		Student st = studentService.createStudent(student);
		
		System.out.println("Created students first name: "+student.getFirstName());
		System.out.println("Student with the following id is created "+st.getId());
		
		student.setFirstName("karen");
		student.setLastName("parker");
		studentService.updateStudent(student);
		System.out.println("Student is updated");
		
		Student studentFromDB = studentService.getStudentById(Integer.parseInt(st.getId()));
		System.out.println("Student first name is "+studentFromDB.getFirstName());
		
		List<Student> studentList = new ArrayList<Student>();
		studentList = studentService.getAllStudents();
		System.out.println("listing all students");
		for(Student std: studentList)
		{
			System.out.println("*************************");
			System.out.println("Student Id: "+std.getId());
			System.out.println("First Name: "+std.getFirstName());			
		}
		
		System.out.println("Number of students in domain: "+studentService.getTotalCountOfStudents());
		
		System.out.println("Now I am going to delete a student with id "+studentFromDB.getId());
		studentService.deleteStudentById(Integer.parseInt(studentFromDB.getId()));
		
		System.out.println("Now showing all students again");
		List<Student> studentAgainList = new ArrayList<Student>();
		studentAgainList = studentService.getAllStudents();
		System.out.println("listing all students");
		for(Student std: studentAgainList)
		{
			System.out.println("*************************");
			System.out.println("Student Id: "+std.getId());
			System.out.println("First Name: "+std.getFirstName());			
		}
		// Even after deleting an item from domain we get the same count as before delete
		//TODO:why is that?
		System.out.println("Number of students in domain: "+studentService.getTotalCountOfStudents());
		
		
	}
	

	
}