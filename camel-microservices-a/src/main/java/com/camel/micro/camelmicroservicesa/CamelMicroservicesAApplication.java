package com.camel.micro.camelmicroservicesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author charithkulawardana
 *
 */

@SpringBootApplication
public class CamelMicroservicesAApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(CamelMicroservicesAApplication.class, args);
	}

}
