package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor stringtrimmeredirot = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringtrimmeredirot);
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Customer customer =new Customer();
		theModel.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,BindingResult theBindingResult) {
		System.out.println("binding result"+ theBindingResult);
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else
		return "customer-confirmation";
	}
}