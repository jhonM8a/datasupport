package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Ticket;
import com.technical.support.datasupport.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/crear")
    public ResponseEntity crearTicket(@RequestBody Ticket ticket){
        ticketRepository.save(ticket);
        return new ResponseEntity(HttpStatus.OK);
    }
}
