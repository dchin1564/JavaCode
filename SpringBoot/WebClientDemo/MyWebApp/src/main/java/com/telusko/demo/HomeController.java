package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //used to accept request to the server
public class HomeController {
	
	//HttpServletRequest object is used to fetch data
	//once you have the request object, you can fetch the value of it
	//@RequestParam helps with when a client side gives a parameter (name), it will assign it to myName 
/*	@RequestMapping("home")
	public String home(@RequestParam("name")String myName,HttpSession session) {
		
		//HttpSession session = req.getSession();
		//String name = req.getParameter("name");
		System.out.println("hi" + myName);
		session.setAttribute("name",myName);
		return "home"; //will return the home.jsp file that was created
	} 
	*/
	
	/*
	//ModelAndView holds the model (name) and the data that is associated with it
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
		return mv; 
	}
	
	*/
	
	//this is if you want to send an entire object as a request
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv; 
	}
	
	
	
	
	
	

}
