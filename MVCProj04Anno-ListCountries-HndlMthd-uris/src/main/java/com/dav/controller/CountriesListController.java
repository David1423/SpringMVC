package com.dav.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dav.service.ICountriesMgmtService;

@Controller
@RequestMapping("/test")
public class CountriesListController {

	@Autowired
	public ICountriesMgmtService service;

	/*  
	 * DIFFERENT KINDS OF SIGNATURE FOR HANDLER METHOD
	 * 
	 * @RequestMapping("/list_countries") public ModelAndView fetchCountries() {
	 * 
	 * List<String> countriesList = service.getCountries(); // create MAV object
	 * ModelAndView mav = new ModelAndView(); // add multiple model Attributes to
	 * mav mav.addObject("countriesInfo", countriesList); mav.addObject("sysDate",
	 * LocalDateTime.now()); // set Logical View Name to mav Object
	 * mav.setViewName("countriesList"); // return MAV object return mav; }
	 */

	// Best Signature for Handler method (makes Handler method Invasive with Map)
	@RequestMapping("/list_countries")
	public String fetchCountries(Map<String, Object> map) {

		List<String> countriesList = service.getCountries();
		map.put("countriesInfo", countriesList);
		map.put("sysDate", LocalDateTime.now());
		return "countriesList";
	}

	/*
	// If the retrunType is Void it takes income request URI as the Logical View Name(list_countires)
	@RequestMapping("/list_countries")
	public void fetchCountries(Map<String, Object> map) {

		List<String> countriesList = service.getCountries();
		map.put("countriesInfo", countriesList);
		map.put("sysDate", LocalDateTime.now());
	}
	*/

	/*
	//Internally DS creates Obj for Model which is super Interface of BindingAwareModelMap(actual obj)
	
	@RequestMapping("/list_countries")
	public String fetchCountries(Model model) {

		List<String> countriesList = service.getCountries();
		
		model.addAttribute("countriesInfo", countriesList);
		model.addAttribute("sysDate", LocalDateTime.now());
		
		return "countriesList";
	}
	*/
	/*
	//using ModelMap ref for the BindingAwareModelMap object
	@RequestMapping("/list_countries")
	public String fetchCountries(ModelMap map) {

		List<String> countriesList = service.getCountries();
		map.put("countriesInfo", countriesList);
		map.put("sysDate", LocalDateTime.now());
		return "countriesList";
	}
	*/
	
	/*
	//Here ret. type is model so we have to explicitly create the object and add attributes to it
	@RequestMapping("/list_countries")
	public ModelMap fetchCountries() {

		List<String> countriesList = service.getCountries();
		//create ModelMap Obejct
		ModelMap modelMap = new BindingAwareModelMap();
		modelMap.put("countriesInfo", countriesList);
		modelMap.put("sysDate", LocalDateTime.now());
		//return ModelMap
		return modelMap;
	}
	
	*/
	/*
	//ModelAndView is not accepted as argument in Handler Method . now no Data is being fetched to view
	@RequestMapping("/list_countries")
	public String fetchCountries(ModelAndView mav) {

		List<String> countriesList = service.getCountries();
		mav.addObject("countriesInfo", countriesList);
		mav.addObject("sysDate", LocalDateTime.now());
		return "countriesList";
	}
	
	*/
	
	
	
	@RequestMapping("/welcome")
	public String showHomePage() {
		return "home";
	}

	@RequestMapping("/about_us")
	public String showAboutUsPage() {
		return "aboutUs";
	}

	@RequestMapping("/contact_us")
	public String showContactUsPage() {
		return "contactUs";
	}

}
