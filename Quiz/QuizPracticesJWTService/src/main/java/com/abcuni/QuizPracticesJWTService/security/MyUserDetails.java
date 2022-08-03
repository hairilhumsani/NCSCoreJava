package com.abcuni.QuizPracticesJWTService.security;


import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesJWTService.model.Users;

@Service
public class MyUserDetails implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 993591175072224642L;
	private Users user;
	
	public MyUserDetails(Users user) {
		super();
		this.user = user;
	}
	public MyUserDetails() {	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//String authority = user.getRole();
		SimpleGrantedAuthority a = new SimpleGrantedAuthority(user.getRole());
		System.out.println("--->> Inside MyUserDetails class :- "+a.getAuthority());
		return Arrays.asList(a);
      
	}
	@Override
	public String getPassword() {
		String password = user.getPassword();
		return password;
	}
	@Override
	public String getUsername() {
		String username = user.getUsername();
		return username;
	}
	
	public String getRole()
	{
		String role = user.getRole();
		return role;
	}

	@Override
	public boolean isAccountNonExpired() {		return true;	}

	@Override
	public boolean isAccountNonLocked() {	return true; }

	@Override
	public boolean isCredentialsNonExpired() {		return true;}

	@Override
	public boolean isEnabled() {	return true;	}
	
	@Override
	public String toString() {
		return "MyUserDetails [user=" + user + "]";
	}

	
	
}
