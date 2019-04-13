package com.leave.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LeaveappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveappApplication.class, args);
	}

}
