package com.example.devsurfer.ticket.entity;

import com.example.devsurfer.repository.Repository;
import com.example.devsurfer.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

    @ManyToOne
    @JoinColumn(name = "REPOSITORY_ID")
    private Repository repositoryId;

    private boolean isPublic;

    private String branch;

    private Integer branchState;

    private Long parentId;

    private Integer status;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User userId;

}
