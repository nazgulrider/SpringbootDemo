package com.example.reservation;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.IReservationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(IReservationService reservationService){
		return args -> {
			reservationService.save(new Reservation("Tommy"));
			reservationService.save(new Reservation("Jimmy"));
			reservationService.save(new Reservation("Ronny"));
			reservationService.save(new Reservation("Sunny"));
		};
	}

}
