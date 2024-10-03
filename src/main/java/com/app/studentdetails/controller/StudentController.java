package com.app.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.studentdetails.model.StudentDetails;
import com.app.studentdetails.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/savestudent")
	public StudentDetails saveStudent(@RequestBody StudentDetails student) {
		// TODO Auto-generated method stub
		return studentservice.saveStudent(student);
	}

	@GetMapping("/findallstudents")
	public List<StudentDetails> findallStudents() {
		// TODO Auto-generated method stub
		return studentservice.findallStudents();
	}

	@GetMapping("/findbyId/{id}")
	public StudentDetails findbyStudentId(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return studentservice.findbyStudentId(id);
	}

	@PutMapping("/updatestudent/{id}")
	public StudentDetails updateStudent(@PathVariable Long id,@RequestBody StudentDetails student) {
		// TODO Auto-generated method stub
		student.setStudentId(id);
		return studentservice.updateStudent(student);
	}

	@DeleteMapping("/deletebyId/{id}")
	public void deleteStudentById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		studentservice.deleteStudentById(id);
	}
}
