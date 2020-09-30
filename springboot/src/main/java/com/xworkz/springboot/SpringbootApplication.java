package com.xworkz.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	private static Logger logger = Logger.getLogger(SpringbootApplication.class);

	public SpringbootApplication() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);
	}

}
