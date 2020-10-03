package com.dav.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.dav.service.IWishService;

public class WishMessageController extends AbstractController {

	public IWishService service;
	
	
	public WishMessageController(IWishService service) {
		this.service = service;
	}


	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return new ModelAndView("result","wmsg",service.getWishMessage());
	}
}
