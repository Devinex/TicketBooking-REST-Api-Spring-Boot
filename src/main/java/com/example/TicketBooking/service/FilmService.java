package com.example.TicketBooking.service;

import com.example.TicketBooking.model.Film;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmService {

    List<Film> getAllFilms();

    Optional<Film> getFilmByID(Long id);

    Film findByDate(LocalDate startFrom);

}
