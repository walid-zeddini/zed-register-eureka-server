package com.zeddini.api.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Indicate Eureka Server Application
public class ZedRegisterErurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZedRegisterErurekaServerApplication.class, args);
	}

}
