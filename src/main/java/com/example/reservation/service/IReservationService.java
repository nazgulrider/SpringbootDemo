package com.example.reservation.service;

import com.example.reservation.domain.Reservation;

public interface IReservationService {
    Reservation save(Reservation reservation);
    Iterable<Reservation> getAllReservations();
}
