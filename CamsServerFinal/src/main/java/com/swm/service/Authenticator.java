package com.swm.service;

import com.swm.command.LoginCommand;



public interface Authenticator {
	void authenticate(LoginCommand loginCommand)
			throws AuthenticationException;

}
