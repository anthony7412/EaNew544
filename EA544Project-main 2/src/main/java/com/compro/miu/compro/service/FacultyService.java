package com.compro.miu.compro.service;

import com.compro.miu.compro.domain.Faculty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FacultyService {
    public List<Faculty> getAllfaculty();
    public Faculty saveFaculty(Faculty faculty);

    public void deleteFaculty();

}
