package com.technical.support.datasupport.controllers;

import com.technical.support.datasupport.entities.Ticket;
import com.technical.support.datasupport.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/all")
    public List<Ticket> getTickets(){
        return ticketRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable Long id){
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);
        return ticketOptional.isPresent() ? ticketOptional.get() : null;
    }

}
