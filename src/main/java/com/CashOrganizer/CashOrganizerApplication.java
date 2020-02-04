package com.CashOrganizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CashOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashOrganizerApplication.class, args);
	}

}

