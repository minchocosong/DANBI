package com.swm.validator;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.swm.command.LoginCommand;

public class LoginCommandValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return LoginCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required");
	}

}
