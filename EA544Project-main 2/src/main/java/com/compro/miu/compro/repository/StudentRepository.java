package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByStudentId(String studentId);
    boolean existsByStudentId(String studentId);

    boolean existsByEmailAddress(String email);
    Student findByEmailAddress(String email);
}
