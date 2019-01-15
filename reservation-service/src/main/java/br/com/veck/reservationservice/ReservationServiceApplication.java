package br.com.veck.reservationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

}

