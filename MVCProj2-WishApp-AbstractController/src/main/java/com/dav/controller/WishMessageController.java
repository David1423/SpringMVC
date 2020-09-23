package com.dav.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.dav.service.WishMessageService;

public class WishMessageController extends AbstractController {

	public WishMessageService wishMessage;
	
	public WishMessageController(WishMessageService wishMessage) {
		this.wishMessage = wishMessage;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String msg = wishMessage.getWishMessage();
		
		return new ModelAndView("result","wmsg",msg);
	}

}
