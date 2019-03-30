package com.vivek.userProfile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.userProfile.model.Users;
import com.vivek.userProfile.repository.UserInfoRepository;

@Service
public class UserProfileService {
	
	@Autowired
	UserInfoRepository userInfoRepository;

	public  List<Users> getAllUsersfromDB() {
		// TODO Auto-generated method stub
		return userInfoRepository.findAll();
	}
}
