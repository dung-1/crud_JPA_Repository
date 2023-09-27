package com.phucle.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phucle.spring.jpa.entity.Student;
import com.phucle.spring.jpa.entity.Cours;
import com.phucle.spring.jpa.service.BaseService;

@Controller
@RequestMapping("/student")
public class StudentController {

	// private static final Logger LOG =
	// LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private BaseService<Student> studentService;

	@Autowired
	private BaseService<Cours> coursService;

	@ModelAttribute("cours")
	public List<Cours> cours() {
		return coursService.getAll();
	}

	@GetMapping("/list")
	public String listStudent(Model theModel) {
		List<Student> theStudent = studentService.getAll();
		theModel.addAttribute("students", theStudent);
		return "list-student";
	}

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		// LOG.debug("inside show customer-form handler method");
		Student theStudent = new Student();
		theModel.addAttribute("students", theStudent);

		return "student-form";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		studentService.save(theStudent);
		return "redirect:/student/list";
	}

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		Student theStudent = studentService.getByID(theId);
		theModel.addAttribute("students", theStudent);
		return "student-form";
	}

	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int theId) {
		studentService.deleteById(theId);
		return "redirect:/student/list";
	}
}
