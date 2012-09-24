package com.swm.service;

import java.util.UUID;

import com.swm.domain.Counsel;
import com.swm.domain.RealGroup;
import com.swm.domain.RealUser;
import com.swm.domain.Role;
import com.swm.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Service for initializing MongoDB with sample data using {@link MongoTemplate}
 */
public class InitMongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void init() {
		// Drop existing collections
		mongoTemplate.dropCollection("role");
		mongoTemplate.dropCollection("user");
		mongoTemplate.dropCollection("counsel");
		mongoTemplate.dropCollection("realuser");
		mongoTemplate.dropCollection("realgroup");

		// Create new records - role
		Role adminRole = new Role();
		adminRole.setId(UUID.randomUUID().toString());
		adminRole.setRole(1);

		Role userRole = new Role();
		userRole.setId(UUID.randomUUID().toString());
		userRole.setRole(2);

		// Create new records - group
		RealGroup testGroup = new RealGroup();
		testGroup.setId(UUID.randomUUID().toString());
		testGroup.setGroup(1);

		User john = new User();
		john.setId(UUID.randomUUID().toString());
		john.setFirstName("John");
		john.setLastName("Smith");
		john.setPassword("21232f297a57a5a743894a0e4a801fc3");
		john.setRole(adminRole);
		john.setUsername("john");

		User jane = new User();
		jane.setId(UUID.randomUUID().toString());
		jane.setFirstName("Jane");
		jane.setLastName("Adams");
		jane.setPassword("ee11cbb19052e40b07aac0ca060c23ee");
		jane.setRole(userRole);
		jane.setUsername("jane");
		
		RealUser mj = new RealUser();
		mj.setId(UUID.randomUUID().toString());
		mj.setUserId("smjxx2000");
		mj.setUserName("minjeong");
		mj.setPasswd("0000");
		mj.setEmail("mj@mj.com");
		mj.setImage("mj.png");
		mj.setRole(adminRole);
		mj.setGroup(testGroup);

		Counsel counsel = new Counsel();
		counsel.setNo("0");
		counsel.setcAge("");
		// Insert to db
		mongoTemplate.insert(john, "user");
		mongoTemplate.insert(jane, "user");
		mongoTemplate.insert(adminRole, "role");
		mongoTemplate.insert(userRole, "role");
		mongoTemplate.insert(mj, "realuser");
		mongoTemplate.insert(testGroup, "realgroup");
		mongoTemplate.insert(counsel, "counsel");
	}
}