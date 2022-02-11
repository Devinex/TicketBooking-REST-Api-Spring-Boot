package com.example.TicketBooking.repository;

import com.example.TicketBooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findByLastName(String lastName);

    User findByEmail(String email);

    User findByPhone(String phone);
}
