package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.MySecuredUsers;

import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public interface AppUserService extends UserDetailsService{
	public MySecuredUsers saveUsers(MySecuredUsers mySecuredUsers);
}
