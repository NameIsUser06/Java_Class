package com.department.school.repository;

import com.department.school.domain.Department;
import com.department.school.domain.Gender;
import com.department.school.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentJpaRepositoryTest {

    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @Autowired
    private DepartmentJpaRepository departmentJpaRepository;

    @Test
    public void testSave() {
        studentJpaRepository.save(Student.builder()
                        .id(1101L)
                        .name("Student")
                        .gender(Gender.MALE)
                        .department(departmentJpaRepository.save(Department.builder()
                                .name("Department")
                                .personnel(100L)
                                .build()))
                .build());
        assertEquals(studentJpaRepository.findAll().get(0).getId(), 1101L);
        assertEquals(studentJpaRepository.findAll().get(0).getDepartment().getPersonnel(), 100L);
    }

}