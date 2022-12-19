package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    Optional<Course> findById(int course_id);
}
