 package com.saraya.testjdbcwebapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saraya.testjdbcwebapp.domaine.Student;
import com.saraya.testjdbcwebapp.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/log")
	public String showHome(Model model) {
		List<Student> listStudent = service.listAll();
		model.addAttribute("listStudent",listStudent);
		System.out.print("Get /");
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("student", new Student());
		return"new";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student std) {
		service.save(std);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name="id") int id) {
		ModelAndView mav = new ModelAndView("new");
		Student std = service.get(id);
		mav.addObject("student",std);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudentPage(@PathVariable(name="id") int id) {
		service.delete(id);
		
		return "redirect:/";
	}

}
