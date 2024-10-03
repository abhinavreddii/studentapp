package com.app.studentdetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentId;
	private String studentName;
	private Long studentClass;
	private String studentSchool;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(Long studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSchool() {
		return studentSchool;
	}
	public void setStudentSchool(String studentSchool) {
		this.studentSchool = studentSchool;
	}
}
