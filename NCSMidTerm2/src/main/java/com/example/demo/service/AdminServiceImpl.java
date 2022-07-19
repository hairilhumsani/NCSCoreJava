package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MySecuredUsers;
import com.example.demo.repository.AppUsersRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AppUsersRepository appUsersRepository;

	@Override
	public List<MySecuredUsers> getAllUser() {
		return appUsersRepository.findAll();
	}

	@Override
	public List<MySecuredUsers> getUserByPin(long pin) {

		return appUsersRepository.getUsersByPin(pin);
	}

}
