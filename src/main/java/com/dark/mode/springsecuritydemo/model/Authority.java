package com.dark.mode.springsecuritydemo.model;

import com.dark.mode.springsecuritydemo.types.AuthorityType;

import javax.persistence.*;

@Entity
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private AuthorityType name;

    public Integer getId() {
        return id;
    }

    public AuthorityType getName() {
        return name;
    }

    public void setName(AuthorityType name) {
        this.name = name;
    }
}
