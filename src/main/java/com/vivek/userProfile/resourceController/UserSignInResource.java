package com.vivek.userProfile.resourceController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.userProfile.model.Users;
import com.vivek.userProfile.service.UserProfileService;

@Endpoint(id="active-users")
@RestController
@RequestMapping("/userInfo/users")
public class UserSignInResource {
	
	@Autowired
	UserProfileService userProfileService;
	@ReadOperation
	@GetMapping("/all")
	public List<Users> getAllUsers(){
		return  userProfileService.getAllUsersfromDB() ;
	}

}
