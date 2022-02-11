package com.example.TicketBooking.service;

import com.example.TicketBooking.model.Film;
import com.example.TicketBooking.model.Hall;

import java.util.List;
import java.util.Optional;

public interface HallService {
    List<Hall> getAllHall();

    Optional<Hall> getHallByID(Long hallId);

}
