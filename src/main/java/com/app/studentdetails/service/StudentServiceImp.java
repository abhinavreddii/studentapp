package com.app.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.studentdetails.model.StudentDetails;
import com.app.studentdetails.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	StudentRepository studentrepository;

	@Override
	public StudentDetails saveStudent(StudentDetails student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public List<StudentDetails> findallStudents() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}

	@Override
	public StudentDetails findbyStudentId(Long id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).orElse(null);
	}

	@Override
	public StudentDetails updateStudent(StudentDetails student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentrepository.deleteById(id);
	}

}
