package com.dav.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements IWishService {

	@Override
	public String getWishMessage() {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return("GOOD MORNING");
		else if(hour < 14)
			return("GOOD AFTERNOON");
		else if(hour < 20)
			return("GOOD EVENING");
		else
		return "GOOD NIGHT";
	}
	

}
