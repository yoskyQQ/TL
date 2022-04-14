package Mentor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApiAppication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiAppication.class, args);
	}
}