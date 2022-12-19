package com.compro.miu.compro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Student Student;



}
