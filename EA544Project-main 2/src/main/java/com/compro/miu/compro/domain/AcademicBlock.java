package com.compro.miu.compro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicBlock {

        @Id
        @GeneratedValue
        private int id;
        private String name;
        @Column(unique = true)
        String code;
        private String semester;
        private LocalDateTime startDate;
        private LocalDateTime endDate;

        @OneToMany
        @JoinColumn(name = "course_offering_id")

        private List<CourseOffering> courseOfferings = new ArrayList<>();

}


