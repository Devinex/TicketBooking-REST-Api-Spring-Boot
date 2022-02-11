package com.example.TicketBooking.service;


import com.example.TicketBooking.model.Film;
import com.example.TicketBooking.model.Hall;
import com.example.TicketBooking.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HallServiceImpl implements HallService {

    private HallRepository hallRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    public List<Hall> getAllHall() {
        return hallRepository.findAll();
    }

    public Optional<Hall> getHallByID(Long hallId) {
        return hallRepository.findById(hallId);
    }
}
