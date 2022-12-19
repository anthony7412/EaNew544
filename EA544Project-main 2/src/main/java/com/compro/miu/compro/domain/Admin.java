package com.compro.miu.compro.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
public class Admin extends User {

    public Admin(String firstName, String lastName, String email, String password, Role role) {
        super(firstName, lastName, email, password, role);
    }
}