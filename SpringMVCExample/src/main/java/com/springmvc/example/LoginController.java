package com.springmvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model){
		LoginForm loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}
	
	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute LoginForm loginForm, Model model,BindingResult result){
		
		LoginValidator validator = new LoginValidator();
		validator.validate(loginForm, result);
		System.out.println("Has Errors ::"+result.hasErrors());
		model.addAttribute("loginForm", loginForm);
		if(result.hasErrors())
			return "login";
		
		return "welcome";
	}
	
}
