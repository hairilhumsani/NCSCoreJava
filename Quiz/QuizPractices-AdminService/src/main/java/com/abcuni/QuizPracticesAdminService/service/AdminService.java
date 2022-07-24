package com.abcuni.QuizPracticesAdminService.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesAdminService.model.Users;

@Service
public interface AdminService extends UserDetailsService{
	public Users saveUsers(Users mySecuredUsers);
}
