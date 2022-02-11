package com.example.TicketBooking.repository;

import com.example.TicketBooking.model.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface FilmRepository extends JpaRepository<Film, Long> {
    Page<Film> findByTitle(String title, Pageable pageable);

    Film findByDate(LocalDate startFrom);


}
