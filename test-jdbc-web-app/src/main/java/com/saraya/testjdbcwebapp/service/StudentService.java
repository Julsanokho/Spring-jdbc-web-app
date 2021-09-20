package com.saraya.testjdbcwebapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.testjdbcwebapp.domaine.Student;
import com.saraya.testjdbcwebapp.repository.StudentRepository;

@Service
public abstract class StudentService{
	@Autowired
    private StudentRepository repo;
	
	public List<Student>listAll(){
		return repo.findAll();
	}
	
	public void save(Student std) {
		repo.save(std);
	}
	
	public Student get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}

}
