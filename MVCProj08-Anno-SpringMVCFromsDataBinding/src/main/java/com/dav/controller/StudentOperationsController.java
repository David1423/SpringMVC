package com.dav.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dav.model.StudentDetails;

@Controller
public class StudentOperationsController {
	
	@RequestMapping("/welcome")
	public String ShowHomepage() {
		return "home";
	}
	
	//StudentDetails model class passed here becoz it can set variable values as default values to the form components
	@GetMapping("/student")
	public String StudentFormLaunch(@ModelAttribute("stud") StudentDetails details) {
		System.out.println("StudentOperationsController.StudentFormLaunch()");
		return "studentForm";
	}
	
	@PostMapping("/student")
	public String StudentRegProcessing(@ModelAttribute("stud") StudentDetails details,BindingResult result) {
		System.out.println("StudentOperationsController.StudentRegProcessing()");
		return "result";
	} 
}
