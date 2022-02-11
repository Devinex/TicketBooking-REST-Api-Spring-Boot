package com.example.TicketBooking.repository;

import com.example.TicketBooking.model.FilmSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmSessionRepository extends JpaRepository<FilmSession, Long> {
}
