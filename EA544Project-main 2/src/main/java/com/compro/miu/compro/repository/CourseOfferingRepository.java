package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseOfferingRepository extends JpaRepository<CourseOffering,Integer> {
}
