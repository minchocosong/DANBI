package com.swm.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swm.domain.RealUser;
import com.swm.repository.RealGroupRepository;
import com.swm.repository.RealUserRepository;
import com.swm.repository.RoleRepository;

@Service
public class RealUserService {
	
	@Autowired
	private RealUserRepository realUserRepository;
	
	@Autowired
	private RealGroupRepository realGroupRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public RealUser create(RealUser user){
		
		user.setId(UUID.randomUUID().toString());
		user.getGroup().setId(UUID.randomUUID().toString());
		user.getRole().setId(UUID.randomUUID().toString());
		
		realGroupRepository.save(user.getGroup());
		roleRepository.save(user.getRole());
		RealUser usr= new RealUser();
		usr=realUserRepository.save(user);
		return realUserRepository.save(user);
		
	}

}
