package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport {

	private RegistrationForm registrationForm;
	
	public String registerPage() {
		return "success";
	}
	
	//Method to validate the registration form
	public String validateForm() {
		
		System.out.println("registrationForm :"+ registrationForm);
		if(isValidForm()) {
			return "error";
		}
		
		return "success";
	}

	//Validating the Registration form
	private boolean isValidForm() {
		
		if(null == registrationForm.getFirstName()) {
			addFieldError("registrationForm.firstName" , "First Name is required");
		}
		
		if(null == registrationForm.getLastName()) {
			addFieldError("registrationForm.lastName" , "Last Name is required");
		}
		
		return hasFieldErrors();
		
	}
	
	public RegistrationForm getRegistrationForm() {
		return registrationForm;
	}

	public void setRegistrationForm(RegistrationForm registrationForm) {
		this.registrationForm = registrationForm;
	}
	
}
