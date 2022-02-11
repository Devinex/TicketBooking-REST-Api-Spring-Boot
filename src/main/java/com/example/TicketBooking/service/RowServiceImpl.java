package com.example.TicketBooking.service;

import com.example.TicketBooking.model.Row;
import com.example.TicketBooking.repository.RowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RowServiceImpl implements RowService {

    private final RowRepository rowRepository;

    @Autowired
    public RowServiceImpl(RowRepository rowRepository) {
        this.rowRepository = rowRepository;
    }

    public List<Row> getAllRow() {
        return rowRepository.findAll();
    }

}
