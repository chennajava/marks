package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

public class StudentService {

	@Autowired
	StudentRepository repo;

	public List<Student> list() {
		return repo.findAll();
	}
}
