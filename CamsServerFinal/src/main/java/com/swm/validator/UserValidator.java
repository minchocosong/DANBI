package com.swm.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.swm.domain.RealUser;



public class UserValidator  implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return RealUser.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		RealUser user = (RealUser) target;
		if(user.getId() == null || user.getId().trim().isEmpty()) {
			errors.rejectValue("id", "required");
		}
		if(user.getUserName()== null || user.getUserName().trim().isEmpty()){
			errors.rejectValue("name","required");
		}
	
	}

}