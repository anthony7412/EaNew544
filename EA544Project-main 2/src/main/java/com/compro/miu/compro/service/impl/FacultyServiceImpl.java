package com.compro.miu.compro.service.impl;

import com.compro.miu.compro.domain.Faculty;
import com.compro.miu.compro.repository.FacultyRepository;
import com.compro.miu.compro.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getAllfaculty() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }



    @Override
    public void deleteFaculty() {
        facultyRepository.delete();

    }
}
