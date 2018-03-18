package com.example.reservation.repository;

import com.example.reservation.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ResRepo extends CrudRepository<Reservation,Long> {
}
