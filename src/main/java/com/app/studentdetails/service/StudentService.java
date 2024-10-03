package com.app.studentdetails.service;

import java.util.List;

import com.app.studentdetails.model.StudentDetails;

public interface StudentService {
	StudentDetails saveStudent(StudentDetails student);
	List<StudentDetails> findallStudents();
	StudentDetails findbyStudentId(Long id);
	StudentDetails updateStudent(StudentDetails student);
	void deleteStudentById(Long id);
}
