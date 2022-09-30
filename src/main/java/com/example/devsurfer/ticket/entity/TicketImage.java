package com.example.devsurfer.ticket.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class TicketImage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ticketId;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

    private Long path;

    private Integer status;

}
