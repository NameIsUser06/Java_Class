package com.cho.bssm.hellospring.service;

import com.cho.bssm.hellospring.domain.Student;
import com.cho.bssm.hellospring.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final IStudentRepository repository;

    @Autowired
    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }

    public void edit(Student student) {
        validateDuplicateStudent(student);
        repository.save(student);
    }

    public void validateDuplicateStudent(Student student) {
        if (repository.findById(student.getId()) != null) {
            throw new IllegalStateException("이미 등록된 학번입니다!");
        }
    }

    public List<Student> findStudents() {
        return repository.findAll();
    }

    public void updateScore(Student student) {
        repository.findById(student.getId()).setScore(student.getScore());
    }

    public Student findOne(Long id) {
        return repository.findById(id);
    }
}
