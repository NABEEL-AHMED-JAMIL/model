package com.barco.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Nabeel Ahmed
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.barco.*" })
public class ModelApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ModelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}

}