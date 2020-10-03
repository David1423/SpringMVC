package com.dav.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements IWishService {

	@Override
	public String getWishMessage() {
		
		int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if (hour <12)
			return"GoodMorning";
		else if(hour <14)
			return "Good Afternoon";
		else if(hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

}
