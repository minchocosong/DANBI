package com.swm.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.swm.domain.RealGroup;


public class GroupValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return RealGroup.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RealGroup group = (RealGroup) target;
		if(group.getGname() == null || group.getGname().trim().isEmpty()){
			errors.rejectValue("gname", "required");
		}
	}

}
