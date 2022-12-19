package com.compro.miu.compro.controller;

import com.compro.miu.compro.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {

    @Autowired
    private FacultyService facultyService;
}
