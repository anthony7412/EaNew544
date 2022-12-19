package com.compro.miu.compro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty extends User {


    private String title;
    public Faculty(String firstName, String lastName, String email, String password, Role role, String title) {
        super(firstName, lastName, email, password, role);
        this.title = title;
    }







}
