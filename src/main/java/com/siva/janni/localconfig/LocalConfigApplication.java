package com.siva.janni.localconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LocalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalConfigApplication.class, args);
	}

}
