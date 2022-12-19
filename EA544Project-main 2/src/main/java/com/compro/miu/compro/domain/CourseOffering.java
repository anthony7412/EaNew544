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
public class CourseOffering {

        @Id
        @GeneratedValue
        private int id;
        private String code;
        private String facultyInitials;
        private int availableSeats;
        private int capacity;
        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
        @JoinColumn
        private Faculty faculty;
        @OneToMany
        private List<RegistrationRequest> registrationRequests = new ArrayList<>();
        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
        @JoinColumn
        private AcademicBlock academicBlock;
        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
        @JoinColumn
        private Course course;
        public void addStudent(User s) {
        }

        public int getAvailableSeat() {
                return capacity-registrationRequests.size();
        }
}
