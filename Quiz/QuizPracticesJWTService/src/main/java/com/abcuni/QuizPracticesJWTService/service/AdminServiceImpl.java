package com.abcuni.QuizPracticesJWTService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesJWTService.model.Users;
import com.abcuni.QuizPracticesJWTService.repository.AppUsersRepository;
import com.abcuni.QuizPracticesJWTService.security.MyUserDetails;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AppUsersRepository userRepo;

	@Override // from UserDetailsService
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = userRepo.getUsersByUsername(username);
		System.out.println(" ");
		System.out.println("--------Inside App User Service IMP ---------- ");
		System.out.println(" Arg :- " + username);
		System.out.println(" From Database " + user);

		return new MyUserDetails(user);

		// User user1 = new User("raja","abc",Arrays.asList(new
		// SimpleGrantedAuthority("admin")));
		// return user1;
	}

	@Override
	public Users saveUsers(Users appUsers) {

		Users user = userRepo.save(appUsers);

		return user;

	}

}
