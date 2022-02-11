package com.example.TicketBooking.controller;


import com.example.TicketBooking.model.Film;
import com.example.TicketBooking.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @RequestMapping(value = "/film", method = RequestMethod.GET, params = {"filmTittle"})
        public String searchFilm(@RequestParam LocalDate startFrom, Model
            model) {
        Film searchResult = filmService.findByDate(startFrom);
        model.addAttribute("allFilm", searchResult);
        return "/film";

    }
}
