package com.vivek.userProfile.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.userProfile.model.Users;

public interface UserInfoRepository extends JpaRepository<Users, Integer> {
	
	Optional<List<Users>> findByFirstName(String firstName);
     

	Optional<Users> findByUserID(String userID);

}
