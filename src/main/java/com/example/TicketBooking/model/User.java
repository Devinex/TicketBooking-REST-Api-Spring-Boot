package com.example.TicketBooking.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class User {

    private String first_name;
    private String last_name;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Ticket> tickets;
}
