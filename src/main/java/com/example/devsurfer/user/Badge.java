package com.example.devsurfer.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder @Getter
@AllArgsConstructor @NoArgsConstructor
public class Badge {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String iconPath;

    private String description;
}
