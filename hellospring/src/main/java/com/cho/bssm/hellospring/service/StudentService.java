package com.cho.bssm.hellospring.service;

import com.cho.bssm.hellospring.domain.Student;
import com.cho.bssm.hellospring.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private final IStudentRepository repository;

    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }

    public Long edit(Student student) {
        Long input = repository.save(student);
        System.out.println(input);
        return input;
    }
}
