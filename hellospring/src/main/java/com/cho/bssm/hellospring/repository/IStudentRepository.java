package com.cho.bssm.hellospring.repository;

import com.cho.bssm.hellospring.domain.Student;

public interface IStudentRepository {
    Long save(Student student);
}
