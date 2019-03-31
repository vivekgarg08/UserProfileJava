package com.vivek.userProfile.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.userProfile.model.Users;
import com.vivek.userProfile.repository.UserInfoRepository;

@Service
public class UserProfileService {

	@Autowired
	UserInfoRepository userInfoRepository;

	public List<Users> getAllUsersfromDB() {
		// TODO Auto-generated method stub
		return userInfoRepository.findAll();
	}

	public Users getUserDetails(String userID) {

		Optional<Users> userDetails = userInfoRepository.findByUserID(userID);
		return userDetails.orElse(new Users());

	}

	public List<Users> getUserDetailsByName(String userName) {

		Optional<List<Users>> userDetails = userInfoRepository.findByFirstName(userName);
		List<Users> users = userDetails.orElse(new ArrayList<>());

		return users;
	}
	
	public Users registerUser(Users user) {
		return userInfoRepository.save(user);
		
	}

}
