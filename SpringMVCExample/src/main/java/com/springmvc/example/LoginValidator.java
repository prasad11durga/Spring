package com.springmvc.example;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return LoginForm.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object form, Errors errors) {
		LoginForm loginForm = (LoginForm)form;
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","Username is required");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","Password is required");
		if(null == loginForm.getUsername() || loginForm.getUsername()=="") {
			errors.rejectValue("username", 
					"error.empty.field", "Please Enter User Name");
		}
		
		if(null == loginForm.getPassword() || loginForm.getPassword() =="") {
			errors.rejectValue("password", 
					"error.empty.field", "Please Enter User Name");
		}
		
		if(errors.hasErrors()){
			return;
		}
		
	}
	
	

}
