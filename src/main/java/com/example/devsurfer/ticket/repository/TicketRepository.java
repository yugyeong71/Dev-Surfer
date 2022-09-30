package com.example.devsurfer.ticket.repository;

import com.example.devsurfer.ticket.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
