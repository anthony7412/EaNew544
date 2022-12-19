package com.compro.miu.compro.service;

import com.compro.miu.compro.domain.CourseOffering;
import com.compro.miu.compro.dto.CourseOfferingDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CourseOfferingService {
    void update(CourseOffering courseOffering);
    CourseOffering create(CourseOfferingDto courseOfferingDto);
    CourseOffering findById(int id);
    Page<CourseOffering> findAll(Pageable pageable);
    void delete(int id);
}
