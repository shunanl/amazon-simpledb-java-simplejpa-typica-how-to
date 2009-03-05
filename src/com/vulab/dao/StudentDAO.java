package com.vulab.dao;

import java.util.List;

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
public interface StudentDAO {
	public Student createStudent(Student student)throws Exception;

	public void updateStudent(Student student)throws Exception;

	public Student getStudentById(int studentId)throws Exception;	

	public void deleteStudentById(int studentId)throws Exception;

	public void deleteStudent(Student student)throws Exception;

	public List<Student> getAllStudents()throws Exception;

	public int getTotalCountOfStudents()throws Exception;
}