package com.example.devsurfer.repository;

import com.example.devsurfer.ticket.Ticket;
import com.example.devsurfer.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class Repository {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String repoName;

    @OneToMany(mappedBy = "repositoryId")
    private List<Ticket> tickets = new ArrayList<Ticket>();

    @ManyToMany
    @JoinTable(name = "REPOSITORY_USER",
            joinColumns = @JoinColumn(name = "REPOSITORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private List<User> users = new ArrayList<User>();
}
