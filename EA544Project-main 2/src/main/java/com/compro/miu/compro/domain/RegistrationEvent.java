package com.compro.miu.compro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date endDate ;


}
