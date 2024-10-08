package br.edu.ufape.gobarber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class GoBarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoBarberApplication.class, args);
	}

}
