package com.example.TicketBooking.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class Basic {

    @Id
    @GeneratedValue
    private Long id;

}
