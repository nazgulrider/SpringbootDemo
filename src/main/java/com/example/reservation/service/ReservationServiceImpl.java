package com.example.reservation.service;

import com.example.reservation.domain.Reservation;
import com.example.reservation.repository.ResRepo;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService{
    private ResRepo repository;

    public ReservationServiceImpl(ResRepo resRepo) {
        this.repository = resRepo;
    }

    @Override
    public Reservation save(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public Iterable<Reservation> getAllReservations() {
        return repository.findAll();
    }
}
