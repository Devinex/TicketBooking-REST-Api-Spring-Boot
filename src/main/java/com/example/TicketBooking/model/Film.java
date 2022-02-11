package com.example.TicketBooking.model;



import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Film extends Basic {
    private String title;
    private String yearOfProduction;
    private int duration;
    private String description;
    private String country;
    private LocalDate startFrom;


}
