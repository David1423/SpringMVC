package com.dav.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dav.service.ICountriesMgmtService;

@Controller
public class CountriesListController {

	@Autowired
	public ICountriesMgmtService service;
	
	
	@RequestMapping("/welcome")
	public String showHomePage() {
		return "home" ;
	}
	
	@RequestMapping("/about_us")
	public String showAboutUsPage() {
		return "aboutUs";
	}
	
	@RequestMapping("/contact_us")
	public String showContactUsPage() {
		return "contactUs";
	}
	
	@RequestMapping("/list_countries")
	public ModelAndView fetchCountries() {
		
		List<String> countriesList = service.getCountries();
		//create MAV object
		ModelAndView mav = new ModelAndView();
		//add multiple model Attributes to mav obj
		mav.addObject("countriesInfo",countriesList);
		mav.addObject("sysDate",LocalDateTime.now());
		// set Logical View Name to mav Object
		mav.setViewName("countriesList");
		//return MAV object
		return mav;
	}
}
