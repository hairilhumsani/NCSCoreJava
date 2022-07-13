package com.ncs.mymovie.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NcsMovieEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcsMovieEurekaServerApplication.class, args);
	}

}
