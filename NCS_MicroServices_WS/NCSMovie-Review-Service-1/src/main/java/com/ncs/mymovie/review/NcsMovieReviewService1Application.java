package com.ncs.mymovie.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NcsMovieReviewService1Application {

	public static void main(String[] args) {
		SpringApplication.run(NcsMovieReviewService1Application.class, args);
	}

}
