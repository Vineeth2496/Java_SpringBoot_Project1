
  package com.sub.controller;
  
  import org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.servlet.ModelAndView;
  
  @Controller public class Forgot_Ser {
  
  @RequestMapping("/Forgot_Ser") 
  public ModelAndView task3() {
  
  ModelAndView m3=new ModelAndView("ForgotPassword");
  
  return m3;
  
  }
  
  }
 
