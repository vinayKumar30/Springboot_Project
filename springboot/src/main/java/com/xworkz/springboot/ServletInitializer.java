package com.xworkz.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	private static Logger logger = Logger.getLogger(ServletInitializer.class);

	public ServletInitializer() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootApplication.class);
	}

}
