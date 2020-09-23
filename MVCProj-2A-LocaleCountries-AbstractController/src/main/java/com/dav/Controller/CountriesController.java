package com.dav.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CountriesController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// get all ISO Countries
		String[] locales = Locale.getISOCountries();

		// create a List obj
		List<String> countries = new ArrayList<String>();

		// get all Countries into countries obj
		for (String countryCode : locales) {
			// add each country to collection
			countries.add(new Locale("", countryCode).getDisplayCountry());
		}

		return new ModelAndView("countries", "countries", countries);
	}

}
