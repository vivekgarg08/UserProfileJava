package com.vivek.userProfile.resourceController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.userProfile.Config.UserProfileConfiguration;
import com.vivek.userProfile.model.Users;
import com.vivek.userProfile.service.UserProfileService;

@Endpoint(id="active-users")
@RestController
@RequestMapping("/")
public class UserSignInResource {
	
	@Autowired
	UserProfileService userProfileService;
	
	
	@GetMapping("userInfo/users/all")
	public List<Users> getAllUsers(){
		return  userProfileService.getAllUsersfromDB() ;
	}
 
	
	@GetMapping("userInfo/users/id/{userID}")
	public Users getUserDetails(@PathVariable("userID") final String userID){
		return  userProfileService.getUserDetails(userID) ;
	}
	
	
	
	@GetMapping("userInfo/users/usersname/{userName}")
	public List<Users> getUserByName(@PathVariable("userName") final String userName){
		return  userProfileService.getUserDetailsByName(userName) ;
	}
	
	
	@PostMapping("register/users")
	public Users registerUser(@RequestBody Users userData) {
		return  userProfileService.registerUser(userData);
		
	}
	
	@Autowired 
	private UserProfileConfiguration configuration;
	@RequestMapping("/dynamic-configuration")
	public Map<String, String> dynamicConfiguration() {
	   
	    Map<String, String> map = new HashMap<String, String>();
	    map.clear();
	    map.put("message", configuration.getDateFormatVal());
	    return map;
	}
}
