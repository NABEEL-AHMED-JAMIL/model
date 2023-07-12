package com.barco.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @author Nabeel Ahmed
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.barco.*" })
public class ModelApplication {

	public Logger logger = LogManager.getLogger(ModelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}

	@PostConstruct
	public void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
	}

}