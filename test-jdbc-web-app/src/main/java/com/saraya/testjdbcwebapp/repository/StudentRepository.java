package com.saraya.testjdbcwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.testjdbcwebapp.domaine.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
