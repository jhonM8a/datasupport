package com.technical.support.datasupport.repositories;

import com.technical.support.datasupport.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
