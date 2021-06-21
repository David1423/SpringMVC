package com.dav.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class CountriesMgmtServiceImpl implements ICountriesMgmtService {

	@Override
	public List<String> getCountries() {
	
		//create Locale Object
		Locale[] locale = Locale.getAvailableLocales();
		
		//create ArrayList
		List<String> countriesList = new ArrayList<String>();
		
		for(Locale l:locale) {
			
			if(l!=null && l.getDisplayCountry().length() !=0) {
				countriesList.add(l.getDisplayCountry());
			}//if
		}//for
		
		Collections.sort(countriesList);
		return countriesList;
	}
}
