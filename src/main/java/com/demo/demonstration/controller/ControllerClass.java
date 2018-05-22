package com.demo.demonstration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping("/index")
	public ModelAndView returnHomePage(ModelAndView model)
	{
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/login")
	public ModelAndView returnLoginPage(ModelAndView model)
	{
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView returnDashboardPage(ModelAndView model)
	{
		model.setViewName("dashboard");
		return model;
	}
	
	/*@RequestMapping("/error")
	public ModelAndView returnErrorPage(ModelAndView model, HttpServletRequest request, @RequestParam String msg)
	{
		
		//Exception exp = (Exception) request.getAttribute("exception");
	    System.out.println("Inside Controller");
	    if(null != msg)
	    model.addObject("exception", msg);
		model.setViewName("error");
		return model;
	}
	
	*/
}
