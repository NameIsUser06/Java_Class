package com.cho.bssm.hellospring.repository;

import com.cho.bssm.hellospring.domain.Student;

import java.util.List;

public interface IStudentRepository {
    Long save(Student student);

    Student findById(Long id);
    List<Student> findAll();
}
