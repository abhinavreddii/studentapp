package com.app.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.studentdetails.model.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long> {

}
