package com.saraya.testjdbcwebapp.domaine;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 private String name;
  
 private String filiere;
 private String addres;
 
 public Student() {
		super();
	}
 
public Student(long id, String name, String filiere, String addres) {
     super();
	this.id = id;
	this.name = name;
	this.filiere = filiere;
	this.addres = addres;
}


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFiliere() {
	return filiere;
}
public void setFiliere(String filiere) {
	this.filiere = filiere;
}
public String getAddress() {
	return addres;
}
public void setAddress(String addres) {
	this.addres = addres;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return id == other.id;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", filiere=" + filiere + ", addres=" + addres + "]";
}
 
 
 
 

}
