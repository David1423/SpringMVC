package com.dav.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dav.dto.StudentDTO;
import com.dav.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	IStudentService service;
	
	@RequestMapping("/student")
	public String StudentDetails(Map<String,Object> map) {
		
		
		map.put("student",service.getStudent());
		map.put("intData",service.intData());
		map.put("stringData",service.stringData());
		map.put("mapData",service.mapData());
		map.put("integerArrayData",service.integerArrayData());
		
		return "result1";
	}
	
	@RequestMapping("/welcome")
	public String showHomePage() {
		return "home";
	}
	
	
}
