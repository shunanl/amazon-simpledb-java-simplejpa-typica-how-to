package com.vulab.service;

import java.util.List;

import com.vulab.dao.StudentDAO;
import com.vulab.dao.StudentDAOImpl;
import com.vulab.domain.Student;
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

public class StudentServiceImpl implements StudentService {

	StudentDAO studentDAO = new StudentDAOImpl();

	public Student createStudent(Student student) throws Exception {
		return studentDAO.createStudent(student);
	}

	public void updateStudent(Student student) throws Exception {
		studentDAO.updateStudent(student);
	}

	public Student getStudentById(int studentId) throws Exception {
		return studentDAO.getStudentById(studentId);
	}

	public void deleteStudentById(int studentId) throws Exception {
		studentDAO.deleteStudentById(studentId);
	}

	public void deleteStudent(Student student) throws Exception {
		studentDAO.deleteStudent(student);
	}

	public List<Student> getAllStudents() throws Exception {
		return studentDAO.getAllStudents();
	}

	public int getTotalCountOfStudents() throws Exception {
		return studentDAO.getTotalCountOfStudents();
	}

}