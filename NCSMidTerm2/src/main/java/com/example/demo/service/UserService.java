package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.MySecuredUsers;

@Service
public interface UserService {
	public MySecuredUsers viewProfile();
	public MySecuredUsers updatePinCode(long pin) ;
}
