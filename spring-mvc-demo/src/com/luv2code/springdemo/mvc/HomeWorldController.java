package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller to read form data 
	// add  data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read requset parameter
		String theName = request.getParameter("studentName");
		
		// convert the data to upper case
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yo! " + theName;
		//add message to model
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		// convert the data to upper case
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yo! " + theName;
		//add message to model
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
