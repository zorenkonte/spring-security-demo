package com.dark.mode.springsecuritydemo.model;

import com.dark.mode.springsecuritydemo.types.AuthorityType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Authority extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private AuthorityType name;

    public AuthorityType getName() {
        return name;
    }

    public void setName(AuthorityType name) {
        this.name = name;
    }
}
