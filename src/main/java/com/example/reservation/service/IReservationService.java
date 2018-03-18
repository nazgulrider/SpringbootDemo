package com.example.reservation.service;

import com.example.reservation.domain.Reservation;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IReservationService {
    Reservation save(Reservation reservation);
    Iterable<Reservation> getAllReservations();
}
