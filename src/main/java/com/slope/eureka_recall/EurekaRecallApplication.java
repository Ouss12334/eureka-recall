package com.slope.eureka_recall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRecallApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRecallApplication.class, args);
	}

}
