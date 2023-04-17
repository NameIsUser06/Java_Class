package com.cho.bssm.hellospring.repository;

import com.cho.bssm.hellospring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class MemoryStudentRepository implements IStudentRepository{
    private static final Map<Long, Student> store = new HashMap<Long, Student>();

    @Override
    public Long save(Student student) {
        store.put(student.getId(), student);
        return student.getId();
    }

    @Override
    public Student findById(Long id) {
        return store.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(store.values());
    }

}
