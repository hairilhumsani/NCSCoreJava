package com.mkj.securepro.service;

import org.springframework.stereotype.Service;

import com.mkj.securepro.model.AppUsers;
import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public interface AppUserService extends UserDetailsService{
	public AppUsers saveUsers(AppUsers appUsers);
}
