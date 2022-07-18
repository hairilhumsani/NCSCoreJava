package com.mkj.securepro.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true,jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.
			authorizeRequests().
			
			antMatchers("/api/public/**").permitAll().
			antMatchers("/api/admin/**").hasRole("admin").
			antMatchers("/api/employee/**").hasRole("employee").
			
			anyRequest().
			authenticated().
			and().
			httpBasic(); // formBasic...
		 
		 System.out.println(" configure .... roles set");
		
	}//end of http Security
	
	
	
	/* in case of no password encoder run this : section 1 */
	

		@Override	// use for user creation
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
			auth.inMemoryAuthentication()
			.withUser("mike").password("mike123").roles("admin","employee");
			
			auth.inMemoryAuthentication()
		.withUser("jenny").password(("jenny")).roles("admin");
		
			
			auth.inMemoryAuthentication()
			.withUser("neha").password("neha123").roles("employee");
			
			System.out.println(" users created ...");
		}

		// use for Align roles and resources
		
		
		@Bean
		public PasswordEncoder passwordEncoder()
		{
			return NoOpPasswordEncoder.getInstance();
		}

	
		
	
	
	
}//end class
