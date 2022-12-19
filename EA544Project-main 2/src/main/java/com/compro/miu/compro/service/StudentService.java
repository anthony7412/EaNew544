package com.compro.miu.compro.service;

import com.compro.miu.compro.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student findById(int id);
    Student save(Student student);
    List<Student> getAllStudent();
    void delete(Integer id);

}
