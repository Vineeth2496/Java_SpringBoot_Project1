package com.sub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register_Ser {
	
	@RequestMapping("/Register_Ser")
	public ModelAndView task() {
		ModelAndView m=new ModelAndView("Register");
		return m;
	}
	
	@RequestMapping("/Login_Ser")
	public ModelAndView task1() {
		ModelAndView m1=new ModelAndView("Login");
		return m1;
	}
	
	
}
