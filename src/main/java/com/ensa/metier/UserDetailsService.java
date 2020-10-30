package com.ensa.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.ensa.dao.UserRepository;
import com.ensa.entities.User;
import com.ensa.entities.UserPrincipal;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService  {
	@Autowired
	UserRepository userRepository;
	public UserDetails loadUserByUsername(String userName) {
		User user = userRepository.findByUsername(userName);
		UserPrincipal userDetail = new UserPrincipal(user);
		return userDetail;
	}
}
