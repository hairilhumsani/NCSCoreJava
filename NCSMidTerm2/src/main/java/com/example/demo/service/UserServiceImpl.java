package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.demo.model.MySecuredUsers;
import com.example.demo.repository.AppUsersRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	AppUsersRepository appUsersRepository;

	@Override
	public MySecuredUsers viewProfile() {

		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		return appUsersRepository.getUsersByUsername(userDetails.getUsername());
	}

	@Override
	public MySecuredUsers updatePinCode(long pin) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		MySecuredUsers user = appUsersRepository.getUsersByUsername(userDetails.getUsername());
		user.setPincode(pin);
		appUsersRepository.save(user);
		return user;

	}
}
