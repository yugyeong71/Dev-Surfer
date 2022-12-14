package com.example.devsurfer.ticket.controller;

import com.example.devsurfer.ticket.Order;
import com.example.devsurfer.ticket.SuccessResponse;
import com.example.devsurfer.ticket.TicketForm;
import com.example.devsurfer.ticket.TicketType;
import com.example.devsurfer.ticket.entity.Ticket;
import com.example.devsurfer.ticket.repository.TicketRepository;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class TicketController {

    private TicketRepository ticketRepository;

    @GetMapping("/{repositoryId}") // Ticket 가져오기
    public List<Ticket> ticketList (@PathVariable Ticket repositoryId, TicketType type, Order order){

        return ticketRepository.findAll();
    }

    @PostMapping("/ticket") // Ticket 생성하기
    @Transactional
    public SuccessResponse ticketUpdate(@RequestBody TicketForm ticketForm){

        Ticket ticket = Ticket.builder()
                .build();
        ticketRepository.save(ticket);

        SuccessResponse<Ticket> successResponse = new SuccessResponse<Ticket>("Ticket 생성 성공");

        return successResponse;
    }
}
