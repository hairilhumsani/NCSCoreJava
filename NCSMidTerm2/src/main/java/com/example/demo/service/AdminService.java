package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.MySecuredUsers;

@Service
public interface AdminService {

	public List<MySecuredUsers> getAllUser();
	public List<MySecuredUsers> getUserByPin(long pin);
}
