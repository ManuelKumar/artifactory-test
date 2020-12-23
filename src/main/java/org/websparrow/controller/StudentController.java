package org.websparrow.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.websparrow.model.Student;
import org.websparrow.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/{rollNo}")
	public Student getOne(@PathVariable("rollNo") String rollNo) {
		return studentService.findByRollNo(rollNo);
	}

	/*@RequestMapping("/all")
	public Hashtable<String, Student> getAll() {
		return studentService.findAll();
	}*/
	
	@RequestMapping("/test")
	public RedirectView localRedirect() {
	    RedirectView redirectView = new RedirectView();
	    redirectView.setUrl("http://www.yahoo.com");
	    return redirectView;
	}	

}
