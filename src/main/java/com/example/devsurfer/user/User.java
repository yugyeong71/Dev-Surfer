package com.example.devsurfer.user;

import com.example.devsurfer.repository.Repository;
import com.example.devsurfer.ticket.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String displayName;

    private LocalDateTime joinDt;

    private LocalDateTime dropDt;

    private String fcmToken;

    private Integer deviceType;

    private Integer status;

    @ManyToMany(mappedBy = "users")
    private List<Repository> repositories;

    @OneToOne(mappedBy = "userId")
    private Ticket ticket;
}
