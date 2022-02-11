package com.example.TicketBooking.service;

import com.example.TicketBooking.model.Film;
import com.example.TicketBooking.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository) {

        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {

        return filmRepository.findAll();
    }

    @Override
    public Optional<Film> getFilmByID(Long id) {

        return filmRepository.findById(id);
    }

    @Override
    public Film findByDate(LocalDate startFrom){

        return filmRepository.findByDate(startFrom);

    }

}
