package com.example.reservation.controller;

import com.example.reservation.domain.Reservation;
import com.example.reservation.service.IReservationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/reservations")
public class ReservationController {
    private IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping( value = {"", "/"})
    public Iterable<Reservation> reservations(){
        return reservationService.getAllReservations();
    }

}
