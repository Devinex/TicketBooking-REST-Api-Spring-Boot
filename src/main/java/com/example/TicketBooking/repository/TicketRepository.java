package com.example.TicketBooking.repository;

import com.example.TicketBooking.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository <Ticket, Long> {
}
