package com.vivek.userProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.userProfile.model.Users;

public interface UserInfoRepository extends JpaRepository<Users, Integer> {

}
