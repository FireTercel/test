package com.fire.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import com.fire.bean.Picture;

public class PicController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException arg3)
			throws Exception {
		Picture pic=(Picture)command;
		
		System.out.println(pic);
		return new ModelAndView("success");
	}

	

}
