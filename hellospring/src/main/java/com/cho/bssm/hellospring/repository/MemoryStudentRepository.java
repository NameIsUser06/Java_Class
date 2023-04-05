package com.cho.bssm.hellospring.repository;

import com.cho.bssm.hellospring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryStudentRepository implements IStudentRepository{
    private static Map<Long, Student> store = new HashMap<Long, Student>();

    @Override
    public Long save(Student student) {
        store.put(student.getId(), student);
        return student.getId();
    }
}
