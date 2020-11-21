package com.barco.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @author Nabeel Ahmed
 */
@SpringBootApplication
public class ModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}

	@PostConstruct
	public void started() {
		// default system timezone for application
		// what ever the time of server we use this new_york time
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
	}

}
