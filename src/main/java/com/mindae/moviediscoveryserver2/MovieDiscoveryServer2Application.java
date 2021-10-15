package com.mindae.moviediscoveryserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MovieDiscoveryServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieDiscoveryServer2Application.class, args);
	}

}
