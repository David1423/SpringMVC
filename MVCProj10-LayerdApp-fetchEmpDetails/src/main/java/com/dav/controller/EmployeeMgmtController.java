package com.dav.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.dav.dto.EmployeeDTO;
import com.dav.service.IEmployeeMgmtService;

@Controller
public class EmployeeMgmtController {

	@Autowired
	public IEmployeeMgmtService empService;
	
	@GetMapping("/welcome")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/getEmployees")
	public String getEmpDetails(Map<String,Object> map) {
		
		//get all the Employees
		List<EmployeeDTO> listDTO = empService.getAllEmployees();
		
		//keep result into  Model attribute
		map.put("empsInfo",listDTO);
		return "EmpDetails";
	}
}
