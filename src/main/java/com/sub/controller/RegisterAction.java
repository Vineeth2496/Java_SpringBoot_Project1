package com.sub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String phoneno=request.getParameter("ph");
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String email=request.getParameter("em");
		String password=request.getParameter("pa");
		
		PrintWriter out=response.getWriter();
		
		Data d=new Data();
		d.setPhoneno(phoneno);
		d.setFirstname(firstname);
		d.setLastname(lastname);
		d.setEmail(email);
		d.setPassword(password);
		
		Dao s=new Dao();
		int res=s.register_logics(d);
		out.println("Your Proflie for CircketLIVE is Sucessfully Registerd:"+res);
		
	}

}
