package com.mkj.securepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mkj.securepro.repository.AppUsersRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = AppUsersRepository.class)
public class SecureProJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureProJpaApplication.class, args);
	}

}
