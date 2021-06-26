package com.dav.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dav.model.StudentDetails;

@Controller
public class StudentController {

	@RequestMapping("/welcome")
	public String ShowHomePage() {
		return "welcome";
	}

	@RequestMapping("/student")
	public String FormLaunchProcess() {
		return "StudentForm";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String FormSubmitProcess(@RequestParam("sname") String sname, @RequestParam("sadd") String sadd,
			@RequestParam("sclass") String sclass, @RequestParam("mobile") String mobile, Map<String, Object> map,
			@ModelAttribute("stud") StudentDetails details) {

		details.setSname(sname);
		details.setSadd(sadd);
		details.setSclass(sclass);
		details.setMobile(mobile);

		map.put("result", details != null ? "<span style='color:green'>Registration succeeded</span>"
				: "<span style='color:red'>Registration failed</span>");

		return "result";
	}
}
