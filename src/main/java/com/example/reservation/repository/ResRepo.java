package com.example.reservation.repository;

import com.example.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResRepo extends JpaRepository<Reservation,Long> {
}
